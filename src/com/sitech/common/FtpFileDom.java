package com.sitech.common;

import com.asiainfo.uap.util.des.EncryptInterface;
import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Profile.Section;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class FtpFileDom {
    private static final String newEnCoding = "UTF-8"; //写文件的默认编码字符集

    private static FtpFile ftpFile;
    private static final Logger log = LoggerFactory.getLogger(FtpFileDom.class);

    private static Map<String, Map<String, String>> seqProperties = new HashMap<String, Map<String, String>>();


    public static FtpFile getFtpFile() {
        return ftpFile;
    }

    public static void readFtpFile() {

        if (seqProperties == null || seqProperties.isEmpty()) {
            log.debug("@@@@@@@ init seqProperties @@@@@@");
            init();
        }

        if (ftpFile == null) {
            if (seqProperties != null && !seqProperties.isEmpty()) {
                Map<String, String> mapa = readFtpFile("BATCH_FUNC_FTP");
                ftpFile = new FtpFile();
                //Map<String, String> configMap = FtpFileConfig.getMap();

                ftpFile.setIp(mapa.get("HOSTIP"));
                ftpFile.setPort(Integer.parseInt(mapa.get("BATCH_FUNC_FTP_PROT").trim()));
                ftpFile.setName(mapa.get("HOSTUSER"));// 主机名称
                ftpFile.setPassword(mapa.get("HOSTPASSWD"));// 主机密码
                ftpFile.setDownLocal(mapa.get("BATCH_FUNC_FTP_DOWNLOCAL"));// 下载本地路径
                ftpFile.setSucLocalPath(mapa.get("BATCH_FUNC_FTP_SUCLOCALPATH"));// 校验正确文件本地路径
                ftpFile.setErrorLocalPath(mapa.get("BATCH_FUNC_FTP_ERRORLOCALPATH"));// 校验错误本地路径
                ftpFile.setFixPath(mapa.get("BATCH_FUNC_FTP_FIXPATH"));// 备份下载文件
            }
        }
    }

    //ftp配置文件读取
    public static Map<String, String> readFtpFile(String name) {

        if (seqProperties == null || seqProperties.isEmpty()) {
            log.debug("@@@@@@@ init seqProperties @@@@@@");
            init();
        }

        Map<String, String> outMap = new HashMap<String, String>();
        if (seqProperties != null && !seqProperties.isEmpty()) {
            Map<String, String> mapa = seqProperties.get(name);
            for (String key : mapa.keySet()) {
                String value = mapa.get(key);
                int nIdxB = value.indexOf("{");
                int nIdxE = value.indexOf("}");
                if (nIdxB != -1 && nIdxE != -1 && nIdxE > nIdxB) {
                    String flag_name = value.substring(nIdxB + 1, nIdxE);
                    value = getPwdFileDbPwd(flag_name, key);
                }
                System.out.println(key + ":" + value);
                outMap.put(key, value.trim());
            }
        }

        return outMap;
    }

    //根据传入的标签名和key取密码文件中的密文并解密返回
    private static String getPwdFileDbPwd(String flag_name, String key) {


        Map<String, String> mapa = (Map<String, String>) seqProperties.get("MAIN");

        String pwdFileName = mapa.get("PWDCFG");


        Ini ini = null;
        try {
            ini = new Ini(new File(pwdFileName));
        } catch (InvalidFileFormatException e) {

            e.printStackTrace();
            throw new IllegalStateException("-----读取密码文件失败");
        } catch (IOException e) {

            e.printStackTrace();
            throw new IllegalStateException("-----读取密码文件失败");
        }

        String value = "";
        // 读取密码配置文件中的用户名和密码

        Section section = ini.get(flag_name);
        if (null != section) {
            String password = ini.get(flag_name, key);

            System.out.println("--passwordconfig file:segment=" + flag_name
                    + ",key=" + key + "Pwd="
                    + password);

            if (!"HOSTIP".equals(key)) {
                value = EncryptInterface.desUnEncryptData(password);
            } else {
                value = password;
            }


        } else {
            throw new IllegalStateException("-----根据jndi name[" + flag_name + "]，在密码文件中没有找到与之对应的" + key + "段名，请修正！---");
        }

        return value;
    }

    private static void init() {
        //Map seqProperties = new HashMap<String, Map<String, String>>();
        BufferedReader in = null;
        try {
            String sPath = Thread.currentThread().getContextClassLoader().getResource("ftpfile.properties").getPath();
            in = new BufferedReader(new InputStreamReader(new FileInputStream(
                    java.net.URLDecoder.decode(sPath, "UTF-8"))));
            String sConfData = null;
            String sValueData = null;

            while ((sConfData = in.readLine()) != null) {
                if (!sConfData.equals("")) {
                    int nIdxB = sConfData.indexOf("[");
                    int nIdxE = sConfData.indexOf("]");
                    if (nIdxB != -1 && nIdxE != -1 && nIdxE > nIdxB) {
                        String sKey = sConfData.substring(nIdxB + 1, nIdxE);
                        Map<String, String> mapVal = new LinkedHashMap<String, String>();
                        while ((sValueData = in.readLine()) != null && sValueData.contains("=")) {
                            int nIdx = sValueData.indexOf("=");
                            if (nIdx != -1 && nIdx != sValueData.length() - 1) {
                                mapVal.put(sValueData.split("=")[0].trim(), sValueData.split("=")[1].trim());
                            }
                        }
                        seqProperties.put(sKey, mapVal);
                    }
                }

            }
            in.close();
        } catch (FileNotFoundException e1) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            e1.printStackTrace();


        } catch (IOException e2) {
            try {
                in.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
            e2.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

    /**
     * 生成三种文件 入参:生成的文件名（文件名生追加right,error,error_info），写文件的内容：正确的内容，错误的内容，错误明细的内容
     *
     * @param result
     * @throws IOException
     */
    public static void writTxt(String file_name, Map<String, String> result) throws IOException {

        String s = file_name.substring(0, file_name.lastIndexOf("."));
        String x = file_name.substring(file_name.lastIndexOf("."));

        if (result.get("RIGHT_STRING") != null && !"".equals((String) result.get("RIGHT_STRING"))) {
            String rightName = s + "_right" + x;// 校验正确文件名
            String suclLocalPath = ftpFile.getSucLocalPath();
            writFile(suclLocalPath, rightName, result.get("RIGHT_STRING"));
        }
        if (result.get("ERROR_STRING") != null && !"".equals((String) result.get("ERROR_STRING"))) {
            String errorName = s + "_error" + x;// 校验错误文件名
            String errorLocalPath = ftpFile.getErrorLocalPath();
            writFile(errorLocalPath, errorName, result.get("ERROR_STRING"));
        }
        if (result.get("ERROR_INFO_STRING") != null && !"".equals((String) result.get("ERROR_INFO_STRING"))) {
            String errorInfoName = s + "_error_info" + x;// 校验错误文件明细
            String errorLocalPath = ftpFile.getErrorLocalPath();
            writFile(errorLocalPath, errorInfoName, result.get("ERROR_INFO_STRING"));
        }

    }

    /**
     * 写文件
     *
     * @param localPath
     * @param file_name
     * @param file_info
     * @throws IOException
     */
    public static void writFile(String localPath, String file_name, String file_info) {

        if (localPath != null && !localPath.endsWith("/")) {
            localPath = localPath + "/";
            File path = new File(localPath);
            if (!path.exists()) {
                path.mkdirs();
            }
        }

        log.info("写文件地址：" + localPath);
        log.info("写文件名：" + file_name);

        BufferedWriter output = null;

        try {
            File rightTxt = new File(localPath + file_name);
            log.info("生成文件对像rightTxt：" + rightTxt.toString());
            if (rightTxt.exists()) {
                log.info("文件存在");
                rightTxt.delete();
            } else {
                log.info("文件不存在");
                rightTxt.createNewFile();
                // 不存在则创建 }
            }

//			output = new BufferedWriter(new FileWriter(localPath + file_name)); 按照UTF-8写文件 by zhangxina
            output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(localPath + file_name), newEnCoding));
            log.info("生成输入输出流");
            output.write(file_info);
            log.info("写入文件：" + localPath + file_name);
            output.close();
            log.info("完成写文件");
        } catch (IOException e) {
            log.info("写文件异常:" + e.getMessage());

            try {
                output.close();
            } catch (IOException e1) {
                log.info("关闭文件异常:" + e.getMessage());
                e1.printStackTrace();
            }
        }
    }

    /**
     * 判断文件是否存在，入参：路径，文件名
     *
     * @param path
     * @param file_name
     * @return
     */
    public static boolean isExistsFile(String path, String file_name) {
        if (path != null && !path.endsWith("/")) {
            path = path + "/";
            File pathFile = new File(path);
            if (!pathFile.exists()) {
                return false;
            }
        }

        File file = new File(path + file_name);
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 正确文件名称
     */
    public static String getRightFileName(String file_name) {
        String s = file_name.substring(0, file_name.lastIndexOf("."));
        String x = file_name.substring(file_name.lastIndexOf("."));
        return s + "_right" + x;
    }

    /**
     * 错误文件名称
     */
    public static String getErrorFileName(String file_name) {
        String s = file_name.substring(0, file_name.lastIndexOf("."));
        String x = file_name.substring(file_name.lastIndexOf("."));
        return s + "_error" + x;
    }

    /**
     * 错误明细文件名称
     */
    public static String getErrorInfoFileName(String file_name) {
        String s = file_name.substring(0, file_name.lastIndexOf("."));
        String x = file_name.substring(file_name.lastIndexOf("."));
        return s + "_error_info" + x;
    }

    /**
     * 上传生成的三种文件，文件名按默认的追加后缀
     *
     * @throws Exception
     */
    public static void uploadFile(String file_path, String file_name) throws Exception {
        FtpUtils f = new FtpUtils();
        f.setIp(ftpFile.getIp());
        f.setPort(ftpFile.getPort());
        f.setPwd(ftpFile.getPassword());
        f.setUser(ftpFile.getName());

        String rightName = getRightFileName(file_name);// 校验正确文件名
        String suclLocalPath = ftpFile.getSucLocalPath();
        if (isExistsFile(suclLocalPath, rightName)) {
            // String upRightPath=ftpFile.getSucUpPath();////上传文件不再新建目录直接放当前目录下
            uploadFileOpr(f, file_path, suclLocalPath, rightName);
        }

        String errorName = getErrorFileName(file_name);// 校验错误文件名
        String errorLocalPath = ftpFile.getErrorLocalPath();
        if (isExistsFile(errorLocalPath, errorName)) {
            // String upErrorPath=ftpFile.getErrorUpPath();//上传文件不再新建目录直接放当前目录下
            uploadFileOpr(f, file_path, errorLocalPath, errorName);
        }

        String errorInfoName = getErrorInfoFileName(file_name);// 校验错误文件明细
        if (isExistsFile(errorLocalPath, errorInfoName)) {
            // String upErrorPath=ftpFile.getErrorUpPath();//上传文件不再新建目录直接放当前目录下
            uploadFileOpr(f, file_path, errorLocalPath, errorInfoName);
        }

		/*
         * if(isExistsFile(ftpFile.getDownLocal(),file_name)){
		 * uploadFileOpr(f,ftpFile
		 * .getBackPath(),ftpFile.getDownLocal(),file_name); }
		 */// 不备份下载文件由前台备份

    }

    /**
     * 上传文件操作
     *
     * @param f
     * @param toPath
     * @param fromPath
     * @param fileName
     * @throws Exception
     */
    private static void uploadFileOpr(FtpUtils f, String toPath, String fromPath, String fileName) throws Exception {

        try {
            // 连接FTP
            if (f.connectServer()) {
                // 上传文件
                f.uploadFile(toPath, fromPath, fileName);
            }
        } catch (Exception e) {

            throw new Exception("上传" + fileName + "文件错误");

        } finally {
            try {
                f.closeServer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 上传指定文件到指定路径
     */
    public static void uploadFileOpr(String toPath, String fromPath, String fileName) throws Exception {
        FtpUtils f = new FtpUtils();
        f.setIp(ftpFile.getIp());
        f.setPort(ftpFile.getPort());
        f.setPwd(ftpFile.getPassword());
        f.setUser(ftpFile.getName());

        try {
            // 连接FTP
            if (f.connectServer()) {
                // 上传文件
                f.uploadFile(toPath, fromPath, fileName);
            }
        } catch (Exception e) {

            throw new Exception("上传" + fileName + "文件错误");

        } finally {
            try {
                f.closeServer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 将前台上传的文件下载到本地
     *
     * @throws Exception
     */
    public static File downloadFile(String ftpPath, String file_name) throws Exception {
        FtpUtils f = new FtpUtils();
        f.setIp(ftpFile.getIp());
        f.setPort(ftpFile.getPort());
        f.setPwd(ftpFile.getPassword());
        f.setUser(ftpFile.getName());
        File file = null;
        try {
            // 连接FTP
            if (f.connectServer()) {
                // 下载文件
                file = f.downloadFile(ftpPath, ftpFile.getDownLocal(), file_name);
            }
        } catch (Exception e) {

            throw new Exception(e.getMessage());

        } finally {
            try {
                f.closeServer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return file;

    }

    /**
     * 删除默认下载路径下文件
     *
     * @param file_name
     * @throws Exception
     */
    public static void deleteFtpFile(String file_name) throws Exception {
        deleteFile(ftpFile.getDownPath(), file_name);
    }

    /**
     * 删除指定文件
     */
    public static void deleteFile(String Path, String fileName) throws Exception {
        FtpUtils f = new FtpUtils();
        f.setIp(ftpFile.getIp());
        f.setPort(ftpFile.getPort());
        f.setPwd(ftpFile.getPassword());
        f.setUser(ftpFile.getName());

        try {
            // 连接FTP
            if (f.connectServer()) {
                // 文件删除
                f.deleteFilesMatchRegex(Path, fileName);
            }
        } catch (Exception e) {

            throw new Exception("上传" + fileName + "文件错误");

        } finally {
            try {
                f.closeServer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 删除本地校验文件
     *
     * @throws Exception
     */
    @SuppressWarnings("unused")
    public static void delLocalFile(String file_name) throws Exception {

        File file = null;

        String s = file_name.substring(0, file_name.lastIndexOf("."));
        String x = file_name.substring(file_name.lastIndexOf("."));

        String fileName = file_name;// 删除下载的原文件
        String downLocal = ftpFile.getDownLocal();
        if (isExistsFile(downLocal, fileName)) {
            delFileOpr(downLocal, fileName);
        }

        String rightName = getRightFileName(file_name);// 删除生成的正确文件
        String sucLocalPath = ftpFile.getSucLocalPath();
        if (isExistsFile(sucLocalPath, rightName)) {
            delFileOpr(sucLocalPath, rightName);
        }

        String errorName = getErrorFileName(file_name);// 删除生的错误明细文件
        String errorLocalPath = ftpFile.getErrorLocalPath();
        if (isExistsFile(errorLocalPath, errorName)) {
            delFileOpr(errorLocalPath, errorName);
        }

        String errorInfoName = getErrorInfoFileName(file_name);// 删除生成的错误明细文件
        if (isExistsFile(errorLocalPath, errorInfoName)) {
            delFileOpr(errorLocalPath, errorInfoName);
        }

    }

    /**
     * 删除文件
     *
     * @param file_name 文本文件完整绝对路径及文件名
     * @return Boolean 成功删除返回true遭遇异常返回false
     */
    public static boolean delFileOpr(String localPath, String file_name) {

        if (localPath != null && !localPath.endsWith("/")) {
            localPath = localPath + "/";
            File path = new File(localPath);
            if (!path.exists()) {
                path.mkdirs();
            }
        }

        String filePathAndName = localPath + file_name;

        boolean bea = false;
        String filePath = filePathAndName;
        File myDelFile = new File(filePath);
        if (myDelFile.exists()) {
            bea = myDelFile.delete();
        }
        return bea;
    }

}

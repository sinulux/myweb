package com.sitech.common.utils;

public class ObfuscationUtil {
    /**
     * 敏感信息模糊化
     *
     * @param inParam
     * @return
     * @throws Exception
     */
    public static String obfuscation(String inParam) {
        StringBuffer sb = new StringBuffer();
        String string = inParam.substring(0, 1);
        for (int i = 1; i < inParam.length(); i++) {
            sb.append("*");
        }
        return string.concat(sb.toString());
    }

    private ObfuscationUtil() {

    }

}

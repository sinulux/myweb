package com.sitech.common;

public final class Constants {
    public static final String DATASYN_TABLES = "TABLES"; // TABLES
    public static final String DATASYN_TABLENAME = "TABLENAME"; // TABLENAME
    public static final String DATASYN_SUFFIX = "SUFFIX"; // SUFFIX
    public static final String DATASYN_DATARECORDS = "DATARECORDS"; // DATARECORDS
    public static final String DATASYN_OP = "OP"; // OP
    public static final String DATASYN_COLS = "COLS"; // COLS
    public static final String DATASYN_PK = "PK"; // PK
    public static final String FINISH_FLAG_N = "N"; // N
    public static final String BILL_DAY_FLAG_N = "N"; // N
    public static final String STR_1 = "1"; // 1
    public static final String BILL_FLAG_Y = "Y"; // Y
    public static final String BILL_FLAG_N = "N"; // N
    public static final int ACCEPT_TYPE_6 = 6; // 6
    public static final String SMS_PREFIX = "MSG=";
    public static final String BS_CHN_CODE = "11";
    public static final String MASTER_SERV_ID_1001 = "1001";
    //	public static final String SEQ_UR_USERSTATE="14"; ///* 用户状态序列 */
    public static final String PROVIENCE = "10017"; //安徽省份代码

    public static final String FINISH_FLAG = "N"; //资料确认标识:N
    public static final String EXP_DATE = "20991231"; //失效时间默认20991231

    /**
     * add by wuran2017.5.6 start
     */
    public static final String ANHUI_PROVIENCE_OLD = "100170";//安徽省份代码
    public static final String ANHUI_PROVIENCE = "10017";//安徽省份代码
    public static final String ORDER_SPLIT_STR = "~";
    /**
     * add by wuran2017.5.6 start
     */
    public static final int ORD_BILLTYPE_MBILL = 1;    //票据、免填单类型：免填单
    public static final int ORD_BILLTYPE_INVOICE = 2;    //票据、免填单类型：发票
    public static final int ORD_BILLTYPE_RECEIPT = 3;    //票据、免填单类型：收据
    public static final int ORD_BILLTYPE_PREFEE = 4;    //票据、免填单类型：营业预存发票
    public static final int ORD_BILLTYPE_ONEFEE = 5;    //票据、免填单类型：营业受理发票

    public static final String ORD_INVOICE_VALID = "Y";        //有效
    public static final String ORD_INVOICE_INVALID = "C";        //已作废
    public static final String ORD_INVOICE_RED = "H";            //已打红票
    public static final String ORD_INVOICE_CHANGE = "Z";        //已兑换增值税发票
    public static final String ORD_INVOICE_FEEBACK = "B";        //已退费
    public static final String ORD_INVOICE_ELEC_INIT = "N";    //电子发票未开具(开具中/开具失败)

    public static final String ORDL_PAYTYPE_CASH = "0";            //现金 (订单行的费用缴费方式)

    public static final String CRM_BILL_ELEC_INV_HEAD = "C";    //CRM为C开头
    public static final String BOSS_BILL_ELEC_INV_HEAD = "B";    //BOSS为B开头

    public static final String ORD_BILL_TYPE_PAPER = "Z";        //纸质
    public static final String ORD_BILL_TYPE_ELEC = "0";        //电子(无纸化)

    public static final String ORD_BILL_CUST_INV_OTH = "04";        //其他

    /**add by wuran2017.5.2**/
    /**
     * 批量订单业务暂不支撑!
     */
    public static final String EXCEPTION_TYPE_QUANTI_ORDER_OFFER = "10010040201065005";
    /**
     * 根据GROUP_ID和PARENT_LEVEL查询bs_chngroup_rel信息为空！
     */
    public static final String EXCEPTION_TYPE_BSCHNGROUPREL_QUERY = "10010040201065006";
    /**
     * pubOrderBusiDeal入参中CONTACT_ID不能为0！
     */
    public static final String EXCEPTION_TYPE_CONTACT_ID_0 = "10010040201065007";
    /**
     * 根据region_id查询bsPoliRegionDict结果不能为空！
     */
    public static final String EXCEPTION_TYPE_BSPOLIREGIONDICT_QUERY = "10010040201065008";
    /**
     * BUSIINFO节点不能为null！
     */
    public static final String EXCEPTION_TYPE_BUSIINFO_NULL = "10010040201065009";
    /**
     * 根据SERVICE_OFFER_ID查询qrySvcOfferByServiceOfferId为空！
     */
    public static final String EXCEPTION_TYPE_PDSVCOFFERDICT_QUERY = "10010040201065010";
    /**
     * 根据PARAM_ID查询BS_SYSCTRLPARAM_DICT表查询为空！
     */
    public static final String EXCEPTION_TYPE_BSSYSCTRLPARAMDICT_QUERY = "10010040201065011";
    /**
     * 根据WEB_SUFFIX查询bs_partitioncode_dict表查询为空！
     */
    public static final String EXCEPTION_TYPE_BSPARTITIONCODEDICT_QUERY = "10010040201065012";
    /**
     * 根据CODE_CLASS和CODE_NAME查询qryOrUniCodeDefByConde 订单统一代码表配置为空！
     */
    public static final String EXCEPTION_TYPE_ORUNICODEDEF_QUERY = "10010040201065013";
    /**
     * pubOrderBusiDeal入参中REQUEST_INFO和MSG_TYPE节点不能为null!
     */
    public static final String EXCEPTION_TYPE_REQUESTINFO_MSGTYPE_NULL = "10010040201065004";
    /**
     * 批量业务的RECORD_PATH节点必须存在，请确认批量业务是否含有节点RECORD_PATH!
     */
    public static final String EXCEPTION_TYPE_RECORD_PATH_NULL = "10010040201065029";
    /**
     * 批量业务的RECORD_LIST节点必须存在，请确认批量业务是否含有节点RECORD_LIST!
     */
    public static final String EXCEPTION_TYPE_RECORD_LIST_NULL = "10010040201065030";
    /**
     * 批量业务的DOC_SEQ节点必须存在，请确认批量业务是否含有节点DOC_SEQ!
     */
    public static final String EXCEPTION_TYPE_DOC_SEQ_NULL = "10010040201065031";
    /**
     * 批量业务的RECORD_PATH节点中替换的节点值暂时只支持BUSI_MODEL.VALUE!
     */
    public static final String EXCEPTION_TYPE_RECORD_PATH_VALUE = "10010040201065032";

    /**
     * 订单已撤单或已冲正不能进行票据的补打!
     */
    public static final String EXCEPTION_TYPE_ORDERELT_REMORBACK = "10010040201060017";

    /**
     * 订单票据已达到最大打印次数，不允许打印!
     */
    public static final String EXCEPTION_TYPE_ORDERELT_MAXRECORD = "10010040201060018";

    /**
     * 对不起！发票作废必须输入发票信息INVOICE_INFO节点！
     */
    public static final String EXCEPTION_TYPE_ORDERBLANKOUT_INVOICEINFO = "10010040201060019";

    /**
     * 对不起！没有可供作废的发票或者发票已经作废！
     */
    public static final String EXCEPTION_TYPE_ORDERBLANKOUT_INVOICENULL = "10010040201060020";

    /**
     * 对不起！输入的将要作废的发票号不存在!
     */
    public static final String EXCEPTION_TYPE_ORDERBLANKOUT_INVOICENONULL = "10010040201060021";

    /**
     * 对不起！打印红票必须输入发票信息INVOICE_INFO节点！
     */
    public static final String EXCEPTION_TYPE_ORDERRED_INVOICEINFO = "10010040201060022";

    /**
     * 对不起！不能生成有效的红票，原发票号不存在或者未打印或者已经作废！
     */
    public static final String EXCEPTION_TYPE_ORDERRED_INVOICENULL = "10010040201060023";

    /**
     * 对不起！系统已经生成红票不能再次生成，请进行补打操作！
     */
    public static final String EXCEPTION_TYPE_ORDERRED_INVOICENOTNULL = "10010040201060024";

    /*
     * boss服务dump对应错误码
     * add by taoyz 20170823
     * */
    public static final String ORD_BILL_ELEC_ERRCODE_NO_SER = "10010020004000006";
    /*
     * min-number
     * add by taoyz 20170823
     * */
    public static final String ORD_BILL_ELEC_ERRCODE_MIN = "10111020000466000";
    /*
     *max-number
     * add by taoyz 20170823
     * */
    public static final String ORD_BILL_ELEC_ERRCODE_MAX = "10111020000466999";
    /*
     *boss服务数据唯一性错误
     *add by taoyz 20170823
     * */
    public static final String ORD_BILL_ELEC_DATA_CONSTRAINT = "10111020000466017";
    /*
     *BOSS服务报错
     *add by taoyz 20170823
     * */
    public static final String ORD_BILL_ELEC_BOSS_ERR = "10011101000000013";
    /*
     *税控系统服务报错
     *add by taoyz 20170823
     * */
    public static final String ORD_BILL_ELEC_TAX_ERR = "10011101000000014";
    /*
     * add by taoyz 20170823
     * */
    public static final String ORD_BILL_ELEC_BOSS_NOINV_ERR = "10111020000466141";
    /*
     * 批量订单类型定义包括：1: 立即生成订单，2: 异步生成订单
     */
    public static final int ORD_BATCH_SYNC = 1;//立即生成订单
    public static final int ORD_BATCH_ASYNC = 2;//异步生成订单
    /*
     * 主产品实例类型定义包括：客户ID，服务号码，用户ID，帐户ID，工号标识 4种
     */
    public static final int CUSTID_TYPE_CUST = 0;     /*客户ID*/
    public static final int CUSTID_TYPE_SERVICENO = 1;     /*服务号码*/
    public static final int CUSTID_TYPE_IDNO = 2;     /*用户ID*/
    public static final int CUSTID_TYPE_ACCOUNT = 3;     /*帐户ID*/
    public static final int CUSTID_TYPE_LOGINNO = 4;     /*工号标识*/
    /*
     * 订单路由类型包括：按客户标识路由、按用户标识路由、按账户标识路由
     */
    public static final int ORD_ROUTE_CUST = 13;
    public static final int ORD_ROUTE_IDNO = 11;
    public static final int ORD_ROUTE_ACCOUNT = 12;
    /*
     * 序列号类型定义
     */
    public static final int SEQ_CART_ID = 1;//序列类型6:系统流水
    public static final int SEQ_ORDER_ID = 2;//序列类型6:系统流水
    public static final int SEQ_ORDER_LINE_ID = 3;//序列类型6:系统流水
    public static final int SEQ_ORDER_CHG = 4;//序列类型6:系统流水
    public static final int SEQ_ORDER_LINE_CHG = 5;//序列类型6:系统流水
    public static final int SEQ_LOGIN_ACCEPT = 6;//序列类型6:系统流水
    public static final int SEQ_CUST_ID = 7;
    public static final int SEQ_USER_ID = 8;
    public static final int SEQ_CONTRACT_NO = 9;
    public static final int SEQ_ORDER_LINE_SLA = 10;
    public static final int SEQ_ORDER_LINE_BOOK = 11;
    public static final int SEQ_ORDER_LINE_EXCP = 12;
    public static final int SEQ_ORDER_LINE_EXEC = 17;
    public static final int SEQ_UR_BILLMODE = 28;/*13 付费模式序列*/
    public static final int SEQ_UR_USERSTATE = 29;/*14 用户状态序列*/
    public static final int SEQ_CT_CONTACTID = 6;/*15 客户联系信息*/
    public static final int SEQ_UR_ADDNBRID = 27; /*16 接入号标识  */
    public static final int SEQ_IA_CONTACTID = 20;/*20 统一接触序列类型 */
    public static final int SEQ_CT_UNITID = 1;/*18 集团编码  */
    public static final int SEQ_CT_GRPDEPTID = 6;/*19 集团部门标识  */
    public static final int SEQ_CT_ADDRESSNO = 6;/*20 集团通信录编码  */
    public static final int SEQ_AC_ACCTID = 30;/*21 账务标识序列*/
    public static final int SEQ_CT_CUSTRELID = 6;/*22 客户关系标识  */
    public static final int SEQ_CT_SPCDAYNO = 6;/*24 关键日期标识  */
    public static final int SEQ_CT_BLACKCUST = 60;/*欠费销户  黑名单序列*/
    /*
     * 当传入的值是REQUIRE_GEN_SEQ需要内部生成序列
     */
    public static final long REQUIRE_GEN_SEQ = -1;
    /*
     *订单，订单行查询历史标志定义
     *订单，订单行查询历史标志包括： 0 当前，1只查历史，2查历史和当前
     */
    public static final int QUERY_FLAG_CURRENT = 0; /*当前*/
    public static final int QUERY_FLAG_HISTORY = 1; /*只查历史*/
    public static final int QUERY_FLAG_ALL = 2;  /*查历史和当前*/
    /*
     * 定义订单处理系统参数标识
     */
    public static final String ORD_PARAM_DOCCREATESYNC = "1";    /*资料创建同步执行*/
    public static final String ORD_PARAM_FBILLPRTCNT = "2";    /*免填单打印次数*/
    public static final String ORD_PARAM_INVOICEPRTCNT = "3";    /*发票打印次数*/
    public static final String ORD_PARAM_RECEIPTPRTCNT = "4";   /*收据打印次数*/
    public static final String ORD_PARAM_PRINTSQLFLAG = "5";    /*是否打印sql标志*/
    public static final String ORD_PARAM_OPNOTEFLAG = "6";    /*OP_NOTE为空处理*/
    public static final String ORD_PARAM_AUTHENFLAG = "7";    /*AUTHEN_NAME为空处理*/
    public static final String ORD_PARAM_TIMEDISTANCE = "8";   /*防止重复提交时间间隔*/
    public static final String ORD_PARAM_BILLPREFEE = "11";   /*营业预存发票打印次数*/
    public static final String ORD_PARAM_BILLONEFEE = "12";   /*营业受理发票打印次数*/
    public static final String ORD_PARAM_PROVINCE = "13";   /*订单处理程序省代码区分*/
    public static final String ORD_PARAM_FEETAXFLAG = "14";   /*判断营改增价税分离开关*/
    /*
     * 订单类型定义
     * 订单类型包括：预订单，正常订单，冲正订单
     */
    public static final int ORD_TYPE_UNKNOWN = 0;
    public static final int ORD_TYPE_BOOKING = 1;
    public static final int ORD_TYPE_NORMAL = 2;
    public static final int ORD_TYPE_BACK = 3;
    /*
     * 定义票据类型 or_PrintBillType_dict
     */
    /*
     * 动作执行规则中，业务处理函数类型定义
     */
    public static final int BO_ARMT_MBILL = 1;           /*免填单生成回调函数*/
    public static final int BO_ARMT_INVOICE = 11;          /*发票生成回调函数*/
    public static final int BO_ARMT_RECEIPT = 12;          /*收据生成回调函数*/
    public static final int BO_ARMT_ON = 2;               /*服务开通拼报文回调函数*/
    public static final int BO_ARMT_DOC = 3;                 /*资料生成回调函数*/
    public static final int BO_ARMT_FINISH = 4;                 /*业务竣工回调函数*/
    public static final int BO_ARMT_WITHDRAW = 5;                 /*业务撤单回调函数*/
    public static final int BO_ARMT_AUDIT = 6;                 /*业务审核回调函数*/
    public static final int BO_ARMT_BOSS = 7;           /*BOSS同步拼报文回调函数*/
    public static final int BO_ARMT_BACK = 8;           /*冲正拼报文回调函数*/
    public static final int BO_ARMT_EXCP = 9;           /*订单行异常回调函数*/
    public static final int BO_ARMT_ORDERFINISH = 10;          /*订单竣工回调函数*/
    // add by guopl 2010-09-27
    public static final int BO_ARMT_BATH_CHECK = 13;          /*批量校验回调函数*/

    /*
     * 订单行结束状态定义参考表：or_OrdFnshFlag_dict
     * 订单行结束状态包括：未竣工，竣工，撤单，删除，锁定，冲正
     */
    public static final String ORDL_ENDSTATUS_RUNING = "N";   /*未竣工*/
    public static final String ORDL_ENDSTATUS_FINISH = "Y";   /*竣工*/
    public static final String ORDL_ENDSTATUS_REMOVE = "C";   /*撤单*/
    public static final String ORDL_ENDSTATUS_DEL = "D";   /*删除*/
    public static final String ORDL_ENDSTATUS_LOCK = "L";   /*锁定*/
    public static final String ORDL_ENDSTATUS_BACK = "B";   /*冲正*/

    /**add by wuran2017.5.2 end**/
    /**
     * @Description: 序列常量 序列配置文件在config下的seq.config
     * @author: haoxz
     * @createTime: 2014-9-11 下午5:20:53
     */
    public interface SEQUENCE {
        public static final String SEQ_AC_ACCTID = "SEQ_AC_ACCTID"; /* 账务标识序列 */
        public static final String SEQ_CS_BATCHPLANID = "SEQ_CS_BATCHPLANID"; /* 批量执行计划 */
        public static final String SEQ_PUB_LOGINACCEPT = "SEQ_PUB_LOGINACCEPT";/* 三户库存计划 */
        public static final String SEQ_OUTER_INBATCH = "SEQ_OUTER_INBATCH";/* 工单操作流水 */
        public static final String SEQ_MARKET_ID = "SEQ_MARKET_ID";/* 工单操作流水 */
    }

    public interface Entity {
        /**
         * 操作类型
         */
        public static final String UPDATE_TYPE_INSERT = "I";// 新增

        public static final String UPDATE_TYPE_UPDATE = "U";// 修改

        public static final String UPDATE_TYPE_DELETE = "D";// 删除

        public static final String UPDATE_TYPE_UNCHENG = "X";// 不变
    }
}

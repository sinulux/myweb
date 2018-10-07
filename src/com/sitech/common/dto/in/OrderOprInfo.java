/**
 * File：OrderOprInfo.java
 * <p>
 * Version：
 * Date：2014年11月5日
 * Copyright Clarify:
 */

package com.sitech.common.dto.in;

import com.alibaba.fastjson.annotation.JSONField;
import com.sitech.common.dto.Decodeable;
import com.sitech.common.dto.Encodeable;
import com.sitech.common.utils.StringUtils;
import com.sitech.jcfx.anno.ConsType;
import com.sitech.jcfx.anno.ParamDesc;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 订单管理调用服务的OPR_INFO
 * @createTime: 2014年11月5日 上午11:19:50
 */

public class OrderOprInfo implements Decodeable, Encodeable {

    @JSONField(name = "CHANNEL_TYPE")
    @ParamDesc(path = "CHANNEL_TYPE", cons = ConsType.CT001, len = "100", desc = "渠道类型", type = "String", memo = "略")
    private String channelType;

    @JSONField(name = "OP_CODE")
    @ParamDesc(path = "OP_CODE", cons = ConsType.CT001, len = "100", desc = "操作代码", type = "String", memo = "略")
    private String opCode;

    @JSONField(name = "OP_NOTE")
    @ParamDesc(path = "OP_NOTE", cons = ConsType.QUES, len = "100", desc = "操作备注", type = "String", memo = "略")
    private String opNote;

    @JSONField(name = "CUST_ID_TYPE")
    @ParamDesc(path = "CUST_ID_TYPE", cons = ConsType.CT001, len = "100", desc = "ID类别", type = "String", memo = "略")
    private String custIdType;

    @JSONField(name = "CUST_ID_VALUE")
    @ParamDesc(path = "CUST_ID_VALUE", cons = ConsType.CT001, len = "100", desc = "ID类别的值", type = "String", memo = "略")
    private String custIdValue;

    @JSONField(name = "SERVICE_NO")
    @ParamDesc(path = "SERVICE_NO", cons = ConsType.CT001, len = "100", desc = "服务号码", type = "String", memo = "略")
    private String serviceNo;

    @JSONField(name = "CREATE_TIME")
    @ParamDesc(path = "CREATE_TIME", cons = ConsType.QUES, len = "100", desc = "创建时间", type = "String", memo = "略")
    private String createTime;

    @JSONField(name = "AUTHEN_CODE")
    @ParamDesc(path = "AUTHEN_CODE", cons = ConsType.QUES, len = "100", desc = "认证方式编码", type = "String", memo = "略")
    private String authenCode;

    @JSONField(name = "AUTHEN_NAME")
    @ParamDesc(path = "AUTHEN_NAME", cons = ConsType.QUES, len = "100", desc = "认证方式名称", type = "String", memo = "略")
    private String authenName;

    @JSONField(name = "LOGIN_ACCEPT")
    @ParamDesc(path = "LOGIN_ACCEPT", cons = ConsType.QUES, len = "100", desc = "订单行流水", type = "String", memo = "略")
    private String loginAccept;

    @JSONField(name = "OUT_ORDER_ID")
    @ParamDesc(path = "OUT_ORDER_ID", cons = ConsType.QUES, len = "100", desc = "外部订单号", type = "String", memo = "略")
    private String outOrderId;

    @JSONField(name = "LOGIN_NO")
    @ParamDesc(path = "LOGIN_NO", cons = ConsType.CT001, len = "100", desc = "操作工号", type = "String", memo = "略")
    private String loginNo;

    @JSONField(name = "REGION_ID")
    @ParamDesc(path = "REGION_ID", cons = ConsType.CT001, len = "100", desc = "地市编码", type = "String", memo = "略")
    private String regionId;

    @JSONField(name = "CONTACT_ID")
    @ParamDesc(path = "CONTACT_ID", cons = ConsType.CT001, len = "100", desc = "接触ID", type = "String", memo = "略")
    private String contactId;

    @JSONField(name = "GROUP_ID")
    @ParamDesc(path = "GROUP_ID", cons = ConsType.CT001, len = "100", desc = "部门编码", type = "String", memo = "略")
    private String groupId;

    @JSONField(name = "ORDER_LINE_ID")
    @ParamDesc(path = "ORDER_LINE_ID", cons = ConsType.QUES, len = "100", desc = "订单行ID", type = "String", memo = "略")
    private String orderLineId;

    @JSONField(name = "APPLY_ID")
    @ParamDesc(path = "APPLY_ID", cons = ConsType.CT001, len = "100", desc = "授权申请编码", type = "String", memo = "")
    private String applyId;

    @JSONField(name = "ORDER_ID")
    @ParamDesc(path = "ORDER_ID", cons = ConsType.CT001, len = "100", desc = "订单号", type = "String", memo = "")
    private String orderId;

    @JSONField(name = "IP_ADDRESS")
    @ParamDesc(path = "IP_ADDRESS", cons = ConsType.CT001, len = "100", desc = "订单号", type = "String", memo = "")
    private String ipAddress;

    @JSONField(name = "LOGIN_PWD")
    @ParamDesc(path = "LOGIN_PWD", cons = ConsType.CT001, len = "100", desc = "订单号", type = "String", memo = "")
    private String loginPwd;

    @JSONField(name = "IS_WEB")
    @ParamDesc(path = "IS_WEB", cons = ConsType.CT001, len = "100", desc = "订单号", type = "String", memo = "")
    private String isWeb;

    public String getChannelType() {
        return channelType;
    }

    public String getOpCode() {
        return opCode;
    }

    public String getOpNote() {
        return opNote;
    }

    public String getCustIdType() {
        return custIdType;
    }

    public String getCustIdValue() {
        return custIdValue;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getAuthenCode() {
        return authenCode;
    }

    public String getAuthenName() {
        return authenName;
    }

    public String getLoginAccept() {
        return loginAccept;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public String getLoginNo() {
        return loginNo;
    }

    public String getRegionId() {
        return regionId;
    }

    public String getContactId() {
        return contactId;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getOrderLineId() {
        return orderLineId;
    }

    public String getApplyId() {
        return applyId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public String getIsWeb() {
        return isWeb;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public void setOpNote(String opNote) {
        this.opNote = opNote;
    }

    public void setCustIdType(String custIdType) {
        this.custIdType = custIdType;
    }

    public void setCustIdValue(String custIdValue) {
        this.custIdValue = custIdValue;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setAuthenCode(String authenCode) {
        this.authenCode = authenCode;
    }

    public void setAuthenName(String authenName) {
        this.authenName = authenName;
    }

    public void setLoginAccept(String loginAccept) {
        this.loginAccept = loginAccept;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public void setLoginNo(String loginNo) {
        this.loginNo = loginNo;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public void setIsWeb(String isWeb) {
        this.isWeb = isWeb;
    }

    @Override
    public void decode(Map in) {
        this.setChannelType(StringUtils.objToString(in.get("CHANNEL_TYPE")));
        this.setOpCode(StringUtils.objToString(in.get("OP_CODE")));
        this.setOpNote(StringUtils.objToString(in.get("OP_NOTE")));
        this.setCustIdType(StringUtils.objToString(in.get("CUST_ID_TYPE")));
        this.setCustIdValue(StringUtils.objToString(in.get("CUST_ID_VALUE")));
        this.setServiceNo(StringUtils.objToString(in.get("SERVICE_NO")));
        this.setCreateTime(StringUtils.objToString(in.get("CREATE_TIME")));
        this.setAuthenCode(StringUtils.objToString(in.get("AUTHEN_CODE")));
        this.setAuthenName(StringUtils.objToString(in.get("AUTHEN_NAME")));
        this.setLoginAccept(StringUtils.objToString(in.get("LOGIN_ACCEPT")));
        this.setOutOrderId(StringUtils.objToString(in.get("OUT_ORDER_ID")));
        this.setLoginNo(StringUtils.objToString(in.get("LOGIN_NO")));
        this.setRegionId(StringUtils.objToString(in.get("REGION_ID")));
        this.setContactId(StringUtils.objToString(in.get("CONTACT_ID")));
        this.setGroupId(StringUtils.objToString(in.get("GROUP_ID")));
        this.setOrderLineId(StringUtils.objToString(in.get("ORDER_LINE_ID")));
        this.setApplyId(StringUtils.objToString(in.get("APPLY_ID")));
        this.setOrderId(StringUtils.objToString(in.get("ORDER_ID")));
        this.setIpAddress(StringUtils.objToString(in.get("IP_ADDRESS")));
        this.setLoginPwd(StringUtils.objToString(in.get("LOGIN_PWD")));
        this.setIsWeb(StringUtils.objToString(in.get("IS_WEB")));
    }

    @Override
    public Map encode() {
        Map<String, Object> map = new HashMap<String, Object>();
        if (this.getServiceNo() != null) {
            map.put("SERVICE_NO", this.getServiceNo());
        }
        if (this.getRegionId() != null) {
            map.put("REGION_ID", this.getRegionId());
        }
        if (this.getOutOrderId() != null) {
            map.put("OUT_ORDER_ID", this.getOutOrderId());
        }
        if (this.getOrderLineId() != null) {
            map.put("ORDER_LINE_ID", this.getOrderLineId());
        }
        if (this.getOrderId() != null) {
            map.put("ORDER_ID", this.getOrderId());
        }
        if (this.getOpNote() != null) {
            map.put("OP_NOTE", this.getOpNote());
        }
        if (this.getOpCode() != null) {
            map.put("OP_CODE", this.getOpCode());
        }
        if (this.getLoginPwd() != null) {
            map.put("LOGIN_PWD", this.getLoginPwd());
        }
        if (this.getLoginNo() != null) {
            map.put("LOGIN_NO", this.getLoginNo());
        }
        if (this.getLoginAccept() != null) {
            map.put("LOGIN_ACCEPT", this.getLoginAccept());
        }
        if (this.getIpAddress() != null) {
            map.put("IP_ADDRESS", this.getIpAddress());
        }
        if (this.getGroupId() != null) {
            map.put("GROUP_ID", this.getGroupId());
        }
        if (this.getCustIdValue() != null) {
            map.put("CUST_ID_VALUE", this.getCustIdValue());
        }
        if (this.getCustIdType() != null) {
            map.put("CUST_ID_TYPE", this.getCustIdType());
        }
        if (this.getCreateTime() != null) {
            map.put("CREATE_TIME", this.getCreateTime());
        }
        if (this.getContactId() != null) {
            map.put("CONTACT_ID", this.getContactId());
        }
        if (this.getChannelType() != null) {
            map.put("CHANNEL_TYPE", this.getChannelType());
        }
        if (this.getAuthenName() != null) {
            map.put("AUTHEN_NAME", this.getAuthenName());
        }
        if (this.getAuthenCode() != null) {
            map.put("AUTHEN_CODE", this.getAuthenCode());
        }
        if (this.getApplyId() != null) {
            map.put("APPLY_ID", this.getApplyId());
        }
        if (this.getIsWeb() != null) {
            map.put("IS_WEB", this.getIsWeb());
        }
        return map;
    }

}

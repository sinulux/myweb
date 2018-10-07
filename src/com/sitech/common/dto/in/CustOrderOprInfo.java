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
import com.sitech.common.utils.StringUtils;
import com.sitech.jcfx.anno.ConsType;
import com.sitech.jcfx.anno.ParamDesc;
import org.eclipse.jetty.util.log.Log;

import java.util.Map;

/**
 * @Description: 订单管理调用服务的OPR_INFO
 * @createTime: 2014年11月5日 上午11:19:50
 */

public class CustOrderOprInfo implements Decodeable {

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
    private String custTypeId;

    @JSONField(name = "CUST_ID_VALUE")
    @ParamDesc(path = "CUST_ID_VALUE", cons = ConsType.CT001, len = "100", desc = "ID类别的值", type = "String", memo = "略")
    private String custTypeValue;

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

    @JSONField(name = "NEW_OP_CODE")
    @ParamDesc(path = "NEW_OP_CODE", cons = ConsType.CT001, len = "100", desc = "新的操作代码", type = "String", memo = "")
    private String newOpCode;

    @ParamDesc(path = "BUY_AUTHEN_CODE", cons = ConsType.CT001, type = "int", len = "40", desc = "证件输入方式", memo = "略")
    private Integer buyAuthenCode;

    @ParamDesc(path = "BUY_ICCID", cons = ConsType.CT001, type = "String", len = "40", desc = "代办人证件", memo = "略")
    private String buyIccId;

    @ParamDesc(path = "BUY_NAME", cons = ConsType.CT001, type = "String", len = "40", desc = "经办人", memo = "略")
    private String buyName;

    @ParamDesc(path = "BUY_REMARK", cons = ConsType.CT001, type = "String", len = "40", desc = "经办人备注", memo = "略")
    private String buyRemark;

    @ParamDesc(path = "LOGIN_PWD", cons = ConsType.CT001, type = "String", len = "40", desc = "工号密文密码", memo = "略")
    private String loginPwd;

    @ParamDesc(path = "MASTER_SERV_ID", cons = ConsType.CT001, type = "String", len = "40", desc = "主体服务类型", memo = "略")
    private String masterServId;

    @ParamDesc(path = "ID_NO", cons = ConsType.CT001, type = "Long", len = "40", desc = "用户标示", memo = "略")
    private Long idNo;

    @ParamDesc(path = "CUST_ID", cons = ConsType.CT001, type = "Long", len = "40", desc = "客户ID", memo = "略")
    private Long custId;

    @ParamDesc(path = "CONTACT_NO", cons = ConsType.CT001, type = "Long", len = "40", desc = "账户标识", memo = "略")
    private Long contractNo;

    @Override
    public void decode(Map in) {
        Log.debug("-------in ---------" + in);
        Log.debug("-------in ---------" + in.get("CHANNEL_TYPE"));
        this.setChannelType(StringUtils.castToString(in.get("CHANNEL_TYPE")));
        this.setOpCode(StringUtils.castToString(in.get("OP_CODE")));
        this.setOpNote(StringUtils.castToString(in.get("OP_NOTE")));
        this.setCustTypeId(StringUtils.castToString(in.get("CUST_ID_TYPE")));
        this.setCustTypeValue(StringUtils.castToString(in.get("CUST_ID_VALUE")));
        this.setServiceNo(StringUtils.castToString(in.get("SERVICE_NO")));
        this.setCreateTime(StringUtils.castToString(in.get("CREATE_TIME")));
        this.setAuthenCode(StringUtils.castToString(in.get("AUTHEN_CODE")));
        this.setAuthenName(StringUtils.castToString(in.get("AUTHEN_NAME")));
        this.setLoginAccept(StringUtils.castToString(in.get("LOGIN_ACCEPT")));
        this.setOutOrderId(StringUtils.castToString(in.get("OUT_ORDER_ID")));
        this.setLoginNo(StringUtils.castToString(in.get("LOGIN_NO")));
        this.setRegionId(StringUtils.castToString(in.get("REGION_ID")));
        this.setContactId(StringUtils.castToString(in.get("CONTACT_ID")));
        this.setGroupId(StringUtils.castToString(in.get("GROUP_ID")));
        this.setOrderLineId(StringUtils.castToString(in.get("ORDER_LINE_ID")));
        this.setApplyId(StringUtils.castToString(in.get("APPLY_ID")));
        this.setOrderId(StringUtils.castToString(in.get("ORDER_ID")));
        this.setIpAddress(StringUtils.castToString(in.get("IP_ADDRESS")));
        this.setNewOpCode(StringUtils.castToString(in.get("NEW_OP_CODE")));
        this.setBuyAuthenCode(Integer.parseInt(StringUtils.castToString(in.get("BUY_AUTHEN_CODE"))));
        this.setBuyIccId(StringUtils.castToString(in.get("BUY_ICCID")));
        this.setBuyName(StringUtils.castToString(in.get("BUY_NAME")));
        this.setBuyRemark(StringUtils.castToString(in.get("BUY_REMARK")));
        this.setLoginPwd(StringUtils.castToString(in.get("LOGIN_PWD")));
        this.setMasterServId(StringUtils.castToString(in.get("MASTER_SERV_ID")));
        this.setIdNo(Long.parseLong(StringUtils.castToString(in.get("ID_NO"))));
        this.setCustId(Long.parseLong(StringUtils.castToString(in.get("CUST_ID"))));
        this.setContractNo(Long.parseLong(StringUtils.castToString(in.get("CONTACT_NO")) == "" ? "0" : StringUtils.castToString(in.get("CONTACT_NO"))));

    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public String getOpNote() {
        return opNote;
    }

    public void setOpNote(String opNote) {
        this.opNote = opNote;
    }

    public String getCustTypeId() {
        return custTypeId;
    }

    public void setCustTypeId(String custTypeId) {
        this.custTypeId = custTypeId;
    }

    public String getCustTypeValue() {
        return custTypeValue;
    }

    public void setCustTypeValue(String custTypeValue) {
        this.custTypeValue = custTypeValue;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAuthenCode() {
        return authenCode;
    }

    public void setAuthenCode(String authenCode) {
        this.authenCode = authenCode;
    }

    public String getAuthenName() {
        return authenName;
    }

    public void setAuthenName(String authenName) {
        this.authenName = authenName;
    }

    public String getLoginAccept() {
        return loginAccept;
    }

    public void setLoginAccept(String loginAccept) {
        this.loginAccept = loginAccept;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public String getLoginNo() {
        return loginNo;
    }

    public void setLoginNo(String loginNo) {
        this.loginNo = loginNo;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getNewOpCode() {
        return newOpCode;
    }

    public void setNewOpCode(String newOpCode) {
        this.newOpCode = newOpCode;
    }

    public Integer getBuyAuthenCode() {
        return buyAuthenCode;
    }

    public void setBuyAuthenCode(Integer buyAuthenCode) {
        this.buyAuthenCode = buyAuthenCode;
    }

    public String getBuyIccId() {
        return buyIccId;
    }

    public void setBuyIccId(String buyIccId) {
        this.buyIccId = buyIccId;
    }

    public String getBuyName() {
        return buyName;
    }

    public void setBuyName(String buyName) {
        this.buyName = buyName;
    }

    public String getBuyRemark() {
        return buyRemark;
    }

    public void setBuyRemark(String buyRemark) {
        this.buyRemark = buyRemark;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getMasterServId() {
        return masterServId;
    }

    public void setMasterServId(String masterServId) {
        this.masterServId = masterServId;
    }

    public Long getIdNo() {
        return idNo;
    }

    public void setIdNo(Long idNo) {
        this.idNo = idNo;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getContractNo() {
        return contractNo;
    }

    public void setContractNo(Long contractNo) {
        this.contractNo = contractNo;
    }
}

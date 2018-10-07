package com.sitech.demosvc.base;

import com.sitech.common.LocalEntity;

import java.util.Map;

public class UserInfo extends LocalEntity {

    public Map<String,Object> queryUserInfoById(Map<String,Object> param){
        return (Map<String, Object>) this.baseDao.queryForObject("SQL_USER_INFO.queryUserInfoById",param);
    }

}

package com.sitech.common;

import java.util.HashMap;
import java.util.Map;

public class Dual extends LocalEntity {

    /**
     * 查询系统时间、年时、月时、天时
     * @return
     */
    public Map<String,Object> qryTimeNow(){
        Map<String,Object> outMap = new HashMap<>();
        outMap = (Map<String, Object>) this.baseDao.queryForObject("Dual@common.qryTimeNow",new HashMap());
        return outMap;
    }
}

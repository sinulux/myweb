package com.sitech.common.dto;

import java.util.Map;

public interface Decodeable {
    /**
     * InDTO层中的类必须要实现的接口
     * @version: 2015-3-4 下午4:39:29
     */
    public void decode(Map in);

}

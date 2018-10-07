package com.sitech.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 错误范围
 * @createTime: 2014年9月30日 下午2:47:04
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD})
public @interface ErrorRange {
    public String Method();

    public String InDTO();

    public String OutDTO();
}

package com.sitech.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 订单必填项验证
 * @createTime: 2014年8月27日 上午10:41:25
 * RetentionPolicy.RUNTIME 在运行时有效
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface Must {
    // 参数或者字段描述,这样能够显示友好的异常信息
    String description() default "";
}

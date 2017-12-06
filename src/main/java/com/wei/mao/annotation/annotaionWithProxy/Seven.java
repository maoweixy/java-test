package com.wei.mao.annotation.annotaionWithProxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author 毛伟
 * @Date 12/6/17  11:11
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Seven {
    String value() default "0";

    String property() default "0";
}

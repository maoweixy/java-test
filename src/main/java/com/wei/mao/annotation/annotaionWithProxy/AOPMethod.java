package com.wei.mao.annotation.annotaionWithProxy;

import java.lang.reflect.Method;

/**
 * @Author 毛伟
 * @Date 12/6/17  11:38
 */
public interface AOPMethod {
    //实例方法执行前执行的方法
    void after(Object proxy, Method method, Object[] args);
    //实例方法执行后执行的方法
    void before(Object proxy, Method method, Object[] args);
}

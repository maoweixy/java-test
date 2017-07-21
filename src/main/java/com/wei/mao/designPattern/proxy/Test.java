package com.wei.mao.designPattern.proxy;

import sun.misc.ProxyGenerator;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/11  10:44
 */
public class Test {
    public static void main(String args[]) throws NoSuchFieldException, IllegalAccessException {
        //Subject sub = new StaticProxy();
        //sub.dosomething();

        DynamicProxy proxy = new DynamicProxy();
        Subject sub = (Subject) proxy.bind(new RealSubject());
        sub.dosomething();
    }
}

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
        Field field = ProxyGenerator.class.getDeclaredField("saveGeneratedFiles");
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.setBoolean(ProxyGenerator.class, Boolean.TRUE);
        DynamicProxy proxy = new DynamicProxy();
        Subject sub = (Subject) proxy.bind(new RealSubject());
        sub.dosomething();
    }
}

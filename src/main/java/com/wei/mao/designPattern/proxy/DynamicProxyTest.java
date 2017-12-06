package com.wei.mao.designPattern.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author 毛伟
 * @Date 12/5/17  18:18
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        System.out.println(hello);
        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        //Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), dynamicProxy);
        Hello helloProxy = dynamicProxy.getProxy();
        helloProxy.say("mao wei");
        //helloProxy.done("work");
    }
}

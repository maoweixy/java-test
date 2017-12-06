package com.wei.mao.designPattern.proxy;

/**
 * @Author 毛伟
 * @Date 12/5/17  18:49
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        HelloProxy helloProxy = new HelloProxy();
        System.out.println(helloProxy);
        helloProxy.say("mao wei");
    }
}

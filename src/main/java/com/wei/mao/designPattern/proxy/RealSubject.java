package com.wei.mao.designPattern.proxy;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/11  10:10
 */
public class RealSubject implements Subject {
    @Override
    public void dosomething() {
        System.out.println("call do something()");
    }
}

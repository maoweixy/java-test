package com.wei.mao.designPattern.proxy;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/11  10:11
 */
public class StaticProxy implements Subject {
    Subject subject = new RealSubject();
    @Override
    public void dosomething() {
        subject.dosomething();
    }
}

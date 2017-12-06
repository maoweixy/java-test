package com.wei.mao.designPattern.proxy;

/**
 * @Author 毛伟
 * @Date 12/5/17  18:45
 */
public class HelloProxy implements Hello {
    private Hello hello;

    public HelloProxy() {
        hello = new HelloImpl();
        System.out.println(hello);
    }

    @Override
    public void say(String name) {
        System.out.println("before");
        hello.say(name);
        System.out.println("after");
    }

    @Override
    public void done(String thing) {

    }
}

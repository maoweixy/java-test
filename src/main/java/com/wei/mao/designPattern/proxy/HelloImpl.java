package com.wei.mao.designPattern.proxy;

/**
 * @Author 毛伟
 * @Date 12/5/17  18:18
 */
public class HelloImpl implements Hello {

    @Override
    public void say(String name) {
        System.out.println("Hello " + name);
    }

    @Override
    public void done(String thing) {
        System.out.println(thing + " done");
    }
}

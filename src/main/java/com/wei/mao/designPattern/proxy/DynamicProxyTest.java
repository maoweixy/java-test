package com.wei.mao.designPattern.proxy;

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
        /**
         * 为什么执行helloProxy.say，会自动调用DynamicProxy的invoke方法？
         * 因为在执行Proxy.newProxyInstance时，JDK会生成的最终真正的代理类，它继承自Proxy并实现了我们定义的Hello接口(相当于静态代理中的HelloProxy类)，在实现Hello接口方法的内部，通过反射调用了DynamicProxy的invoke方法
         */
        helloProxy.say("mao wei");
        //helloProxy.done("work");
    }
}

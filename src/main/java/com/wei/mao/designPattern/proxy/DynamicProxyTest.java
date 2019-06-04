package com.wei.mao.designPattern.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 毛伟
 * @Date 12/5/17  18:18
 */
public class DynamicProxyTest {
    public static void main(String[] args) throws IOException {
        Hello hello = new HelloImpl();
        System.out.println(hello);
        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        //Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), dynamicProxy);
        Hello helloProxy = dynamicProxy.getProxy();
        /**
         * 为什么执行helloProxy.say，会自动调用DynamicProxy的invoke方法？
         * 因为在执行Proxy.newProxyInstance时，JDK会生成的最终真正的代理类，它继承自Proxy并实现了我们定义的Hello接口(相当于静态代理中的HelloProxy类)，在实现Hello接口方法的内部，通过反射调用了DynamicProxy的invoke方法
         * 正是因为继承自Proxy，Java不能多继承，所以只能为接口创建代理实例
         */
        helloProxy.say("mao wei");
        System.out.println(helloProxy.getClass());
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Hello.class});
        FileOutputStream os = new FileOutputStream("$Proxy0.class");
        os.write(bytes);
        os.close();
    }
}

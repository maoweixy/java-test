package com.wei.mao.designPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author 毛伟
 * @Date 12/5/17  18:14
 */
public class DynamicProxy implements InvocationHandler {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        /**
         * 传递classLoader是为了将生成的.class文件动态加载到jvm中
         * 传递Interface是为了生成源代码，并将其编译生成.class文件，在Proxy的639行，使用ProxyGenerator.generateProxyClass生成字节码
         */
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    //proxy 就是代理对象，这里相当于静态代理中的helloProxy(动态生成代理对象)
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        System.out.println(proxy.getClass());
        System.out.println(Arrays.toString(args));
        Object result = method.invoke(target, args);
        System.out.println("after");
        return result;
    }
}

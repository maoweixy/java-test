package com.wei.mao.annotation.annotaionWithProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author 毛伟
 * @Date 12/6/17  11:36
 */
public class AopHandle implements InvocationHandler {
    private AOPMethod aopMethod;
    private Object target;

    public AopHandle(Object target, AOPMethod aopMethod) {
        this.target = target;
        this.aopMethod = aopMethod;
    }

    @Override
    //proxy 就是代理对象，这里相当于静态代理中的helloProxy(动态生成代理对象)
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke method before");
        this.aopMethod.before(proxy, method, args);
        Object result = method.invoke(target, args);
        System.out.println("invoke method after");
        this.aopMethod.after(proxy, method, args);
        return result;
    }
}

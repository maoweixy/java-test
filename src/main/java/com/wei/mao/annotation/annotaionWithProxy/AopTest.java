package com.wei.mao.annotation.annotaionWithProxy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author 毛伟
 * @Date 12/6/17  11:47
 */
public class AopTest {
    public static void main(String[] args) {
        AnimalInterface dog = AnimalFactory.getAnimal(DogImpl.class, new AOPMethod() {
            @Override
            public void after(Object proxy, Method method, Object[] args) {
                System.out.println("aop after");
            }

            @Override
            public void before(Object proxy, Method method, Object[] args) {
                System.out.println("aop before");
            }
        });
        dog.say();

        Field[] fields = DogImpl.class.getDeclaredFields();
        System.out.println(fields[0].getName());
    }
}

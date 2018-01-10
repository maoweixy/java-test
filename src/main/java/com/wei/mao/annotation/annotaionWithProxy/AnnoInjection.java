package com.wei.mao.annotation.annotaionWithProxy;

import java.lang.reflect.Field;

/**
 * @Author 毛伟
 * @Date 12/6/17  11:50
 */
public class AnnoInjection {
    public static Object getBean(Object object) {
        try {
            Field[] fields = object.getClass().getDeclaredFields();
            for (Field field : fields) {
                Seven seven = field.getAnnotation(Seven.class);
                if (seven != null) {
                    System.out.println("注入属性: " + field.getName() + ", value: " + seven.value());
                    object.getClass().getMethod("set" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1), new Class[]{String.class})
                            .invoke(object, seven.value());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return object;
    }
}

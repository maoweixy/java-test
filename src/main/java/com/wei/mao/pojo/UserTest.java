package com.wei.mao.pojo;

import java.lang.reflect.Field;

/**
 * @Author 毛伟
 * @Date 10/31/17  16:26
 */
public class UserTest {
    public static void main(String args[]) {
        User user = new User();
        user.setApp_name("appname 1");
        user.setDuid("duid 1");
        String fields = "";
        for (Field field : User.class.getFields()) {
            //System.out.println("filed : " + field);
            //fields += field.getName() + ",";
            System.out.println(field.getName());
        }
        System.out.println(fields);

        System.out.println(user.toString());
    }
}

package com.wei.mao.tmp;

import com.wei.mao.pojo.User;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;


/**
 * @Author 毛伟
 * @Date 11/20/17  15:01
 */
public class Tmp {
    public static void main(String[] args) throws IOException {
        String s = "maowei";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(new String(bytes, StandardCharsets.UTF_8));
        System.out.println(Arrays.toString(bytes));
        System.out.println(Integer.toBinaryString(8));
        String str = "CC%";
        String result = "";
        char[] messChar = str.toCharArray();
        int a = (int) 'c';
        System.out.println(a);

        for (int i = 0; i < messChar.length; i++) {
            result += Integer.toBinaryString(messChar[i]) + " ";
        }

        System.out.println(result);
    }

    public static User getUser(String duid, String appName) {
        User user = new User();
        user.setDuid(duid);
        user.setApp_name(appName);
        return user;
    }

}

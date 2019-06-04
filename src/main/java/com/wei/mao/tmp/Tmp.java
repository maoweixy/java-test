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
    public static void main(String[] args) throws Exception {
        String s = "听完竟然有点心动";
        s.replace("竟然有点", "久违");
        System.out.println(s);
    }


    public static User getUser(String duid, String appName) {
        User user = new User();
        user.setDuid(duid);
        user.setApp_name(appName);
        return user;
    }

}

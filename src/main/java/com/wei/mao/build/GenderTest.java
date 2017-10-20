package com.wei.mao.build;

import com.wei.mao.Utils.JsonUtils;
import netscape.javascript.JSUtil;

/**
 * @Author 毛伟
 * @Date 10/17/17  16:07
 */
public class GenderTest {
    public static void main(String args[]) {
        Gender gender = Gender.FEMALE;
        System.out.println(gender);
        String genderString = JsonUtils.serialize(gender);
        System.out.println(genderString);
        Gender gender1 = JsonUtils.deserialize(genderString, gender.getClass());
        System.out.println(gender1);
    }
}

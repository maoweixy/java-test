package com.wei.mao.constant;


/**
 * @Author 毛伟
 * @Date 10/9/17  18:08
 */
public class ConstantUtils {

    public static String a_bTOA_B(String a_b) {
        String result = "";
        for (int i = 0; i < a_b.length(); i++) {
            char c = a_b.charAt(i);
            if (Character.isLetter(c)) {
                result += Character.toUpperCase(c);
            }else {
                result += c;
            }
        }
        return result;
    }

    public static String addStrings(String prefix, String string, String suffix) {
        return prefix + string + suffix;
    }
}

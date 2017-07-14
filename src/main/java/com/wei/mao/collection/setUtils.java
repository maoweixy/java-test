package com.wei.mao.collection;

import java.util.Set;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/14  15:41
 */
public class setUtils {
    public static String setToString(Set<String> set){
        String string = "";
        for (String str:set) {
            string+=str+",";
        }
        return string.substring(0,string.length()-1);
    }
}

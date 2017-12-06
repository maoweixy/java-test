package com.wei.mao.json;

import com.alibaba.fastjson.JSONArray;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author 毛伟
 * @Date 10/9/17  14:56
 */
public class JsonString {
    public static void main(String args[]) {
        int t = 1;
        int t1 = 2;
        int t2 = 3;
        t = t == 1 ? t1 : t2;
        System.out.println(t);
    }

    public static int getDuidSum(String duid) {
        if (StringUtils.isBlank(duid)) {
            return 0;
        }
        if (!duid.matches("[0-9a-f]{32}")) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < duid.length(); i++) {
            sum += Integer.parseInt(String.valueOf(duid.charAt(i)), 16);
        }
        return sum;
    }
}

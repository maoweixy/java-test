package com.wei.mao.java8.localDate;

import org.springframework.core.io.Resource;

import java.time.LocalDate;

/**
 * @Author 毛伟
 * @Date 9/15/17  11:08
 */
public class LocalDateTest {
    public static void main(String args[]) {
        System.out.println(getDuidSum("00000000000000000000000000000003"));
    }


    public static int getDuidSum(String duid) {
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

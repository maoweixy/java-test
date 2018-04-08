package com.wei.mao.charset;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringEscapeUtils;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringToByte {
    public static void main(String[] args) {
        //String s = "maowei";
        //byte[] bytes = s.getBytes(StandardCharsets.UTF_16);
        //System.out.println(Arrays.toString(bytes));
        //String utf8 = new String(bytes, StandardCharsets.UTF_8);
        //System.out.println("change to utf-8 string : " + utf8);
        //System.out.println("utf-8 string to bytes : " + Arrays.toString(utf8.getBytes(StandardCharsets.UTF_8)));
        String str = "a";
        System.out.println(str.length());
        byte[] bytes = {124};
        int i = 0x8c;
        System.out.println((char)i);
        System.out.println(new String(bytes,StandardCharsets.US_ASCII));
    }
}

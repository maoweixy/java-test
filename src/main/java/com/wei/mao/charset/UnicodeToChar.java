package com.wei.mao.charset;

import org.apache.commons.lang3.StringEscapeUtils;

public class UnicodeToChar {
    public static void main(String[] args) {
        //直接把Unicode赋给char，不能带转义字符
        char c = '\u4F60';
        System.out.println(c);

        //吧带有转义字符的string转成int，然后转char
        String s = "\\u4F60";
        char c1 = (char) Integer.parseInt(s.substring(2), 16);
        System.out.println(c1);

        System.out.println(StringEscapeUtils.unescapeJava("\\u4F60"));
    }
}

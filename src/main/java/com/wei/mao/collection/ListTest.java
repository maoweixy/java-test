package com.wei.mao.collection;

import java.util.ArrayList;

/**
 * @Author 毛伟
 * @Date 11/10/17  13:29
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("123");
        list.add("123");
        list.add("1234");
        list.removeIf(e -> e.length() < 4);
        System.out.println(list);
    }
}

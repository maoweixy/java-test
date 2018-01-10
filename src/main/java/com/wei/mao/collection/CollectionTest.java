package com.wei.mao.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/8/1  11:38
 */
public class CollectionTest {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("123");
        list.add("123");
        List<String> list1 = list.subList(0, 1);
        System.out.println(list1);
    }
}

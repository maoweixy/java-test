package com.wei.mao.generic;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/26  11:10
 */
public class GenericTest {
    public static void main(String args[]){
        Pair<String> pair = new Pair<>("1","2");
        System.out.println(pair.getFirst());
    }
}

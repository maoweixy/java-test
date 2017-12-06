package com.wei.mao.guava.Collecttions;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author 毛伟
 * @Date 11/13/17  19:43
 */
public class Partition {
    public static void main(String[] args) {
        List<Integer> intList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
        List<List<Integer>> subSets = Lists.partition(intList, 10);
        System.out.println(subSets.get(1).size());
        int listSize = 10000000;
        int N = 1000000;
        System.out.println((int) Math.ceil(listSize / N));
    }
}

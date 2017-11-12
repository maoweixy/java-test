package com.wei.mao.java8.streamApi;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author 毛伟
 * @Date 11/6/17  15:20
 */
public class TestStream {
    public static void main(String args[]) {
        List<String> words = Arrays.asList("Hello","World");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list = numbers.stream().map(a -> a * a).collect(Collectors.toList());
        //List<String[]> list
        //List<String[]> list
        String value = "[]";
        List<String> list1 = JSON.parseArray(value, String.class);
        System.out.println(list1);
    }
}

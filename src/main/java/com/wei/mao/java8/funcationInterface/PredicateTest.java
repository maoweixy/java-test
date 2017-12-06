package com.wei.mao.java8.funcationInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author 毛伟
 * @Date 11/21/17  16:27
 */
public class PredicateTest {
    public static void main(String args[]) {
        
    }


    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }
}

package com.wei.mao.java8.behaviorParameterization;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/21  15:12
 */
public class test {
    public static void main(String args[]) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red"));
        List<Apple> result = filter(inventory,new AppleWeightPredicate());
        System.out.println(result);
    }

    public static List<Apple> filter(List<Apple> invnetory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : invnetory){
            if (p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}

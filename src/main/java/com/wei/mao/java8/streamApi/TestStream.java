package com.wei.mao.java8.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

/**
 * @Author 毛伟
 * @Date 11/6/17  15:20
 */
public class TestStream {
    public static void main(String args[]) {
        List<String> words = Arrays.asList("Hello","World");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //List<Integer> list = numbers.stream().filter(e -> e > 10).filter(e -> Objects.equals(e, 1)) .collect(Collectors.toList());
        //List<String[]> list
        List<String> list = words.stream().map(e -> e.split("")).flatMap(e -> Arrays.stream(e)).distinct().collect(toList());
        System.out.println(list);
        Optional<String> optional = Optional.of("123");
        Integer length = optional.map(String::length).orElse(1);
        Integer len = optional.flatMap(e -> Optional.of(e.length())).orElse(1);
        System.out.println(len);
        System.out.println(length);
        //System.out.println(filter(numbers, e -> e.equals(1)));
        //print(numbers, e -> System.out.println("this is " + e));
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static <T> void print(List<T> list, Consumer<T> consumer) {
        for (T s : list) {
            consumer.accept(s);
        }
    }
}



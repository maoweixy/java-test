package com.wei.mao.java8.streamApi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/21  18:18
 */
public class test {
    public static void main(String args[]) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT), new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER), new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER), new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
        //System.out.println(menu.stream().filter(dish -> dish.getCalories() > 300).map(Dish::getName).limit(3).collect(Collectors.toList()));
        List<String> dishNames = menu.stream().filter(dish -> dish.getCalories() > 300).map(Dish::getName).collect(Collectors.toList());

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

        transactions.stream().filter(e -> e.getYear() == 2011).sorted(Comparator.comparing(Transaction::getYear)).collect(toList());

        List<String> list = transactions.stream().map(e -> e.getTrader().getCity()).distinct().collect(toList());

        transactions.stream().map(e -> e.getTrader()).sorted(Comparator.comparing(Trader::getName)).collect(toList());

        int a = 5;
        List<int[]> list1 = IntStream.rangeClosed(a, 100).filter(b -> Math.sqrt(a * a + b * b) % 1 == 0).mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}).collect(toList());
        System.out.println((256192 - 52093) / 60);
    }
}

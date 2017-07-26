package com.wei.mao.java8.streamApi;

import lombok.Data;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/21  18:16
 */
@Data
public class Dish {
    public enum Type {
        MEAT, FISH, OTHER
    }
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

}

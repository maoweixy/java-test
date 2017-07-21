package com.wei.mao.java8.behaviorParameterization;

import lombok.Data;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/21  15:15
 */
@Data
public class Apple {
    private int weight;
    private String color;

    public Apple(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
}

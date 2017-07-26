package com.wei.mao.java8.streamApi;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/24  15:25
 */
public class Trader {
    private final String name;
    private final String city;

    public Trader(String n, String c) {
        this.name = n;
        this.city = c;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}

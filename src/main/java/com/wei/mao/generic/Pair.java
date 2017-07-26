package com.wei.mao.generic;

import java.util.Date;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/26  15:37
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }

}

class DateInterval extends Pair<Date> {
    public void setSecond(Date second) {
        if (second.compareTo(getFirst()) >= 0) super.setSecond(second);
    }

}
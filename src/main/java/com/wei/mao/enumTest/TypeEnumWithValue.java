package com.wei.mao.enumTest;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author 毛伟
 * @Date 10/17/17  15:31
 */
public enum TypeEnumWithValue {
    TYPE1(1, "Type A"), TYPE2(2, "Type B");

    private Integer id;
    private String name;


    TypeEnumWithValue(int i, String s) {
        this.id = i;
        this.name = s;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}

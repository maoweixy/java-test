package com.wei.mao.json;

import com.alibaba.fastjson.annotation.JSONField;
import com.amazonaws.athena.jdbc.shaded.jackson.annotation.JsonIgnore;
import com.amazonaws.athena.jdbc.shaded.jackson.annotation.JsonValue;
import com.wei.mao.enumTest.Day;
import com.wei.mao.enumTest.TypeEnumWithValue;
import lombok.Data;

/**
 * @Author 毛伟
 * @Date 10/16/17  18:13
 */
@Data
public class User {
    private String name;
    private int age;
    private TypeEnumWithValue typeEnumWithValue;

    @JsonValue
    public String getwawa() {
        return name;
    }
}

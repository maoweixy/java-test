package com.wei.mao.json;

import com.alibaba.fastjson.annotation.JSONField;
import com.amazonaws.athena.jdbc.shaded.jackson.annotation.JsonIgnore;
import com.amazonaws.athena.jdbc.shaded.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wei.mao.enumTest.Day;
import com.wei.mao.enumTest.TypeEnumWithValue;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author 毛伟
 * @Date 10/16/17  18:13
 */
@Data
public class User {
    private String name;
    private int age;
    private TypeEnumWithValue typeEnumWithValue;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime localDateTime;

    @JsonValue
    public String getwawa() {
        return name;
    }
}

package com.wei.mao.json.jackson;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author 毛伟
 * @Date 11/16/17  16:25
 */
@AllArgsConstructor
@JsonPropertyOrder({ "mao", "id" })
public class MyBean {
    public int id;
    private String name;

    //@JsonGetter("mao")
    @JsonValue
    public String getTheName() {
        return name;
    }
}

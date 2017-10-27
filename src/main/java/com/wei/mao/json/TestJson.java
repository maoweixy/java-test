package com.wei.mao.json;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wei.mao.Utils.JsonUtils;
import com.wei.mao.enumTest.TypeEnumWithValue;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author 毛伟
 * @Date 9/11/17  16:47
 */
public class TestJson {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    public static void main(String args[]) throws com.fasterxml.jackson.core.JsonProcessingException {

        User user = new User();
        user.setName("mao");
        user.setAge(2);
        user.setTypeEnumWithValue(TypeEnumWithValue.TYPE1);
        user.setLocalDateTime(LocalDateTime.now());



        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);

        System.out.println(JsonUtils.serialize(user));
        System.out.println(MAPPER.writeValueAsString(user));
    }
}

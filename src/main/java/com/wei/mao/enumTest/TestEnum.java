package com.wei.mao.enumTest;

import com.amazonaws.athena.jdbc.shaded.jackson.core.JsonProcessingException;
import com.amazonaws.athena.jdbc.shaded.jackson.databind.ObjectMapper;

/**
 * @Author 毛伟
 * @Date 10/16/17  17:53
 */
public class TestEnum {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    public static void main(String args[]) throws JsonProcessingException {
        TypeEnumWithValue typeEnumWithValue = TypeEnumWithValue.TYPE1;
        System.out.println(MAPPER.writeValueAsString(typeEnumWithValue));
        System.out.println(Gender.forValue(String.valueOf(4)));

    }
}

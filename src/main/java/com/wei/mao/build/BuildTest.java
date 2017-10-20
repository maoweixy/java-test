package com.wei.mao.build;

import com.alibaba.fastjson.JSON;
import com.amazonaws.athena.jdbc.shaded.jackson.databind.ObjectMapper;
import com.wei.mao.Utils.JsonUtils;

/**
 * @Author 毛伟
 * @Date 10/17/17  10:13
 */
public class BuildTest {
    public static void main(String args[]) {
        //Property property1 = new Property();
        //System.out.println(JSON.toJSONString(property1));

        //Property property2 = Property.builder().gender(Gender.FEMALE).language(Language.ENGLISH).noise(Noise.NOISY).build();
        //System.out.println(JSON.toJSONString(property2));

        //Property property = Property.builder().gender(Gender.FEMALE).language(Language.ENGLISH).noise(Noise.NOISY).build();
        //System.out.println(JsonUtils.serialize(property));

        ResultData resultData = ResultData.builder().build();
        System.out.println(resultData.toString());

    }
}

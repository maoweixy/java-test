package com.wei.mao.json.fastjson;

import com.alibaba.fastjson.JSONObject;

import static com.wei.mao.json.JSONResult.getSuccessWithSuccessStatus;

/**
 * @Author 毛伟
 * @Date 11/22/17  14:25
 */
public class JsonTest {
    public static void main(String args[]) {
        JSONObject data = new JSONObject();
        data.put("dict", 1);

        System.out.println(JSONObject.toJSONString(getSuccessWithSuccessStatus(data)));
    }
}

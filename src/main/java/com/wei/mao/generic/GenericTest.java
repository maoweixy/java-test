package com.wei.mao.generic;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collector;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/26  11:10
 */
public class GenericTest {
    public static void main(String args[]){
        String str = null;
        String regEx = "null|";
        //Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
         Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        System.out.println(pattern.matcher("").matches());

        Optional<JSONObject> responseData = Optional.empty();
        System.out.println(responseData.isPresent());
    }
}

package com.wei.mao.file;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.kikatech.krupp.http.HttpRequest;
import com.kikatech.krupp.http.HttpResponse;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpException;

import javax.xml.ws.Response;
import java.io.*;
import java.net.URLEncoder;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class fileTest {
    public static void main(String args[]) throws IOException, HttpException {
        File file = new File("/Users/maowei/Downloads/test.txt");
        List<String> list = FileUtils.readLines(file);
        String onlineUrl = "http://abtest.kikakeyboard.com/ab-test/feature/check-if-match";
        String testUrl = "http://api-dev.kikakeyboard.com/ab-test/feature/check-if-match";
        String onlineResult;
        String testResult;
        for (int i = 590; i < 2000; i++) {
            String url = list.get(i);
            try {
                Map<String, String> parameters = new HashMap<>();
                parameters.put("userInfo", url.substring(url.indexOf("userInfo") + 9, url.length()));
                System.out.println(url.substring(url.indexOf("userInfo") + 9, url.length()));
                onlineResult = send(onlineUrl, parameters);
                testResult = send(testUrl, parameters);
                if (!compare(onlineResult, testResult)) {
                    System.out.println("online" + onlineResult);
                    System.out.println("test  " + testResult);
                    System.out.println(i);
                    System.out.println(url);
                    return;
                }
                System.out.println("ok " + i);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(i);
                System.out.println(url);
                return;
            }
        }
    }

    public static String send(String url, Map<String, String> parameters) throws HttpException, UnsupportedEncodingException {
        HttpResponse response = HttpRequest.post(url).setParams(parameters).send();
        return response.getString();
    }

    public static boolean compare(String onlineResult, String testResult) {
        JSONArray onlineArray = JSONObject.parseObject(onlineResult).getJSONObject("data").getJSONArray("result");
        onlineArray.sort(Comparator.comparing(Object::hashCode));
        JSONArray tesArray = JSONObject.parseObject(testResult).getJSONObject("data").getJSONArray("result");
        tesArray.sort(Comparator.comparing(Object::hashCode));
        //System.out.println(onlineArray);
        //System.out.println(tesArray);
        boolean result = onlineArray.equals(tesArray);
        if (!result) {
            System.out.println(onlineArray);
            System.out.println(tesArray);
            for (int i = 0; i < tesArray.size(); i++) {
                if (onlineArray.getJSONObject(i).getString("feature_name").equals("trace")) {
                    System.out.println("online" + onlineArray.getJSONObject(i));
                }
                if (tesArray.getJSONObject(i).getString("feature_name").equals("trace")) {
                    System.out.println("test  " + tesArray.getJSONObject(i));
                }

            }
        }
        return result;
    }


}

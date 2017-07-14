package com.wei.mao.webCrawler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kikatech.krupp.http.HttpRequest;
import com.kikatech.krupp.http.HttpResponse;
import lombok.extern.log4j.Log4j2;
import org.apache.http.HttpException;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/5/3  14:20
 */
@Log4j2
public class Utils {
    public static Optional<JSONObject> getResponse(String url, int timeoutInMills) {
        try {
            /**
             * 设置Cookie和User-Agent,防止请求被网站拒绝
             */
            Map<String,String> map = new HashMap<>();
            map.put("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.81 Safari/537.36");
            map.put("Cookie","user_trace_token=20170430082620-42500a2e2d2448268c37485f1e2be76d; LGUID=20170430082621-a2d1aad0-2d3b-11e7-88fc-525400f775ce; index_location_city=%E5%85%A8%E5%9B%BD; JSESSIONID=CBCAEC1E599FBC3DFB4CDC48F7EB2EB7; TG-TRACK-CODE=index_search; SEARCH_ID=00975b437a774cb4b80529a9d7a283d3; _gid=GA1.2.1463909825.1493793236; _ga=GA1.2.2002659074.1493511990; LGRID=20170503143342-738b1bda-2fca-11e7-b52f-5254005c3644; Hm_lvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1493694125,1493716723,1493775625,1493776126; Hm_lpvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1493793236");
            /**
            以get方式发送网络请求,并设定响应时间,超时时间和连接时间
             */
            HttpResponse response = HttpRequest.get(url).setHeader(map).setConnTimeout(timeoutInMills)
                    .setSoTimeout(timeoutInMills).setHttpExecuteTimeout(timeoutInMills + 100).send();
            if (response.getStatusCode() != HttpStatus.SC_OK) {
                log.error("the response status code is error:{}", response.getStatusCode());
                return Optional.empty();
            }
            String responseContent = response.getString();
            JSONObject responseObj = JSON.parseObject(responseContent);
            if (!responseObj.getString("success").equals("true")) {
                log.error("the response text is invalid:{}", responseContent);
                return Optional.empty();
            }
            JSONObject result = responseObj.getJSONObject("content").getJSONObject("positionResult");
            return Optional.ofNullable(result);
        } catch (HttpException e) {
            log.warn("send {} occur exception", url, e);
            return Optional.empty();
        }
    }

    public static Optional<JSONObject> getResponseWithProxy(String url, int timeoutInMills,String host,int port){
        try {
            Map<String,String> map = new HashMap<>();
            map.put("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.81 Safari/537.36");
            map.put("Cookie","user_trace_token=20170430082620-42500a2e2d2448268c37485f1e2be76d; LGUID=20170430082621-a2d1aad0-2d3b-11e7-88fc-525400f775ce; index_location_city=%E5%85%A8%E5%9B%BD; JSESSIONID=CBCAEC1E599FBC3DFB4CDC48F7EB2EB7; TG-TRACK-CODE=index_search; SEARCH_ID=00975b437a774cb4b80529a9d7a283d3; _gid=GA1.2.1463909825.1493793236; _ga=GA1.2.2002659074.1493511990; LGRID=20170503143342-738b1bda-2fca-11e7-b52f-5254005c3644; Hm_lvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1493694125,1493716723,1493775625,1493776126; Hm_lpvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1493793236");
            HttpResponse response = HttpRequest.get(url).setProxy(host,port).setHeader(map).setConnTimeout(timeoutInMills)
                    .setSoTimeout(timeoutInMills).setHttpExecuteTimeout(timeoutInMills + 100).send();
            if (response.getStatusCode() != HttpStatus.SC_OK) {
                log.error("the response status code is error:{}", response.getStatusCode());
                return Optional.empty();
            }
            String responseContent = response.getString();
            JSONObject responseObj = JSON.parseObject(responseContent);
            if (!responseObj.getString("success").equals("true")) {
                log.error("the response text is invalid:{}", responseContent);
                return Optional.empty();
            }
            JSONObject result = responseObj.getJSONObject("content").getJSONObject("positionResult");
            return Optional.ofNullable(result);
        } catch (HttpException e) {
            log.warn("send {} occur exception", url, e);
            return Optional.empty();
        }
    }

    public static Float getSalary(String data){
        if (data.contains("-")){
            String[] strings = data.replaceAll("k","").replaceAll("K","").split("-");
            return (Float.valueOf(strings[0])+Float.valueOf(strings[1]))/2;
        }
        String reslut ="";
        for (int i = 0; i < data.length(); i++) {
            if (Character.isDigit(data.charAt(i))){
                reslut+=data.charAt(i);
            }else {
                break;
            }
        }
        return Float.valueOf(reslut);
    }
}

package com.wei.mao.http;

import com.kikatech.krupp.http.HttpRequest;
import com.kikatech.krupp.http.HttpResponse;
import org.apache.http.HttpException;

/**
 * @Author 毛伟
 * @Date 11/22/17  18:18
 */
public class HttpTest {
    public static void main(String args[]) throws HttpException {
        String url = "https://s3.cn-north-1.amazonaws.com.cn/kika-voice-cn/2016/05/02/22/8d2a56f6-e42b-4ce1-9d18-03be3d6c6382.wav";
        HttpResponse response = HttpRequest.post(url).send();
        System.out.println(response.getStatusCode());
        System.out.println(response.getString());
    }
}

package com.wei.mao.http;

import com.kikatech.krupp.http.HttpRequest;
import com.kikatech.krupp.http.HttpResponse;
import com.wei.mao.Utils.ZipUtils;
import org.apache.http.HttpException;

import java.io.IOException;

/**
 * @Author 毛伟
 * @Date 11/22/17  18:18
 */
public class HttpTest {
    public static void main(String args[]) throws HttpException, IOException {
        String url = "http://localhost:8081/test";
        String param = "[{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"0\",\"type\":\"0\",\"ctime\":\"11111111\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"}]";

        HttpResponse response = HttpRequest.post(url).setEntity(param.getBytes()).send();
        System.out.println(response.getStatusCode());
        System.out.println(response.getString());
    }
}

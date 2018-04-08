package com.wei.mao.tmp;

import com.alibaba.fastjson.JSONObject;
import com.kikatech.krupp.http.HttpRequest;
import com.kikatech.krupp.http.HttpResponse;
import org.apache.http.HttpException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tmp4 {
    public static void main(String[] args) throws HttpException, FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("/Users/maowei/Downloads/test.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append("date,app,nation,ltv");
        sb.append('\n');


        String[] apps = {"kika", "pro"};
        String[] nations = {"us", "br"};
        //String url = "http://kb.uq.kikakeyboard.com/api/getLtv?date=2018-01-01&app=kika&nation=us&days=90&account=liuyuze&password=4b227f825c47f367cba157be20638aca";
        String url = "http://kb.uq.kikakeyboard.com/api/getLtv?date=";
        for (int i = 0; i < 10; i++) {
            String date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.of(2018, 1, 1).plusDays(i));
            String dateUrl = url + date;
            for (int j = 0; j < apps.length; j++) {
                String appUrl = dateUrl + "&app=" + apps[j];
                for (int k = 0; k < nations.length; k++) {
                    String nationUrl = appUrl + "&nation=" + nations[k] + "&days=90&account=liuyuze&password=4b227f825c47f367cba157be20638aca";
                    try {
                        sb.append(date + "," + apps[j] + "," + nations[k] + "," + getLtv(nationUrl));
                        sb.append('\n');
                    } catch (Exception e) {
                        System.out.println("date = " + date + "  app = " + apps[j] + "  nation " + nations[k]);
                        pw.write(sb.toString());
                        pw.close();
                    }
                }
            }
        }
        pw.write(sb.toString());
        pw.close();
        //System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.of(2018, 1, 1).plusDays(1)));
        //System.out.println(getLtv(url.toString()));
    }

    public static String send(String url) throws HttpException{
        HttpResponse response = HttpRequest.get(url).send();
        return response.getString();
    }

    public static String getLtv(String url) throws HttpException {
        String result = send(url);
        JSONObject object = JSONObject.parseObject(result);
        return object.getJSONObject("data").getString("ltv");
    }


}

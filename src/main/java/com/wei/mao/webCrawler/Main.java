package com.wei.mao.webCrawler;

import org.apache.http.HttpException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/3/15  下午6:40
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, NoSuchAlgorithmException, HttpException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
        Baidu baidu = context.getBean(Baidu.class);
        String[] kded = {"java","python","c","前端开发"};
        String[] kd = {"java"};
//        String[] bigKd = {"开发","测试","运营","产品","设计"};
        String[] kds = {"java","python","c","前端开发","android","ios","php","c#","c++","数据挖掘","算法"};
        String[] bigKd = {"运营"};
//        baidu.start();
//        baidu.startWithMultiThread("前端开发",30);
//        baidu.start("前端开发",30);
//        baidu.setPositionAmount(kds);
        baidu.setPosition(kded,10,"development");
    }
}

package com.wei.mao.file.wei;

import org.apache.http.HttpException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/3/13  下午6:09
 */
public class start {
    public static void main(String[] args) throws IOException, InterruptedException, NoSuchAlgorithmException, HttpException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
        demo3 demo = context.getBean(demo3.class);
//        demo.test();
//        demo.query();
//        demo.loadData();
//        demo.query();
        demo.test();
//        System.out.println(demo.getCategoryByName("FranceFootball"));
        System.out.println("done");
    }
}

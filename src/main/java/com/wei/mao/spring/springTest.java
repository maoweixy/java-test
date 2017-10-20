package com.wei.mao.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author 毛伟
 * @Date 9/15/17  16:20
 */
public class springTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
        //context.getBean()
    }
}

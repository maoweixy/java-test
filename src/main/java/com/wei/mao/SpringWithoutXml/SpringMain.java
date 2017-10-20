package com.wei.mao.SpringWithoutXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/8/2  20:45
 */
public class SpringMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        context.close();
    }
}

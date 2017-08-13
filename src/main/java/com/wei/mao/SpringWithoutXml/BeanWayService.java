package com.wei.mao.SpringWithoutXml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/8/3  10:23
 */
public class BeanWayService {
    @PostConstruct
    public void initTest(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    @PreDestroy
    public void destroyTest(){
        System.out.println("@Bean-destory-method");
    }
}

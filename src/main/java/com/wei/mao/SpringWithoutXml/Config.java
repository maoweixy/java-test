package com.wei.mao.SpringWithoutXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/8/3  10:24
 */

@Configuration
@ComponentScan("com.wei.mao")
public class Config {
    @Bean(initMethod="initTest",destroyMethod="destroyTest") //1
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
}

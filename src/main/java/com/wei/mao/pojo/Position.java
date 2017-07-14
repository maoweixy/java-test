package com.wei.mao.pojo;

import lombok.Data;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.type.Alias;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/5/3  14:03
 */
@Data
@Alias(value = "position")
public class Position {
    Integer id;
    String position;
    String education;
    String company;
    String workYear;
    Float salary;
    String city;
    String companySize;
    String financeStage;
}

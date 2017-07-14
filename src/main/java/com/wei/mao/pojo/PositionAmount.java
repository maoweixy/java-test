package com.wei.mao.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/5/6  11:11
 */
@Data
@Alias(value = "positionAmount")
public class PositionAmount {
    Integer id;
    String position;
    Integer amount;
}

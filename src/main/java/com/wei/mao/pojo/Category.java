package com.wei.mao.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/3/20  下午12:02
 */
@Alias(value = "Category")
@Data
public class Category {
    //category_id
    private Integer id;

    //分类名
    private String name;
}

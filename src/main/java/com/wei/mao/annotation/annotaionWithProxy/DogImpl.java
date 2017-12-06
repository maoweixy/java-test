package com.wei.mao.annotation.annotaionWithProxy;

import lombok.Data;

/**
 * @Author 毛伟
 * @Date 12/6/17  11:14
 */
@Data
public class DogImpl implements AnimalInterface {
    @Seven("okkkk")
    private String name;



    @Override
    public void say() {
        System.out.println("wawawa....." + name);
    }
}

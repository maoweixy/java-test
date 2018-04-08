package com.wei.mao.tmp;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author 毛伟
 * @Date 11/27/17  16:16
 */
@Data
@AllArgsConstructor
public class TmpPojo implements Cloneable{
    private int id;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

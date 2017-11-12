package com.wei.mao.pojo;

import com.sun.org.apache.regexp.internal.RE;
import lombok.Data;
import lombok.ToString;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/3/22  上午11:24
 */
@Data
public class User {
    private String duid;
    private String app_name;
    //private String tag;
    //private LocalDateTime update_time;
    //private LocalDate date;

    @Override
    public String toString() {
        return duid + "," + app_name;
    }

    public String getFields() {
        return "duid,app_name";
    }

}

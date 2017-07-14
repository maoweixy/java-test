package com.wei.mao.pojo;

import lombok.Data;

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
    private String tag;
    private LocalDateTime update_time;
}

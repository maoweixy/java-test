package com.wei.mao.json.jackson;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wei.mao.Utils.GenericDateDeserializer;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author 毛伟
 * @Date 10/16/17  18:13
 */
@Data
public class User {
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonDeserialize(using = GenericDateDeserializer.class)
    protected LocalDateTime createTime;

}

package com.wei.mao.file.excel;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Alias(value = "User")
public class User {

    private Integer userId;
    private String username;

    @JsonIgnore
    private String password;

    @JsonIgnore
    private String salt;
    private String email;
    private String realName;
    private String description;

    private Group group;

    /**
     * 标注员标注什么样的语音，也就是标注员的等级
     */
    @JsonIgnore
    private String queryCondition;

    protected LocalDateTime createTime;

    protected LocalDateTime updateTime;

    @JsonIgnore
    private boolean disabled;

    private List<Role> roles;
}

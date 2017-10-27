package com.wei.mao.file.excel;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;


@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Alias("Role")
public class Role {
    private Integer roleId;
    private String roleName;

    protected LocalDateTime createTime;
}

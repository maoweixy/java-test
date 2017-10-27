package com.wei.mao.file.excel;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Alias("Group")
public class Group {
    private Integer groupId;
    private String groupName;
    private String timezone;

    private LocalDateTime createTime;
}

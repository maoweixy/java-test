package com.wei.mao.build;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Property {

    private String url;

    @Builder.Default
    private boolean valid = true;
    @Builder.Default
    private Gender gender = Gender.FEMALE;
    private Noise noise;
    private Language language;
    private boolean hasAccent;
    private boolean harsh;
    private String content;

    /**
     * 起始时间点
     */
    private float start;

    /**
     * 终止时间点
     */
    private float end;

    /**
     * 批注，检查员使用
     */
    private String remark;

    @JsonIgnore
    public int getGenderCode() {
        return gender.getCode();
    }

    @JsonIgnore
    public int getNoiseCode() {
        return noise.getCode();
    }

    @JsonIgnore
    public int getLanguageCode() {
        return language.getCode();
    }
}

package com.wei.mao.build;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum Language {

    ENGLISH(0, "English"),
    MIXED(1, "includes other languages");

    private int code;
    private String description;

    Language(int code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonCreator
    public static Language forValue(String value) {
        for (Language language : values()) {
            if (String.valueOf(language.getCode()).equals(value)) {
                return language;
            }
        }
        return null;
    }

    @JsonValue
    public String toValue() {
        return String.valueOf(code);
    }
}

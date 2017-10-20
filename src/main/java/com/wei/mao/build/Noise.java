package com.wei.mao.build;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum Noise {

    QUIET(0, "quiet"),
    NOISY(1, "with some noise but recognizable"),
    BAZAAR(2, "too noisy,hard to recognize");

    private int code;
    private String description;

    Noise(int code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonCreator
    public static Noise forValue(String value) {
        for (Noise item : values()) {
            if (String.valueOf(item.getCode()).equals(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    public String toValue() {
        return String.valueOf(code);
    }
}

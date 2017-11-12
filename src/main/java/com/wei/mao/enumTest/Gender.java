package com.wei.mao.enumTest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum Gender {

    MALE(1),
    FEMALE(2),
    UNSURE(3);

    private int code;

    Gender(int code) {
        this.code = code;
    }

    @JsonCreator
    public static Gender forValue(String value) {
        for (Gender item : values()) {
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

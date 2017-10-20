package com.wei.mao.build;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResultData<T> {

    private boolean success;
    private String message;
    private T data;
}

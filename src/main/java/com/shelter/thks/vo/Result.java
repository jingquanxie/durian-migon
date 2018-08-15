package com.shelter.thks.vo;

import lombok.Data;

/**
 * Created by calling on 2018/8/15.
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(T data) {
        this.code = 200;
        this.msg = "成功";
        this.data = data;
    }
}

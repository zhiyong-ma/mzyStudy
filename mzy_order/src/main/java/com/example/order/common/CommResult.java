package com.example.order.common;

import lombok.Data;

/**
 * @author mzy
 * @date 2024/7/29 0:13
 */
@Data
public class CommResult<T> {

    private Integer code;

    private T result;

    private String msg;


    public CommResult(Integer code, T result, String msg) {
        this.code = code;
        this.result = result;
        this.msg = msg;
    }

    public static <T> CommResult<T> success(T result) {
        return new CommResult<>(200,result,"success");
    }

    public static <T> CommResult<T> failure(Integer code,String  msg) {
        return new CommResult<>(code,null,msg);
    }
}

package com.zw.gogobootcore.context;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result<T> {

    private String code;

    private String msg;

    private Boolean success;

    private T data;


    public static <T> Result<T> OK(T data) {
        return Result.<T>builder()
                .msg("请求成功")
                .code("200")
                .success(true)
                .data(data).build();
    }

    public static <T> Result<T> OK(String msg, T data) {
        return Result.<T>builder()
                .msg(msg)
                .code("200")
                .success(true)
                .data(data).build();
    }

    public static Result<String> ERROR(String msg) {
        return Result.<String>builder()
                .msg("请求失败")
                .code("500")
                .success(false)
                .msg(msg).build();
    }

}

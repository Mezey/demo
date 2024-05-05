package com.gyz.tfxz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private int code;
    private String msg;
    private Object data;

    //增删改 成功响应
    public static Result success(Object data) {
        return new Result(200, "success", data);
    }
    //查询 成功响应
    public static Result success() {
        return new Result(200, "success", null);
    }
    //成功响应
    public static Result success(String msg) {
        return new Result(200, msg, null);
    }
    //失败响应
    public static Result error(String msg) {
        return new Result(500, msg, null);
    }
}

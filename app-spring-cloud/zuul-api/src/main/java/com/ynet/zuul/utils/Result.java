package com.ynet.zuul.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by yuanxu on 2018/8/1.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int code;
    private String msg;

    public static Result REQUEST_LIMIT = new Result(-10001, "请求超限");
    public static Result SERVER_ERROR = new Result(-10002, "服务端异常");
    public static Result PARAM_ERROR = new Result(-10003, "token缺失");
}

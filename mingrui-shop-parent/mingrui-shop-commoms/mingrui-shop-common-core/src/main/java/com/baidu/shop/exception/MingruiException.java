package com.baidu.shop.exception;

/**
 * @ClassName MingruiException
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/9/3
 * @Version V1.0
 **/
public class MingruiException extends RuntimeException{

    private Integer code;

    private String msg;

    public MingruiException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}

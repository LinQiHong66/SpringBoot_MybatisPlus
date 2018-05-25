package com.warrior.util;


public class Result<T> {
    public static final Integer OK = 0;
    public static final Integer Error = -1;

    private Integer code;
    private String msg;
    private T data;

    public Result(){
        this.code = OK;
        this.msg = "success";
    }

    public Result(Integer code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public Result(String msg, T data) {
        super();
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg, T data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }




}
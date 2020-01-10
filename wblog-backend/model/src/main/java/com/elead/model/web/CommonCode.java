package com.elead.model.web;

/**
 * @author wwy
 * @date 2020/1/6
 * 通用的返回响应码
 */
public enum CommonCode implements ResultCode{
    SUCCESS(200,"操作成功"),
    DEFAULT(499,"未知异常"),
    NULLEXCEPTION(498,"参数不能为空");
    private int code;
    private String mesg;

    CommonCode(int code, String mesg) {
        this.code = code;
        this.mesg = mesg;
    }

    @Override
    public String getMessage() {
        return mesg;
    }

    @Override
    public int getCode() {
        return code;
    }
}

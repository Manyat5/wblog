package com.elead.model.web;

/**
 * @author wwy
 * @date 2020/1/6
 * 所有返回码都要实现这个接口
 */
public interface ResultCode {
    /**
     * 返回响应用户的信息
     * @return 响应信息
     */
    String getMessage();

    /**
     * 返回状态码
     * @return 状态码
     */
    int getCode();
}

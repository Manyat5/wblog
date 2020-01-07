package com.elead.model.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author wwy
 * @date 2020/1/6
 * 所有http响应都要继承
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BaseResponse<T> {
    /**
     * 返回的状态码，里面包含了给用户的信息
     */
    private ResultCode resultCode;
    /**
     * 返回的数据
     */
    private T data;
}

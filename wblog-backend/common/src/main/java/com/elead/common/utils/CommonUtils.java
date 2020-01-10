package com.elead.common.utils;

import com.elead.common.exception.BaseException;
import com.elead.model.web.BaseResponse;
import com.elead.model.web.CommonCode;

/**
 * @author wwy
 * @date 2020/1/10
 */
public final class CommonUtils {
    private CommonUtils(){
    }

    /**
     * 空对象拦截器
     * @param o
     */
    public static void nullInceptor(Object o){
        if(o==null){
            throw new BaseException(CommonCode.NULLEXCEPTION);
        }
    }
    /**
     * 成功返回结果
     */
    public static <T> BaseResponse<T> successResponse(T data){
        return new BaseResponse(CommonCode.SUCCESS,data);
    }
}

package com.elead.common.exception;

import com.elead.model.web.BaseResponse;
import com.elead.model.web.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wwy
 * @date 2020/1/6
 * 捕获所有异常到这里来处理
 */
@ControllerAdvice
public class ExceptionCatch {
    private static final Logger LOGGER= LoggerFactory.getLogger(ExceptionCatch.class);

    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public BaseResponse customException(BaseException e){
        //记录日志
        LOGGER.error("捕获异常",e.getMessage()+",错误码"+e.getResultCode());
        ResultCode resultCode=e.getResultCode();
        return new BaseResponse(resultCode,null);
    }
}

package com.elead.common.exception;

import com.elead.model.web.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 被 com.elead.common.exception.ExceptionCatch 捕获的基础异常
 * @author wwy
 * @date 2020/1/6
 */
@Data
@ToString
@NoArgsConstructor
public class BaseException extends RuntimeException{
    private ResultCode resultCode;
}

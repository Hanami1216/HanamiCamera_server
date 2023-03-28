package com.hanamiCamera.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description : 业务层异常
 * @Author : YokiWare
 * @Date: 2022-09-17  17:03
 */
@Getter
@Setter
public class BusinessException extends RuntimeException{
    private Integer Code;

    public BusinessException(Integer code) {
        Code = code;
    }

    public BusinessException(String message, Integer code) {
        super(message);
        Code = code;
    }

    public BusinessException(String message, Throwable cause, Integer code) {
        super(message, cause);
        Code = code;
    }

    public BusinessException(Throwable cause, Integer code) {
        super(cause);
        Code = code;
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        Code = code;
    }
}

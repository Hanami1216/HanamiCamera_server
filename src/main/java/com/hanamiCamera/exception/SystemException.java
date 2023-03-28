package com.hanamiCamera.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description : 系统异常
 * @Author : YokiWare
 * @Date: 2022-09-17  17:03
 */
@Getter
@Setter
public class SystemException extends RuntimeException{
    private Integer Code;

    public SystemException(Integer code) {
        Code = code;
    }

    public SystemException(String message, Integer code) {
        super(message);
        Code = code;
    }

    public SystemException(String message, Throwable cause, Integer code) {
        super(message, cause);
        Code = code;
    }

    public SystemException(Throwable cause, Integer code) {
        super(cause);
        Code = code;
    }

    public SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        Code = code;
    }
}

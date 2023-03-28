package com.hanamiCamera.exception;

import com.hanamiCamera.controller.Code;
import com.hanamiCamera.util.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description : 异常处理器
 * @Author : YokiWare
 * @Date: 2022-09-17  17:08
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    /**
     * @param ex:
     * @return Result
     * @description 系统异常
     */
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,ex对象发送给开发人员
        return new Result(ex.getCode(),ex.getMessage(),null);
    }
    /**
     * @param ex:
     * @return Result
     * @description 业务层异常
     */
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),ex.getMessage(),null);
    }
    /**
     * @param :
     * @return Result
     * @description 处理全局异常
     */
    @ExceptionHandler(Exception.class)
    public Result doOtherException(Exception ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,ex对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOW_ERR, ex.getMessage(), "系统繁忙，请稍后再试！");
    }


}

package cn.tedu.liu.exception.handler;

import cn.tedu.liu.exception.ServiceException;
import cn.tedu.liu.web.JsonResult;
import cn.tedu.liu.web.State;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Iterator;
import java.util.List;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public JsonResult<Void> handleServiceException(ServiceException e){
        return JsonResult.fail(e.getState(),e.getMessage());
    }

    @ExceptionHandler
    public JsonResult<Void> handleBindException(BindException e){
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<FieldError> it = fieldErrors.iterator();
        while (it.hasNext()){
            stringBuffer.append(it.next().getDefaultMessage());
        }
        return JsonResult.fail(State.ERR_BAD_REQUEST,stringBuffer.toString());
    }
}

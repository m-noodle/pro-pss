package cn.tedu.zhu.exception;

import cn.tedu.zhu.restful.ResponseCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PssException extends RuntimeException{
    private ResponseCode responseCode;

    public PssException(ResponseCode responseCode,String message) {
        super(message);
        setResponseCode(responseCode);
    }
}

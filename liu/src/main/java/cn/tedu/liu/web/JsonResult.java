package cn.tedu.liu.web;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult<T> implements Serializable {

    private Integer state;

    private String message;

    private T data;

    public static JsonResult<Void> ok(){
        return ok(null);
    }

    public static <T> JsonResult<T> ok(T data){
        JsonResult<T> jsonResult = new JsonResult<>();
        jsonResult.setMessage("响应成功!");
        jsonResult.setState(State.OK.getValue());
        jsonResult.setData(data);
        return jsonResult;
    }

    public static JsonResult<Void> fail(State state, String message){
        JsonResult<Void> jsonResult = new JsonResult<>();
        jsonResult.setState(state.getValue());
        jsonResult.setMessage(message);
        return jsonResult;
    }
}

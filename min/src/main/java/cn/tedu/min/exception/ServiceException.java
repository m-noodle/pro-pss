package cn.tedu.min.exception;

import cn.tedu.min.web.State;



public class ServiceException extends RuntimeException{
    private State state;

    public ServiceException(State state){
        this(state,null);
    }

    public ServiceException(State state ,String message){
        super(message);

        if (state == null){
            throw new IllegalArgumentException
                    ("使用ServiceException时,传入无效的状态码!");
        }

        this.state = state;
    }

    public State getState() {
        return state;
    }
}

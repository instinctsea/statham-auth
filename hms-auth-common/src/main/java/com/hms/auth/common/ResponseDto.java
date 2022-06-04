package com.hms.auth.common;

import java.io.Serializable;

public class ResponseDto <T> implements Serializable {
    private Integer code;
    private String message;
    public static final Integer SUCCESS=100000;
    public static final Integer FAILED=0;
    private T data;
    public ResponseDto(int code,String msg,T data){
        this.code=code;
        this.message=msg;
        this.data=data;
    }
    public boolean isSuccess(){
        return SUCCESS.equals(this.code);
    }

    public String getMessage(){
        return this.message;
    }

    public T getData(){return this.data;}

    public static <T> ResponseDto<T> success(T data){
        ResponseDto responseDto=new ResponseDto(SUCCESS,"",data);
        return responseDto;
    }

    public static <T> ResponseDto<T> fail(String msg){
        ResponseDto responseDto=new ResponseDto(FAILED,msg,null);
        return responseDto;
    }
}

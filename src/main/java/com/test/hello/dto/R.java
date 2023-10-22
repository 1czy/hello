package com.test.hello.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Principal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    //0 表示成功。
    private int code;
    private String msg;
    private Object data;
    public static R success(Object data){
        return new R(0 , "处理完成" ,data );
    }
}

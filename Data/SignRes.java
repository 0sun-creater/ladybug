package com.example.ladybug.Data;

import com.google.gson.annotations.SerializedName;

//회원가입 요청시 받을 데이터
public class SignRes {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    public int getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }

}

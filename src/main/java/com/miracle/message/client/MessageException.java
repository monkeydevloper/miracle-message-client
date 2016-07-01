package com.miracle.message.client;

/**
 * Created by HHF on 2016/7/1.
 */
public class MessageException extends Exception  {


    String code;

    public MessageException(String code, String message, Throwable cause){
        super( message, cause);
        this.code = code;
    }

    public MessageException(String code, String message){
        super( message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return  code + ',' + getMessage();
    }
}

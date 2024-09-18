package com.starline.shared.dto;
/*
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 9/18/2024 2:50 PM
@Last Modified 9/18/2024 2:50 PM
Version 1.0
*/

public class BaseResponse<T> {

    private String responseCode;
    private String responseMessage;

    private T data;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "BaseResponse{" + "responseCode='" + responseCode + '\'' + ", responseMessage='" + responseMessage + '\'' + ", data=" + data + '}';
    }
}

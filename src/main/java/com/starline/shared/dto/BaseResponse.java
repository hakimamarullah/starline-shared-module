package com.starline.shared.dto;
/*
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 9/18/2024 2:50 PM
@Last Modified 9/18/2024 2:50 PM
Version 1.0
*/

import lombok.Data;

@Data
public class BaseResponse<T> {

    private String responseCode;
    private String responseMessage;

    private T data;
}

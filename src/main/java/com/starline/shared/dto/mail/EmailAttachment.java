package com.starline.shared.dto.mail;
/*
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 9/18/2024 7:50 PM
@Last Modified 9/18/2024 7:50 PM
Version 1.0
*/

import lombok.Data;

import java.io.Serializable;

@Data
public class EmailAttachment implements Serializable {
    private byte[] content;
    private String fileName;

    private String contentType;

    public EmailAttachment(){}

    public EmailAttachment(byte[] content, String fileName, String contentType) {
        this.content = content;
        this.fileName = fileName;
        this.contentType = contentType;
    }

}

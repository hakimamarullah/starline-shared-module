package com.starline.shared.dto.mail;
/*
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 9/18/2024 7:49 PM
@Last Modified 9/18/2024 7:49 PM
Version 1.0
*/

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SendEmailRequestAmqp implements Serializable {
    private List<String> recipients;
    private List<String> cc;
    private List<EmailAttachment> attachments;
    private String subject;
    private String textBody;
    private Boolean isHtml;

}

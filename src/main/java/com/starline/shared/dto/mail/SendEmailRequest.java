package com.starline.shared.dto.mail;
/*
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 9/18/2024 2:53 PM
@Last Modified 9/18/2024 2:53 PM
Version 1.0
*/

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
public class SendEmailRequest implements Serializable {

    private List<String> recipients;
    private List<String> cc;
    private transient List<MultipartFile> attachments;
    private String subject;
    private String textBody;
    private Boolean isHtml;

    public List<EmailAttachment> getEmailAttachments() throws IOException {
        List<EmailAttachment> emailAttachments = new ArrayList<>();
        if (attachments != null) {
            emailAttachments = new ArrayList<>();
            for (MultipartFile attachment : attachments) {
                emailAttachments.add(new EmailAttachment(attachment.getBytes(), attachment.getOriginalFilename(), attachment.getContentType()));
            }
            return emailAttachments;
        }
        return emailAttachments;
    }

}
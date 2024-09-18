package com.starline.shared.dto.mail;
/*
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 9/18/2024 2:53 PM
@Last Modified 9/18/2024 2:53 PM
Version 1.0
*/

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SendEmailRequest {

    private List<String> recipients;
    private List<String> cc;
    private List<MultipartFile> attachments;
    private String subject;
    private String textBody;
    private Boolean isHtml;

    public Map<String, byte[]> getAttachmentFiles() throws IOException {
        Map<String, byte[]> files = new HashMap<>();
        if (attachments != null && !attachments.isEmpty()) {
            for (var file : attachments) {
                files.put(file.getOriginalFilename(), file.getBytes());
            }
        }
        return files;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public List<MultipartFile> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<MultipartFile> attachments) {
        this.attachments = attachments;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public Boolean getIsHtml() {
        return isHtml;
    }

    public void setIsHtml(Boolean html) {
        isHtml = html;
    }
}
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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SendEmailRequest implements Serializable {

    private List<String> recipients;
    private List<String> cc;
    private transient List<MultipartFile> attachments;
    private String subject;
    private String textBody;
    private Boolean isHtml;

    public List<EmailAttachment> getAttachments() throws IOException {
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

    public List<MultipartFile> getMultipartAttachments() {
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

    public String toString() {
        return "SendEmailRequest{" + "recipients=" + recipients + ", cc=" + cc + ", attachments=" + attachments + ", subject='" + subject + '\'' + ", textBody='" + textBody + '\'' + ", isHtml=" + isHtml + '}';
    }
}
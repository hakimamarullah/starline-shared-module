package com.starline.shared.dto.mail;
/*
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 9/18/2024 7:49 PM
@Last Modified 9/18/2024 7:49 PM
Version 1.0
*/

import java.io.Serializable;
import java.util.List;

public class SendEmailRequestAmqp implements Serializable {
    private List<String> recipients;
    private List<String> cc;
    private List<EmailAttachment> attachments;
    private String subject;
    private String textBody;
    private Boolean isHtml;

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

    public List<EmailAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<EmailAttachment> attachments) {
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

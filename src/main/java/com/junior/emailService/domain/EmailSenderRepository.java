package com.junior.emailservice.domain;

public interface EmailSenderRepository {
    void sendEmail(String email, String subject, String body);
}
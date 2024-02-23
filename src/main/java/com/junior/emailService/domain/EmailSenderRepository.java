package com.junior.emailService.domain;

public interface EmailSenderRepository {
    void sendEmail(String email, String subject, String body);
}
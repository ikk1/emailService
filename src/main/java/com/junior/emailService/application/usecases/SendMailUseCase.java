package com.junior.emailservice.application.usecases;

public interface SendMailUseCase {
    void sendMail(String recipient, String subject, String body);
}

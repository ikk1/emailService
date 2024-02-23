package com.junior.emailService.application.usecases;

public interface SendMailUseCase {
    void sendMail(String recipient, String subject, String body);
}

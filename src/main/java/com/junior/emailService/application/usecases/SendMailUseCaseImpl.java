package com.junior.emailservice.application.usecases;

import com.junior.emailservice.domain.EmailSenderRepository;

public class SendMailUseCaseImpl implements SendMailUseCase {

    EmailSenderRepository emailSenderRepository;

    public SendMailUseCaseImpl(EmailSenderRepository emailSenderRepository) {
        this.emailSenderRepository = emailSenderRepository;
    }

    @Override
    public void sendMail(String recipient, String subject, String body) {
        emailSenderRepository.sendEmail(recipient, subject, body);
    }
}
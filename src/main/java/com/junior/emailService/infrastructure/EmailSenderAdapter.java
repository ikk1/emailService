package com.junior.emailservice.infrastructure;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.junior.emailservice.domain.EmailSenderRepository;

@Service
public class EmailSenderAdapter implements EmailSenderRepository {

    private final JavaMailSender javaMailSender;

    public EmailSenderAdapter(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(String email, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject(subject);
        message.setText(body);
        javaMailSender.send(message);
    }
}

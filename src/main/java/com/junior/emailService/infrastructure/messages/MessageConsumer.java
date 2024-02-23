package com.junior.emailService.infrastructure.messages;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.junior.emailService.domain.EmailSenderRepository;
import com.junior.emailService.infrastructure.EmailSenderAdapter;

@Component
public class MessageConsumer {

    private final EmailSenderRepository emailSenderRepository;

    public MessageConsumer(EmailSenderAdapter emailSenderAdapter) {
        this.emailSenderRepository = emailSenderAdapter;
    }

    @RabbitListener(queues = "student-queue")
    public void receiveMessage(StudentCreatedMessage message) {
        System.out.println("Received message from student-exchange: " + message);
        emailSenderRepository.sendEmail(message.getEmail(), "teste", "teste de body");

    }
}

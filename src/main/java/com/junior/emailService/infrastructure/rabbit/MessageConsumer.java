package com.junior.emailService.infrastructure.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.junior.emailService.application.messages.StudentCreatedMessage;

@Component
public class MessageConsumer {
    @RabbitListener(queues = "student-queue")
    public void receiveMessage(StudentCreatedMessage message) {
        System.out.println("Received message from student-exchange: " + message);
        // Aqui você pode adicionar a lógica para processar a mensagem recebida
    }
}

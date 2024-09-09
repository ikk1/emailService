package com.junior.emailService.infrastructure.messages;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.junior.emailService.domain.EmailSenderRepository;
import com.junior.emailService.infrastructure.EmailSenderAdapter;

@Component
public class KafkaMessageConsumer implements MessageConsumer {

    private final EmailSenderRepository emailSenderRepository;
    private final ObjectMapper objectMapper;

    public KafkaMessageConsumer(EmailSenderAdapter emailSenderAdapter, ObjectMapper objectMapper) {
        this.emailSenderRepository = emailSenderAdapter;
        this.objectMapper = objectMapper;
    }

    @Override
    @KafkaListener(topics = "student-topic", groupId = "student-group")
    public void receiveMessage(String message) throws JsonMappingException, JsonProcessingException {
        System.out.println("Received <" + message + ">");
        StudentCreatedMessage studentCreatedMessage = objectMapper.readValue(message, StudentCreatedMessage.class);
        emailSenderRepository.sendEmail(
                studentCreatedMessage.getEmail(),
                String.format("Olá %s", studentCreatedMessage.getName()),
                "This is a test e-mail!"
        );
    }
}

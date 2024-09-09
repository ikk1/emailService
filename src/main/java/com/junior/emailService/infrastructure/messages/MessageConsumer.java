package com.junior.emailService.infrastructure.messages;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface MessageConsumer {
    void receiveMessage(String message) throws JsonMappingException, JsonProcessingException;
}

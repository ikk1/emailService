package com.junior.emailService.infrastructure.messages;

import java.io.Serializable;

public class StudentCreatedMessage implements Serializable {

    private String name;
    private String email;

    public StudentCreatedMessage() {
    }

    public StudentCreatedMessage(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
package com.junior.emailService.domain;

public class Email {

    private String name;
    private String email;

    public Email(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

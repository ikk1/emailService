package com.junior.emailservice.infrastructure.dto;

public class EmailDTO {

    private String name;
    private String email;

    public EmailDTO(String name, String email) {
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

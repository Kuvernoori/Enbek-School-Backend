package com.cozy.QuizSystem.application.dto;

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank (message = "Phone number is required")
    private String phone;

    @NotBlank (message = "Password is required")
    private String password;

    public String getPhone() {return phone;}
    public String getPassword() {return password;}
}

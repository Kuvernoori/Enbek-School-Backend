package com.cozy.QuizSystem.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UpdateProfileRequest {
    private String firstName;
    private String lastName;
    private String secondName;

    @Email (message = "Invalid email format")
    private String email;

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getSecondName() {return secondName;}
    public String getEmail() {return email;}
}

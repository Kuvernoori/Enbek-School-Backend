package com.cozy.QuizSystem.application.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class AdminUpdateProfileRequest {
    String firstName;
    String lastName;
    String secondName;

    @Email(message = "Invalid email format")
    String email;
}

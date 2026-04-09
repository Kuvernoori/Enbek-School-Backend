package com.cozy.QuizSystem.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProfileRequest {
    String firstName;
    String lastName;
    String secondName;
    @Email (message = "Invalid email format")
    String email;
    LocalDate birthDate;

}

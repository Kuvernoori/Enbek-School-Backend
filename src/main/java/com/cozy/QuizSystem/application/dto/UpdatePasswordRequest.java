package com.cozy.QuizSystem.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class UpdatePasswordRequest {

    @NotBlank(message = "Old password is required")
    private String oldPassword;

    @NotBlank(message = "New password is required")
    @Size(min = 6, max = 32, message = ("Password must be between 6 and 32 characters"))
    private String newPassword;

    public String getOldPassword() {return oldPassword;}
    public String getNewPassword() {return newPassword;}
}

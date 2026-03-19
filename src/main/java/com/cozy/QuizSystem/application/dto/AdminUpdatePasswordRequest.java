package com.cozy.QuizSystem.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AdminUpdatePasswordRequest {
    @NotBlank(message = "New password is required")
    @Size(min = 6, max = 32)
    String newPassword;

}

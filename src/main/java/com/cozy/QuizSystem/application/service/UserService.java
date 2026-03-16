package com.cozy.QuizSystem.application.service;

import com.cozy.QuizSystem.application.dto.UpdatePasswordRequest;
import com.cozy.QuizSystem.application.dto.UpdateProfileRequest;
import com.cozy.QuizSystem.application.dto.UserResponse;

public interface UserService {
    UserResponse getProfile(String phone);
    UserResponse updateProfile(String phone, UpdateProfileRequest request);
    void updatePassword(String phone, UpdatePasswordRequest request);
}

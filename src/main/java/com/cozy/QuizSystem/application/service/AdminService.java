package com.cozy.QuizSystem.application.service;

import com.cozy.QuizSystem.application.dto.*;
import java.util.List;

public interface AdminService {
    List<UserResponse> getAllUsers();
    UserResponse getUserById(Long id);
    UserResponse updateProfile(Long id, AdminUpdateProfileRequest request);
    void updatePassword(Long id, AdminUpdatePasswordRequest request);
    void deleteUser(Long id);
    void changeRole(Long id, String role);
}

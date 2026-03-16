package com.cozy.QuizSystem.api.controller;

import com.cozy.QuizSystem.application.dto.*;
import com.cozy.QuizSystem.application.service.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@SecurityRequirement(name = "bearerAuth")
@RequestMapping("/api/profile")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public ResponseEntity<UserResponse>getProfile(
            @AuthenticationPrincipal String phone) {
        return ResponseEntity.ok(userService.getProfile(phone));
    }
    @PatchMapping
    @SecurityRequirement(name = "bearerAuth")
    public ResponseEntity<UserResponse>updateProfile(
            @AuthenticationPrincipal String phone,
            @Valid @RequestBody UpdateProfileRequest request) {
        return ResponseEntity.ok(userService.updateProfile(phone, request));
    }

    @PatchMapping("/password")
    public ResponseEntity<Void> updatePassword(
            @AuthenticationPrincipal String phone,
            @Valid @RequestBody UpdatePasswordRequest request) {
        userService.updatePassword(phone, request);
        return ResponseEntity.ok().build();
    }
}

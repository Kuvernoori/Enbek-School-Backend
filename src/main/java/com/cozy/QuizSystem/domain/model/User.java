package com.cozy.QuizSystem.domain.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    Long id;
    String phone;
    String role;
    String firstName;
    String lastName;
    LocalDate birthDate;
    String secondName;
    String email;
    String password;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public User(Long id, String phone, String role, String firstName, String lastName, String secondName, String email, String password, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.phone = phone;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Long getId() {return id;}
    public String getPhone() {return phone;}
    public String getRole() {return role;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getSecondName() {return secondName;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
    public LocalDateTime getCreatedAt() {return createdAt;}
    public LocalDateTime getUpdatedAt() {return updatedAt;}
}

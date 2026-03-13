package com.cozy.QuizSystem.infrastructure.persistence;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private String Role;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String lastName;

    @Column(nullable = true)
    private String SecondName;

    @Column(nullable = true, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = createdAt;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
    public Long getId() { return id; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getRole() { return Role; }
    public void setRole(String Role) { this.Role = Role; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String  lastName) { this.lastName = lastName; }
    public String getSecondName() { return SecondName; }
    public void setSecondName(String secondName) { this.SecondName = secondName; }
    public String getEmail() {return email;}
    public void setEmail(String email){ this.email = email; }
    public String getPassword(){ return password; }
    public void setPassword(String password){ this.password = password;}
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }

}
package com.cozy.QuizSystem.application.dto;
import jakarta.validation.constraints.*;

public class RegisterRequest {

    @NotBlank(message = "Phone is required")
    @Pattern(
            regexp = "^(\\+7|8|7|\\+8)[0-9]{10}$",
            message = "Invalid phone format. Example: +77001234567 or 87001234567"
    )
    private String phone;

    @NotBlank(message = "Role is required")
    private String role;

    @NotBlank(message = "First name is required")
    private String firstName;

    private String lastName;

    private String secondName;

    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 32, message = "Password must be between 6 and 32 characters")
    private String password;

    public String getPhone() {return phone;}
    public String getRole() {return role;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getSecondName() {return secondName;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}

}

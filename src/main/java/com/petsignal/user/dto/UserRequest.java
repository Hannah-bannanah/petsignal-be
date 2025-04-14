package com.petsignal.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(name = "UserRequest", description = "Request for creating or updating a user")
public class UserRequest {
    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    private String username;
    
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)\\.[A-Za-z]{2,}$", message = "Email must contain @ and a valid domain")
    @Size(max = 100, message = "Email must not exceed 100 characters")
    private String email;
    
    @Email(message = "Invalid subscription email format")
    @Pattern(regexp = "^([A-Za-z0-9+_.-]+@(.+)\\.[A-Za-z]{2,})?$", message = "Subscription email must contain @ and a valid domain")
    @Size(max = 100, message = "Subscription email must not exceed 100 characters")
    private String subscriptionEmail;
    
    @Size(max = 20, message = "Phone number must not exceed 20 characters")
    private String phoneNumber;
} 
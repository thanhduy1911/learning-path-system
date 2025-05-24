package com.learning_path_system.user_service.dto;

import com.learning_path_system.user_service.validation.ValidPassword;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.Set;

@Data
public class UserCreateRequest {
    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Username can only contain letters, numbers and underscores")
    private String username;
    
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;
    
    @NotBlank(message = "Password is required")
    @ValidPassword
    private String password;

    @Size(max = 50, message = "First name cannot exceed 50 characters")
    private String firstName;
    @Size(max = 50, message = "Last name cannot exceed 50 characters")
    private String lastName;
    @Pattern(regexp = "^\\+?[0-9]{10,15}$")
    private String phoneNumber;
    @NotEmpty(message = "At least one role must be assigned")
    private Set<Long> roleIds;
} 
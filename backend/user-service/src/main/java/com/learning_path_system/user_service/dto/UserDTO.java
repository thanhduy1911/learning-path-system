package com.learning_path_system.user_service.dto;

import lombok.Data;
import lombok.Builder;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String avatarUrl;
    //private Set<RoleDTO> roles;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
} 
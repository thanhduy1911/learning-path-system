package com.learning_path_system.user_service.service;

import com.learning_path_system.user_service.dto.UserDTO;
import com.learning_path_system.user_service.dto.UserCreateRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDTO createUser(UserCreateRequest request);
    UserDTO getUserById(Long id);
    UserDTO getUserByEmail(String email);
    UserDTO updateUser(Long id, UserCreateRequest request);
    void deleteUser(Long id);
    Page<UserDTO> getAllUsers(Pageable pageable);
} 
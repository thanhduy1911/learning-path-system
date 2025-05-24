package com.learning_path_system.user_service.exception.validation;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidationError {
    @NotBlank
    private String field;
    @NotBlank
    private String message;
    private Object rejectedValue;
}

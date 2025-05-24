package com.learning_path_system.user_service.exception.validation;

import com.learning_path_system.user_service.exception.BaseException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
public class ValidationException extends BaseException {
    private final List<ValidationError> errors;

    public ValidationException(List<ValidationError> errors) {
        super("Validation failed", "VALIDATION_ERROR", HttpStatus.BAD_REQUEST);
        this.errors = errors;
    }

    public static ValidationException of(String field, String message) {
        return new ValidationException(List.of(
                ValidationError.builder()
                        .field(field)
                        .message(message)
                        .build()
        ));
    }
}

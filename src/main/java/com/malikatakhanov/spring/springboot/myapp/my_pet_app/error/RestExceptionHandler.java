package com.malikatakhanov.spring.springboot.myapp.my_pet_app.error;

import com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto.ErrorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    protected ResponseEntity<ErrorDto> handleConflict(){
        return ResponseEntity
                .status(400)
                .header("zalupa", "50cm")
                .body(new ErrorDto(400, "Some Exception"));
    }
}

package com.youngchayoungcha.tastynote.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// Controller 혹은 Rest Controller에서 발생한 예외를 한 곳에서 관리하고 처리할 수 있게 도와주는 어노테이션.
@RestControllerAdvice
public class ControllerExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @ExceptionHandler(ElementNotFoundException.class)
    protected ResponseEntity<ErrorResponse> handleElementNotFoundException() {
        logger.error("handle element not found exception");

        ErrorResponse errorResponse = ErrorResponse.create()
                .message("Element Not found")
                .status(404);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}

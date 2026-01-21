package com.example.exceptions.exceptions.Handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class HandlerErrors {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handlerArithmeticException(ArithmeticException ERROR) {
        return new ResponseEntity<>("Error: Division by zero is not allowed.", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handlerNullPointerException(NullPointerException ERROR) {
        return new ResponseEntity<>("Error: Attempted to access a null object.", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handlerNumberFormatException(NumberFormatException ERROR) {
        return new ResponseEntity<>("Error: Invalid number format.", HttpStatus.BAD_REQUEST);
    }

}

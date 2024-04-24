package com.amikelmaxi.backreccord.servicereccord.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(ObjectDuplicateCreateException.class)
    public ResponseEntity<StandardError> objectDuplicateCreateException(ObjectDuplicateCreateException e){
        StandardError err = new StandardError(e.getMessage(), HttpStatus.CONFLICT.value());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(err);
    }

    @ExceptionHandler(ObjectSearchIdNotFoundException.class)
    public ResponseEntity<StandardError> objectSearchIdNotFoundException(ObjectSearchIdNotFoundException e){
        StandardError err = new StandardError(e.getMessage(), HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
    
    
}

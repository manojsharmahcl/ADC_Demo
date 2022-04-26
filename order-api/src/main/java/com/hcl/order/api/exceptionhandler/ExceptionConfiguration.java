package com.hcl.order.api.exceptionhandler;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ExceptionConfiguration {

  @ResponseStatus(HttpStatus.ACCEPTED)
  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<ErrorResponse> resourceNotFoundException(RuntimeException ex, WebRequest request) {
    
	    return new ResponseEntity<ErrorResponse>(new ErrorResponse(ex.getMessage()), HttpStatus.NOT_FOUND);
	  }

}

package com.app.ExceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHAndler {
	
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
		System.out.println("In method Argument Not VAlid "+e);
		
		return null;
		
	}

}

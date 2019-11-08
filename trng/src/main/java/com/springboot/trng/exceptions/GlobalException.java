package com.springboot.trng.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springboot.trng.customexception.UserNotFoundException;
import com.springboot.trng.model.UserErrorResponse;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Exception> handleAnyException(Exception ex) {
		
		return new ResponseEntity<Exception>(ex,HttpStatus.BAD_REQUEST);
	}
	
	//Handling custom exception
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<UserErrorResponse> handleUserNotFoundException(UserNotFoundException ex) {
		
		UserErrorResponse response = new UserErrorResponse();
		response.setMessage(ex.getMessage());
		response.setStatuscode(String.valueOf(HttpStatus.NO_CONTENT));
		response.setDate(System.currentTimeMillis());
		
		return new ResponseEntity<UserErrorResponse>(response,HttpStatus.BAD_REQUEST);
	}
}

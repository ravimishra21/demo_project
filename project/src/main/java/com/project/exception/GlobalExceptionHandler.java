package com.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	
	
//  Exception handling for data is not created
	@ExceptionHandler(value=DataNotCreatedException.class)
	public ResponseEntity<ErrorMessage> handleDataNotCreatedException(DataNotCreatedException ex , WebRequest req) {
		
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.BAD_REQUEST , ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
	}
	
	

//  Exception handling for user not found
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleUserNotAvailableException(UserNotFoundException ex , WebRequest req){
		
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND , ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}
	
	

//  Exception handling for authentication
	@ExceptionHandler(value=AuthenticationException.class)
	public ResponseEntity<ErrorMessage> handleAuthenticationException(AuthenticationException ex , WebRequest req){
		
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.UNAUTHORIZED , ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}
	
	
	
	
	
	
}

package com.app.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InvalidSubscriptionDataException.class)
	public ResponseEntity<String> handleInvalid(InvalidSubscriptionDataException ex) {
		return ResponseEntity.badRequest().body("Validation error: " + ex.getMessage());
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegal(IllegalArgumentException ex) {
		return ResponseEntity.badRequest().body("Bad request: " + ex.getMessage());
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAll(Exception ex) {
		return ResponseEntity.internalServerError().body("Server error: " + ex.getMessage());
	}
}

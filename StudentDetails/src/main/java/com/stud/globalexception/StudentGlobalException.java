package com.stud.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.stud.exception.AgeException;

@RestControllerAdvice
public class StudentGlobalException {

	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> not(AgeException ae) {
		return new ResponseEntity<>("not eligible", HttpStatus.NOT_FOUND);
	}

}

package com.cust.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cust.exception.NameException;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(NameException.class)
	public ResponseEntity<Object> notfound(NameException ne) {
		return new ResponseEntity("name not found", HttpStatus.NOT_FOUND);
	}

}

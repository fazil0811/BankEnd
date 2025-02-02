package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@Value("${a}")
	String a;
	
	@GetMapping(value="/getvalue")
	public String getvalue() {
		return a;
	}

}

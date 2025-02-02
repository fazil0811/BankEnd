package com.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping(value = "/getstudent")
	public String student() {
		return "this is student";
	}
	
	@GetMapping(value = "/getteacher")
	public String teacher() {
		return "this is teacher";
	}
	
	@GetMapping(value = "/getmanager")
	public String manager() {
		return "this is manager";
	}
	
	

}

package com.sec;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class SecController {
	
	@GetExchange(value="/find") 
	public String find() {
		return "hai";
	}

}

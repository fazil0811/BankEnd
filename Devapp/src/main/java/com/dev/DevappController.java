package com.dev;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/get")
public class DevappController {

	@GetMapping(value = "/get")
	public String get() {
		return "hello world";
	}

}
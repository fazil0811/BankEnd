package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
	
	@Qualifier("child1")
	@Autowired
	Parent ps;
	
	
	@GetMapping(value="/check")
	public String check() {
		return ps.getvalue();
	}
	
	@GetMapping(value="/book")
	public int date() {
		return ps.book();
	}

}

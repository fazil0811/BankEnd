package com.sample.shirt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prime {

	@GetMapping(value = "/getPrime")
	public String getPrime(@RequestParam int a) {
		boolean value = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				value = false;
			}
		}
		if (value == true) {
			return "Prime";
		} else {
			return "not prime";
		}
	}
}
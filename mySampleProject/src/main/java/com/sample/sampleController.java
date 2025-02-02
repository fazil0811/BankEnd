package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

	@GetMapping(value = "/getMessage") // endpoint
	public String getMessage() {
		return "hai world";
	}

	@GetMapping(value = "/getNums")
	public int getNums() {
		return 2408;
	}

	@GetMapping(value = "/getAdd/{a}/{b}")
	public int getsum(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping(value = "/getmax/{a}/{b}")
	public float getMax(@PathVariable float a, @PathVariable float b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	@GetMapping(value = "/getReverse/{a}")
	public String getReverse(@PathVariable String a) {
		String b = "";
		// char[] c = a.toCharArray();
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		return b;
	}

	@GetMapping(value = "/getMult")
	public int getMult(@RequestParam int a, @RequestParam int b) {
		return a * b;
	}

	@GetMapping(value = "/getStr")
	public String getStr(@RequestParam String a) {
		return a;
	}
}
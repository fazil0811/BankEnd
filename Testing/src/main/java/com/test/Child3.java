package com.test;

import org.springframework.stereotype.Component;

@Component
public class Child3 implements Parent {

	public String getvalue() {
		return "simply waste";
	}
	
	public int book() {
		return 8;
	}
}

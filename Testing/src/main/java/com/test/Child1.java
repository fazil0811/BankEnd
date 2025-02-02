package com.test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Child1 implements Parent {

	public String getvalue() {
		return "Waste";
	}

	public int book() {
		return 24;
	}

}

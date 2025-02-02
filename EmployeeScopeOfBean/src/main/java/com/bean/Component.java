package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

//@Scope("prototype")
//@org.springframework.stereotype.Component
public class Component {

	private String brand;

	@Value("apple")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public Component() {
		System.out.println("bean is created");
	}

	@Override
	public String toString() {
		return brand;
	}

}

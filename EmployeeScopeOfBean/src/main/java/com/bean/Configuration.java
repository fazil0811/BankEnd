package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class Configuration implements CommandLineRunner {

	@Autowired
	ApplicationContext ac;

	public void run(String... args) throws Exception {
		Component c1 = ac.getBean(Component.class);
		System.out.println(c1);
		Component c2 = ac.getBean(Component.class);
		c2.setBrand("samsung");
		System.out.println(c2);
		Component c3 = ac.getBean(Component.class);
		System.out.println(c3);
	}
	
	@Scope("prototype")
	@Bean
	public Component get() {
		return new Component();
	}
}

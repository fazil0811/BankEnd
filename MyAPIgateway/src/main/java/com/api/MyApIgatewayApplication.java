package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyApIgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApIgatewayApplication.class, args);
	}

}

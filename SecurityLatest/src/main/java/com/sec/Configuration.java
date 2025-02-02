package com.sec;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean
	public UserDetailsService userDetailsService() {
	    return new InMemoryUserDetailsManager(
	        User.withUsername("faz")
	            .password("faz111")
	            .roles("student")
	            .build()
	    );
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return NoOpPasswordEncoder.getInstance(); // For demo purposes only
	}
}

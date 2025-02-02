package com.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@org.springframework.context.annotation.Configuration

public class Configuration extends WebSecurityConfigurerAdapter {

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("Fazil")
//				.password("$2a$12$547jzbWieZVFj4AtoOaEceQC2ZycjNj2tYJtr/VWB6a8cxePJfs3e").roles("student");
//	}
//	@Bean
//	public PasswordEncoder getpassword() {
//		return NoOpPasswordEncoder.getInstance();
//	}

//	@Bean
//	public PasswordEncoder getpass() {
//		return new BCryptPasswordEncoder(12);
//	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Fazil")
				.password("$2a$12$QSRW30/KhLLU.mYzm.jQou13AMe5FkmLtNX1rN9dD/dK4EPrzSG0i").roles("student")
				.and().withUser("Wasim").password("$2a$12$vT49de48uLqUj5mzxF3L0u9cKoErtbrOdHz.cnoG1obEiExDaRYQ2").roles("teacher")
				.and().withUser("Semba").password("$2a$12$Bt74Ue90RxtqhlJMpGD.QuciwyMQyE6ToJA///pRp6H91BZEk5YrS").roles("manager");
	}
	
	@Bean
	public PasswordEncoder getpass() {
		return new BCryptPasswordEncoder(12);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/getmanager").hasRole("manager");
		http.authorizeHttpRequests().antMatchers("/getteacher").hasAnyRole("teacher","manager");
//		http.authorizeHttpRequests().antMatchers("/getstudent").permitAll().and().formLogin(); //it will not ask userid and password
		http.authorizeHttpRequests().antMatchers("/getstudent").hasAnyRole("student","teacher","manager").and().formLogin();// it will ask password
	}

}

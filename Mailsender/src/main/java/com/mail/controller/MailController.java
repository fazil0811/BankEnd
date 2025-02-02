package com.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.entiy.MailEntity;
import com.mail.service.MailService;

@RestController
@RequestMapping(value="/mail")
public class MailController {
	
	@Autowired 
	MailService ms;
	
	@PostMapping(value="/getmail/{mail}")
	public String getmail(@PathVariable String mail, @RequestBody MailEntity a) {
		return ms.getmail(mail,a);
		
	}

}

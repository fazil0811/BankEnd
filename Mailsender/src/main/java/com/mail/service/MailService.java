package com.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.mail.entiy.MailEntity;

@Service
public class MailService {

	@Autowired
	MailSender ms;

//	@Value("$(spring.mail.username)")
//	private String frommail;

	public String getmail(String mail, MailEntity a) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setFrom("fazil6554@gmail.com");
		sm.setSubject(a.getSubject());
		sm.setText(a.getMessage());
		sm.setTo(mail);
		ms.send(sm);
		return "Success";

	}
}

package com.transact.mytransactioncontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transact.mytransaction.MyTransaction;
import com.transact.receiverrepository.ReceiverRepository;
import com.transact.senderrepository.SenderRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping(value="/transact")
public class MyTransactionController {
	
	@Autowired
	SenderRepository sr;
	
	@Autowired
	ReceiverRepository rr;
	
	
	@PostMapping(value="/postvalue") 
	@Transactional
		public String postvalue(@RequestBody MyTransaction a) {
		sr.save(a.getSender());
		int b=10/0;
		rr.save(a.getReceiver());
		return "posted success";
	}

}

package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.BankDAO;
import com.bank.entity.BankEntity;

@Service
public class BankService {

	@Autowired
	BankDAO bd;

	public String postValue(List<BankEntity> a) {
		return bd.postValue(a);
	}
	
	public String getBrnch(String a) {
		return bd.getBrnch(a);
	}

}

package com.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.BankEntity;
import com.bank.repository.BankRepository;

@Repository
public class BankDAO {

	@Autowired
	BankRepository br;

	public String postValue(List<BankEntity> a) {
		br.saveAll(a);
		return "posted";
	}

	public String getBrnch(String a) {
		return br.getBrnch(a);
	}

}

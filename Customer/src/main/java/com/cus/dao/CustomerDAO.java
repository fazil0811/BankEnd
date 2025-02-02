package com.cus.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cus.entity.CustomerEntity;
import com.cus.repository.CustomerRepository;

@Repository
public class CustomerDAO {
	
	@Autowired
	CustomerRepository cr;
	
	public String posVal(List<CustomerEntity> a) {
		cr.saveAll(a);
		return "success";
	}

}

package com.cus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cus.dao.CustomerDAO;
import com.cus.entity.CustomerEntity;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDAO cd;
	
	public String posVal(List<CustomerEntity> a) {
		return cd.posVal(a);
	}

}

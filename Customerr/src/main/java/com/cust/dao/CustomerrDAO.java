package com.cust.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cust.entity.CustomerrEntity;
import com.cust.repository.CustomerrRepository;

@Repository
public class CustomerrDAO {
	
	@Autowired
	CustomerrRepository cr;
	
	public String postvslue(List<CustomerrEntity> a) {
		cr.saveAll(a);
		return "success";
	}
	
	public List<CustomerrEntity> getvalue() {
		return cr.findAll();
	}
	
	public List<Object> getobj(char a,int b) {
		return cr.getobj(a,b);
	}
}

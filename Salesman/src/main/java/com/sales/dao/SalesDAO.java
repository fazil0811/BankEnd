package com.sales.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sales.entity.SalesEntity;
import com.sales.repository.SalesRepository;

@Repository
public class SalesDAO {
	
	@Autowired
	SalesRepository sr;
	
	public String postvalue(List<SalesEntity> a) {
		sr.saveAll(a);
		return "success";
	}
	
	public List<SalesEntity> getvalue() {
		return sr.findAll();
	}
	
	public Object getfin() {
		return sr.getfin();
	}

}

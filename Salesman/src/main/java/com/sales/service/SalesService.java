package com.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.dao.SalesDAO;
import com.sales.entity.SalesEntity;

@Service
public class SalesService {
	
	@Autowired
	SalesDAO sd;
	
	public String postvalue(List<SalesEntity> a) {
		return sd.postvalue(a);
	}
	
	public List<SalesEntity> getvalue() {
		return sd.getvalue();
	}
	
	public Object getfin() {
		return sd.getfin();
	}

}

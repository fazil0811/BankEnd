package com.cust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cust.dao.CustomerrDAO;
import com.cust.entity.CustomerrEntity;
import com.cust.exception.NameException;

@Service
public class CustomerrService {

	@Autowired
	CustomerrDAO cd;

	@Autowired
	RestTemplate rt;

	public String postvalue(List<CustomerrEntity> a) {
		return cd.postvslue(a);
	}

	public List<CustomerrEntity> getvalue() {
		return cd.getvalue();
	}

	public List<Object> getobj(char a, int b) throws NameException {
//		if(cd.getvalue().get(a).getCustomername().startsWith("a") && cd.getvalue().get(b).getPurchaseamount()>500) {
		if (a == 'a' && b > 550) {
			return cd.getobj(a, b);
		} 
		else {
//		return cd.getobj(a,b);
			throw new NameException("Not Found");
		}
	}

}

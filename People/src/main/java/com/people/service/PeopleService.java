package com.people.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.people.dao.PeopleDAO;
import com.people.entity.PeopleEntity;

@Service
public class PeopleService {

	@Autowired
	PeopleDAO pd;
	
	public String postvalue(List<PeopleEntity> a) {
		return pd.postvalue(a);
	}
	
	public List<PeopleEntity> getvalue() {
		return pd.getvalue();
	}
	
	public int getbal(int a,int b) {
//		int val=pd.getvalue().get(a).getamount();
//		val=val-b;
	
		return pd.getbal(a, b);
	}
}

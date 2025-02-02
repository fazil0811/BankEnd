package com.people.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.people.entity.PeopleEntity;
import com.people.repository.PeopleRepository;

@Repository
public class PeopleDAO {

	@Autowired
	PeopleRepository pr;

	public String postvalue(List<PeopleEntity> a) {
		pr.saveAll(a);
		return "success";
	}
	
	public List<PeopleEntity> getvalue() {
		return pr.findAll();
	}
	
	public int getbal(int a,int b) {
		int x=pr.findById(a).get().getamount()-b;
		return x;
	}

}

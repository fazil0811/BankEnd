package com.mark.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mark.entity.MarkEntity;
import com.mark.repository.MarkRepository;

@Repository
public class MarkDAO {
	
	@Autowired
	MarkRepository mr;
	
	public String posValue(List<MarkEntity> a) {
		mr.saveAll(a);
		return "posted";
	}
	
	public List<MarkEntity>getValue() {
		return mr.findAll();
	}
	
	public int gettot(int a) {
		return mr.gettot(a);
	}
	
	public int gettot1(int a) {
		return mr.gettot1(a);
	}
	
	public List<MarkEntity>getmarks() {
		return mr.getmarks();
	}
}
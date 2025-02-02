package com.res.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.res.entity.ResultEntity;
import com.res.repository.ResultRepository;

@Repository
public class ResultDAO {
	
	@Autowired
	ResultRepository rr;
	
	public String postVal(List<ResultEntity> a) {
		rr.saveAll(a);
		return "success";
	}
	
	public List<ResultEntity>getValue() {
		return rr.findAll();
	}
	
	public String putvalue(ResultEntity a) {
		rr.save(a);
		return "success";
	}
	
	public String deletevalue(int a) {
		rr.deleteById(a);
		return "success";
	}
	
	public ResultEntity getmax() {
		return rr.getmax();
	}
	
	public List<ResultEntity> getthree() {
		return rr.getthree();
	}

}

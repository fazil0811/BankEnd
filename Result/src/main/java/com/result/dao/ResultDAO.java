package com.result.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.result.entity.ResultEntity;
import com.result.repository.ResultRepository;

@Repository
public class ResultDAO {
	
	@Autowired
	ResultRepository rr;
	
	public String postval(List<ResultEntity> a) {
		rr.saveAll(a);
		return "posted success";
	}

}

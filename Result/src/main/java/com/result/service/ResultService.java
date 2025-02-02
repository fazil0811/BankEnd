package com.result.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.result.dao.ResultDAO;
import com.result.entity.ResultEntity;

@Service
public class ResultService {
	
	@Autowired
	ResultDAO rd;
	
	public String posval(List<ResultEntity> a) {
		return rd.postval(a);
	}
	

}

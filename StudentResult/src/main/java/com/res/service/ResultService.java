package com.res.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.res.dao.ResultDAO;
import com.res.entity.ResultEntity;
import com.res.pojo.ResultPojo;

@Service
public class ResultService {
	
	@Autowired
	ResultDAO rd;
	
	@Autowired
	RestTemplate rt;
	
	public String postVal(List<ResultEntity> a) {
		return rd.postVal(a);
	}
	
	public List<ResultEntity>getValue() {
		return rd.getValue();
	}
	
	public String putvalue(ResultEntity a) {
		return rd.putvalue(a);
	}
	
	public String deletevalue(int a) {
		return rd.deletevalue(a);
	}
	
	public ResultEntity getmax() {
		return rd.getmax();
	}
	
	public List<ResultEntity> getthree() {
		return rd.getthree();
	}
	
	public List<ResultPojo> getstu() {
		String url="http://localhost:8081/mark/getmarks";
		ResponseEntity<List<ResultPojo>> re=rt.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<ResultPojo>>() {});
		List<ResultPojo>last=re.getBody();
		return last;
	}
	
	

}

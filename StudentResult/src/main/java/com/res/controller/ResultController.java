package com.res.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.res.entity.ResultEntity;
import com.res.pojo.ResultPojo;
import com.res.service.ResultService;


@RestController
@RequestMapping(value="/result")
public class ResultController {

	@Autowired
	ResultService rs;

	@Autowired
	RestTemplate rt;

	@PostMapping(value = "/postVal")
	public String postVal(@RequestBody List<ResultEntity> a) {
		String url1 = "http://localhost:8081/mark/gettot/";
		String url2 = "http://localhost:8081/mark/gettot1/";
		String url3 = "http://localhost:8080/student/getper/";

		a.forEach(x -> {
			int roll = x.getRollno();
			ResponseEntity<Integer> re1 = rt.exchange(url1 + roll, HttpMethod.GET, null, Integer.class);
			int tot1 = re1.getBody();
			ResponseEntity<Integer> re2 = rt.exchange(url2 + roll, HttpMethod.GET, null, Integer.class);
			int tot2 = re2.getBody();
			int total = tot1 + tot2;
			ResponseEntity<Integer> re3 = rt.exchange(url3 + roll, HttpMethod.GET, null, Integer.class);
			int per = re3.getBody();
			if (per > 90) {
				int total1 = 5 + total;
				x.setTotalmarks(total1);
			} else {
				x.setTotalmarks(total);
			}
			x.setPercentage(x.getTotalmarks() * 100 / 400);

		});
		return rs.postVal(a);
	}
	
	@GetMapping(value="/getValue") 
	public List<ResultEntity>getValue() {
		return rs.getValue();
	}

	@PutMapping(value="/putvalue")
	public String putvalue(@RequestBody ResultEntity a) {
		return rs.putvalue(a);
	}
	
	@DeleteMapping(value="/deletevalue/{a}") 
	public String deletevalue(@PathVariable int a) {
		return rs.deletevalue(a);
	}
	
	@GetMapping(value="/getmax")
	public ResultEntity getmax() {
		return rs.getmax();
	}
	
	@GetMapping(value="/getthree")
	public List<ResultEntity> getthree() {
		return rs.getthree();
	}
	
	@GetMapping(value="/getstu")
	public List<ResultPojo>getstu() {
		return rs.getstu();
	}
	
}

package com.people.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.people.entity.PeopleEntity;
import com.people.service.PeopleService;

@RestController
@RequestMapping(value = "/people")
public class PeopleController {

	@Autowired
	PeopleService ps;

	@Autowired
	RestTemplate rt;

	@PostMapping(value = "/postvalue")
	public String postvalue(@RequestBody List<PeopleEntity> a) {

		String url = "http://localhost:8080/bankk/getbm/";
		a.forEach(x -> {
			String code = x.getName();
			ResponseEntity<PeopleEntity> re = rt.exchange(url + code, HttpMethod.GET, null,
					new ParameterizedTypeReference<PeopleEntity>() {
					});
			PeopleEntity last = re.getBody();
			x.setBranch(last.getBranch());
			x.setamount(last.getamount());

		});
		return ps.postvalue(a);
	}
	
	@GetMapping(value="/getvalue")
	public List<PeopleEntity> getvalue() {
		return ps.getvalue();
	}
	
	@GetMapping(value="/getbal/{a}/{b}")
	public int getbal(@PathVariable int a,@PathVariable int b) {
		return ps.getbal(a,b);
	}

}

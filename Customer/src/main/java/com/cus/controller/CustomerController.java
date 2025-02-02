package com.cus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cus.entity.CustomerEntity;
import com.cus.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	CustomerService cs;
	@Autowired
	RestTemplate rt;

	@PostMapping(value = "/posValue")
	public String posVal(@RequestBody List<CustomerEntity> a) {
		String url = "http://localhost:8080/bank/getBrnch/";

		a.forEach(x -> {
			String ifsc = x.getIfsccode();
			ResponseEntity<String> re = rt.exchange(url + ifsc, HttpMethod.GET, null, String.class);
			String cusBranch = re.getBody();
			x.setBranch(cusBranch);
		});
		return cs.posVal(a);
	}
}
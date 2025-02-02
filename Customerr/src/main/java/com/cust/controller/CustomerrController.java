package com.cust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cust.entity.CustomerrEntity;
import com.cust.exception.NameException;
import com.cust.service.CustomerrService;

@RestController
@RequestMapping(value = "/customerr")
public class CustomerrController {

	@Autowired
	CustomerrService cs;

	@PostMapping(value = "/postvalue")
	public String postvalue(@RequestBody List<CustomerrEntity> a) {
		return cs.postvalue(a);
	}

	@GetMapping(value = "/getvalue")
	public List<CustomerrEntity> getvalue() {
		return cs.getvalue();
	}

	@GetMapping(value = "/getobj/{a}/{b}")
	public List<Object> getobj(@PathVariable char a, @PathVariable int b) throws NameException {
		return cs.getobj(a, b);
	}

}

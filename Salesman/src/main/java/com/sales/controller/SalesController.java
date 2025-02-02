package com.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.entity.SalesEntity;
import com.sales.service.SalesService;

@RestController
@RequestMapping(value = "/sales")
public class SalesController {

	@Autowired
	SalesService ss;

	@PostMapping(value = "/postvalue")
	public String postvalue(@RequestBody List<SalesEntity> a) {
		return ss.postvalue(a);
	}

	@GetMapping(value = "/getvalue")
	public List<SalesEntity> getvalue() {
		return ss.getvalue();
	}

	@GetMapping(value = "/getfin")
	public Object getfin() {
		return ss.getfin();
	}

}

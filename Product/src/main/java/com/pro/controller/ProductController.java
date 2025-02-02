package com.pro.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.entity.ProductEntity;
import com.pro.service.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	static Logger log=Logger.getLogger(ProductController.class);	
	
	@PostMapping(value="/postValue")
	public String postValue(@RequestBody List<ProductEntity> a) {
		return ps.postValue(a);
	}
	
	@GetMapping(value="/getValue")
	public List<ProductEntity> getValue() {
		
		PropertyConfigurator.configure("log4jj.properties");
		log.info(ps.getValue());
		return ps.getValue();
	}

}

package com.mark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mark.entity.MarkEntity;
import com.mark.service.MarkService;

@RestController
@RequestMapping(value="/mark")
public class MarkController {
	
	@Autowired
	MarkService ms;
	
	@PostMapping(value="/posValue")
	public String posValue(@RequestBody List<MarkEntity> a) {
		return ms.posValue(a);
	}
	
	@GetMapping(value="/getValue")
	public List<MarkEntity>getValue() {
		return ms.getValue();
	}
	
	@GetMapping(value="/gettot/{a}") 
		public int gettot(@PathVariable int a) {
			return ms.gettot(a);
	}
	
	@GetMapping(value="/gettot1/{a}") 
	public int gettot1(@PathVariable int a) {
		return ms.gettot1(a);
	}
	
	@GetMapping(value="getmarks")
	public List<MarkEntity>getmarks() {
		return ms.getmarks();
	}
}

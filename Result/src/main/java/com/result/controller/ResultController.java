package com.result.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.result.entity.ResultEntity;
import com.result.service.ResultService;

@RestController
@RequestMapping(value="/result")
public class ResultController {
	
	@Autowired
	ResultService rs;
	
	@PostMapping(value="/postval")
	public String postval(@RequestBody List<ResultEntity> a) {
		return rs.posval(a);
	}

}

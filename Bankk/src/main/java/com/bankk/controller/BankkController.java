package com.bankk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankk.entity.BankkEntity;
import com.bankk.service.BankkService;

@RestController
@RequestMapping(value = "/bankk")
public class BankkController {

	@Autowired
	BankkService bs;

	@PostMapping(value = "/postvalue")
	public String postvalue(@RequestBody List<BankkEntity> a) {
		return bs.postvalue(a);
	}

	@GetMapping(value = "/getvalue")
	public List<BankkEntity> getvalue() {
		return bs.getvalue();
	}

	@GetMapping(value = "/getbm/{a}")
	public BankkEntity bm(@PathVariable String a) {
		return bs.bm(a);
	}

}

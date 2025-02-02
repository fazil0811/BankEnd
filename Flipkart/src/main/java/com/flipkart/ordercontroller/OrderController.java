package com.flipkart.ordercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.orderentity.OrderEntity;
import com.flipkart.orderservice.OrderService;

@RestController
@RequestMapping(value="/flipkart")
public class OrderController {
	
	@Autowired
	OrderService os;
	
	@PostMapping(value="/postvalue")
	public String postvalue(@RequestBody OrderEntity a) {
		return os.postvalue(a);
	}
	
	@GetMapping(value="/getvalue")
	public List<OrderEntity> getall() {
		return os.getall();
	}
	
	@GetMapping(value="/getname/{a}")
	public List<String> getname(@PathVariable int a) {
		return os.getname(a);
	}

}

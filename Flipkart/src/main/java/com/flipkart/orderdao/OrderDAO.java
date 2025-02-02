package com.flipkart.orderdao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flipkart.orderentity.OrderEntity;
import com.flipkart.orderrepository.OrderRepository;

@Repository

public class OrderDAO {
	
	@Autowired
	OrderRepository or;
	
	public String postvalue(OrderEntity a) {
		or.save(a);
		return "posted success";
	}
	
	public List<OrderEntity> getall() {
		return or.findAll();
	}
	
	public List<String> getname(int a) {
		return or.getname(a);
	}

}

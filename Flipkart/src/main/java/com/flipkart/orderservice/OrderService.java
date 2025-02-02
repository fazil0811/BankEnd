package com.flipkart.orderservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.orderdao.OrderDAO;
import com.flipkart.orderentity.OrderEntity;
import com.flipkart.orderrepository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderDAO od;;
	
	public String postvalue(OrderEntity a) {
		return od.postvalue(a);
	}
	
	public List<OrderEntity> getall() {
		return od.getall();
	}
	
	public List<String> getname(int a) {
		return od.getname(a);
	}

}

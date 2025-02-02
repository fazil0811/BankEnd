package com.ecom.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecom.product.Product;
import com.ecom.repository.ProductRepository;

@Repository
public class ProductDAO {
	
	@Autowired
	ProductRepository pr;
	
	public String postvalue(Product a) {
		pr.save(a);
		return "posted successfully";
	}

}

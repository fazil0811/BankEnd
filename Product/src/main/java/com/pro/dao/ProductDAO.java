package com.pro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pro.entity.ProductEntity;
import com.pro.repository.ProductRepository;

@Repository
public class ProductDAO {
	
	@Autowired
	ProductRepository pr;
	
	public String postValue(List<ProductEntity> a) {
		pr.saveAll(a);
		return "post success";
	}
	
	public List<ProductEntity> getValue() {
		return pr.findAll();
	}

}

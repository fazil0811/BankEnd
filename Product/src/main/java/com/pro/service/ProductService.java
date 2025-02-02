package com.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.dao.ProductDAO;
import com.pro.entity.ProductEntity;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO pd;
	
	public String postValue(List<ProductEntity> a) {
		return pd.postValue(a);
	}
	
	public List<ProductEntity> getValue() {
		return pd.getValue();
	}
}

package com.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecom.dao.ProductDAO;
import com.ecom.product.Product;


@Service
public class ProductService {
	
	@Autowired
	ProductDAO pd;
	
	public String postvalue(Product a) {
		return pd.postvalue(a);
	}

}

package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.product.pojoclass.ProductPojoclass;

@RestController
public class ProductController {

	@Autowired
	RestTemplate rt;

	@GetMapping(value = "/getAllProductWithGst")
	public List<ProductPojoclass> getAllProductWithGst() {
		String url1 = "http://localhost:8080/product/getValue";
		String url2 = "http://localhost:8085/gst/getPer/";
		ResponseEntity<List<ProductPojoclass>> re1 = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ProductPojoclass>>() {
				});
		List<ProductPojoclass> products = re1.getBody();
		products.forEach(x -> {
			int hsn = x.getHsnCode();
			ResponseEntity<Integer> re2 = rt.exchange(url2 + hsn, HttpMethod.GET, null, Integer.class);
			int percent = re2.getBody();
			int netPrice = x.getPrice() + (x.getPrice() * percent / 100);
			x.setPrice(netPrice);
		});
		return products;

	}
}

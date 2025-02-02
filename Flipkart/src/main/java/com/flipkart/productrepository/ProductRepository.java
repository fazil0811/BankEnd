package com.flipkart.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.productentity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}

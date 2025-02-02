package com.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {

}

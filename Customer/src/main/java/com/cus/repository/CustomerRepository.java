package com.cus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cus.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {

}

package com.cust.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cust.entity.CustomerrEntity;

public interface CustomerrRepository extends JpaRepository<CustomerrEntity, Integer> {
	
@Query(value="select customername,purchaseamount from sales.customerr where customername like ?% and purchaseamount>?",nativeQuery = true)

public List<Object> getobj(char a,int b);
	
}

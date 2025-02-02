package com.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sales.entity.SalesEntity;

public interface SalesRepository extends JpaRepository<SalesEntity, Integer> {

	@Query(value = "select salesmanname,commission from sales.sales where commission=(select max(commission) from sales.sales)", nativeQuery = true)
	public Object getfin();
	


}

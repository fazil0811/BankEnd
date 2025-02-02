package com.flipkart.orderrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flipkart.orderentity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

	@Query(value = "select * from ordertable left join producttable on ordertable.id=producttable.order_fkey", nativeQuery = true)
	public List<OrderEntity> getall();

	@Query(value = "select producttable.productname from ordertable inner join producttable on ordertable.id=producttable.order_fkey where ordertable.pincode=?", nativeQuery = true)
	public List<String> getname(int a);
}

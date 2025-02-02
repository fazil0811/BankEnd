package com.bankk.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bankk.entity.BankkEntity;

public interface BankkRepository extends JpaRepository<BankkEntity, Integer> {
	
	@Query(value="select * from bankk.bankk where name like ?",nativeQuery = true)
	public BankkEntity bm(String a);

}
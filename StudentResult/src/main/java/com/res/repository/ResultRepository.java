package com.res.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.res.entity.ResultEntity;

public interface ResultRepository extends JpaRepository<ResultEntity, Integer> {
	
	@Query(value="select * from result where totalmarks=(select max(totalmarks) from result)",nativeQuery=true)
	public ResultEntity getmax();
	
	@Query(value="select * from result order by totalmarks desc limit 3",nativeQuery=true)
	public List<ResultEntity>getthree();
	
	

}
	
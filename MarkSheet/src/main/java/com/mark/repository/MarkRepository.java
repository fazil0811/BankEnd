package com.mark.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mark.entity.MarkEntity;

public interface MarkRepository extends JpaRepository<MarkEntity, Integer>{

	@Query(value="select sem1total from mark where rollno=?",nativeQuery=true )
	public int gettot(int a);
	
	@Query(value="select sem2total from mark where rollno=?",nativeQuery=true )
	public int gettot1(int a);
	
	
	@Query(value="select * from mark where sem1practicals>90 and sem1theory>90 and sem1practicals>90 and sem2theory>90",nativeQuery = true)
	public List<MarkEntity>getmarks();
}

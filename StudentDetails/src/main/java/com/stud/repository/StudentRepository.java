package com.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stud.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	
	@Query(value="select percentage from student where rollno=?",nativeQuery=true) 
	public int getper(int a);
	

}

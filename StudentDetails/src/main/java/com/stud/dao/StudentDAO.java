package com.stud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stud.entity.StudentEntity;
import com.stud.repository.StudentRepository;

@Repository
public class StudentDAO {
	
	@Autowired
	StudentRepository sr;
	
	public String postValue(StudentEntity a) {
		sr.save(a);
		return "posted success";
	}
	
	public int getper(int a) {
		return sr.getper(a);
	}

}

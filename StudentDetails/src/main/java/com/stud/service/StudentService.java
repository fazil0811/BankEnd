package com.stud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stud.dao.StudentDAO;
import com.stud.entity.StudentEntity;
import com.stud.exception.AgeException;

@Service
public class StudentService {

	@Autowired
	StudentDAO sd;

	public String postValue(StudentEntity a) throws AgeException {
		if (a.getAge() > 18) {
			return sd.postValue(a);
		}
		else {
			throw new AgeException("not found");
		}
	}
		
		public int getper(int a) {
			return sd.getper(a);
		
	}
}
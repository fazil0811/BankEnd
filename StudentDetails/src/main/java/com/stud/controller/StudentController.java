package com.stud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stud.entity.StudentEntity;
import com.stud.exception.AgeException;
import com.stud.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping(value="/postValue")
	public String postValue(@RequestBody StudentEntity a)throws AgeException {
		return ss.postValue(a);
	}
	
	@GetMapping(value="/getper/{a}")
	public int getper(@PathVariable int a) {
		return ss.getper(a);
	}

}

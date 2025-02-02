package com.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Value("${i}")
	private String i;

	@RequestMapping(value = "/gett")

	public String gett() {
		return i;
	}

}

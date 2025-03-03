package com.cjc.curd.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.curd.main.model.Student;

@RestController
public class StudentController
{
	@PostMapping("/postData")
	public String postData(@RequestBody Student s)
	{
		
		return "Update Data";
	}

}

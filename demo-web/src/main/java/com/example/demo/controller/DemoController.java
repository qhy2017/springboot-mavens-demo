package com.example.demo.controller;

import org.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@RequestMapping(value = "/getString", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Student getString() {
		Student s = new Student();
		s.setId(12345);
		s.setUsername("德玛西亚");
		s.setPassword("12345");
		return s;
	}

}

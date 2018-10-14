package com.example.demo;

import org.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Repeat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

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

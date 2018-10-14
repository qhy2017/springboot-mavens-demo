package com.example.demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	@ResponseBody
	@RequestMapping("/getHello")
	public String getHello() {

		return "hello world";
	}
}

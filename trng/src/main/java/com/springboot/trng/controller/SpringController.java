package com.springboot.trng.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.trng.model.Employee;

@RestController
public class SpringController {

	@RequestMapping("/")
	public String helloWorld() {
		/* System.out.println("inside hello world"); */
		return "hi";
	}
	
	@RequestMapping(value = "/employee", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Employee getEmployee() {
		return new Employee(1, "Ram", 1000);
	}
}

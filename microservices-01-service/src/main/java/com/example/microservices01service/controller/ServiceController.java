package com.example.microservices01service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class ServiceController {
	
	
	@Value("${server.application.name}")
	private String instanceName;
	
	@GetMapping
	public String sayHello() {
		return "<h1>Welcome to Eureka Discovery Client instance"+instanceName+"</h1>";
	}

}

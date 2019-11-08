package com.example.microservices02configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${some.property}")
	private String someProperty;
	
	@GetMapping
	public String readProperty() {
		return someProperty;
	}
}

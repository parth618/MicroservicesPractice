package com.example.microservices01service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableEurekaClient
//@RestController
public class Microservices01ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservices01ServiceApplication.class, args);
	}

	/*
	 * @GetMapping public String sayHello() { return
	 * "<h1>Welcome to Eureka Discovery Client</h1>"; }
	 */
}

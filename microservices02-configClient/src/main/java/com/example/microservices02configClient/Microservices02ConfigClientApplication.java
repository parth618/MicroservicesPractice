package com.example.microservices02configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Microservices02ConfigClientApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(Microservices02ConfigClientApplication.class, args);
	}

	
}

package com.example.microservices02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Microservices02Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservices02Application.class, args);
	}

}

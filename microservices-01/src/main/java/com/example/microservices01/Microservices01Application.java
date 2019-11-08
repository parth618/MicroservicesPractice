package com.example.microservices01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Microservices01Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservices01Application.class, args);
	}

}

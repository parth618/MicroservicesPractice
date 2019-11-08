package com.example.microservices01client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class Microservices01ClientApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Microservices01ClientApplication.class, args);
	}

}

package com.example.microservices01client.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;

import com.netflix.appinfo.InstanceInfo;

import com.netflix.discovery.EurekaClient;

@RestController
public class ClientApplication {
	@Autowired
	private EurekaClient client;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping
	public String getMessage() {
		RestTemplate restTemplate=restTemplateBuilder.build();
		
		
		InstanceInfo info = client.getNextServerFromEureka("Service", false);
		List<ServiceInstance> instances = client.getInstancesById("Service");
		//List<ServiceInstance> instances = discoveryClient.getInstances("Service");
		//String serviceInstanceURL = instances.get(0).getUri().toString();
		//System.out.println("....."+serviceInstanceURL);
		String homePageUrl = info.getHomePageUrl();
		
		ResponseEntity<String> exchange = restTemplate.exchange(homePageUrl, HttpMethod.GET, null, String.class);
		
		
		return exchange.getBody();
		
	} 
	
}

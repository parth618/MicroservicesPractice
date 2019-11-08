package com.springboot.trng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.trng.controller.UserController;
import com.springboot.trng.model.User;

@SpringBootApplication
public class TrngApplication implements CommandLineRunner {
	
	@Autowired
	UserController controller;

	public static void main(String[] args) {
		//ConfigurableApplicationContext context = 
		SpringApplication.run(TrngApplication.class, args);
		
		
		//To change application.properties file name and server port etc.
		/*
		 * new SpringApplicationBuilder(TrngApplication.class).properties(
		 * "spring.config.name:myapplication") 
		 * .properties("server.port:8585")
		 * .build() .run(args);
		 */
		
		//by default bean name is get by class name of controller
		//context.getBean("userController");
		
		/*
		 * UserController localController = context.getBean("controllerUser",
		 * UserController.class);
		 * 
		 * User user = new User(); user.setUserId(10); user.setFirstName("Rohit");
		 * user.setLastName("sharma"); user.setEmail("r.sharma@gmail.com");
		 * localController.createUser(user);
		 */
	}

	
	
	
	  @Override public void run(String... args) throws Exception {
	  
		User user = new User();
		user.setUserId(20);
		user.setFirstName("Ravindra");
		user.setLastName("Jadeja");
		user.setEmail("r.jadeja@gmail.com");
		controller.createUser(user);
	  
	  }
	 
	 

}

package com.springboot.trng.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.trng.customexception.UserNotFoundException;
import com.springboot.trng.model.User;
import com.springboot.trng.service.UserService;

@RestController(value="controllerUser")
@RequestMapping("/users")
public class UserController {
	
	//@Autowired
	private UserService service;
	
	//By not mentioning autowiring anywhere in class still autowiring works
	//But if no-arg constructor is present spring-core runs parameterized constructor and create service object
	public UserController(UserService service) {
		System.out.println("Autowiring using parameterized constructor");
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<Iterable<User>> getAllUsers() {
		return new ResponseEntity<Iterable<User>>(service.getAllUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable int userId) {
		
		if(userId<1) {
			throw new UserNotFoundException("User id is not available enter ");
		}
		
		return new ResponseEntity<User>(service.getUser(userId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		System.out.println("controller-->" +user);
		return new ResponseEntity<User>(service.createUser(user), HttpStatus.CREATED);
	}
	
	@PutMapping("/{userId}")
	public User updateUser(@PathVariable int userId, @RequestBody User user) {
		user.setUserId(userId);
		return service.updateUser(userId, user);
	}
	
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable int userId) {
		service.deleteUser(userId);
	}
	
	@GetMapping("/userName/(userName)")
	public List<User> getUserByFirstName(@PathVariable("userName") String name){
		return service.findByFirstName(name);
	}

}

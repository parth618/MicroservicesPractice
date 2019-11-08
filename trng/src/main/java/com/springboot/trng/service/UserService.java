package com.springboot.trng.service;

import java.util.List;

import com.springboot.trng.model.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();
	
	public User getUser(int userId);
	
	public User createUser(User user);
	
	public User updateUser(int userId, User user);
	
	public void deleteUser(int userId);
	
	public List<User> findByFirstName(String firstName);

}

package com.springboot.trng.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.trng.model.User;

public interface UserRepo extends CrudRepository<User, Integer>{
	
	//public List getAllUsers();
	
	//public User getDBUser(int userId);
	
	//public User createDBUser(User user);
	
	//public User updateDBUser(int userId, User user);
	
	//public void deleteDBUser(int userId);

	public List<User> findByFirstName(String firstName);
}

package com.springboot.trng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trng.model.User;
import com.springboot.trng.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo repo;

	@Override
	public Iterable<User> getAllUsers() {
		return repo.findAll();
	}

	@Override
	public User getUser(int userId) {
		return repo.findById(userId).get();
	}

	@Override
	public User createUser(User user) {
		System.out.println(user);
		return repo.save(user);
	}

	@Override
	public User updateUser(int userId, User user) {
		return repo.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		repo.deleteById(userId);

	}

	@Override
	public List<User> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return repo.findByFirstName(firstName);
	}
	

}

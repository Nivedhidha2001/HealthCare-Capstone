package com.cisco.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.health.entity.User;
import com.cisco.health.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User addUser(User user) {
		return repo.save(user);
	}
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	public User getUserById(Integer id) {
		return repo.findById(id);
				
	}
/// Getting getall, post , get By Id.
}
package com.cisco.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.health.entity.User;
import com.cisco.health.service.UserService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		return new ResponseEntity<User>(service.addUser(user),HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<User>> getAll(){
		return new ResponseEntity<List<User>>(service.getAllUsers(),HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<Object> getUserById(@PathVariable Integer id){
		User foundUser = service.getUserById(id);
		if(foundUser!=null)
			return new ResponseEntity<Object>(foundUser,HttpStatus.OK);
		else 
			return new ResponseEntity<Object>("No User found with Id" +id,HttpStatus.NOT_FOUND);
	}
}
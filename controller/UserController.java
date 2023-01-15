package com.SpringBootCRUDApp.SpringBootReact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootCRUDApp.SpringBootReact.model.User;
import com.SpringBootCRUDApp.SpringBootReact.repository.UserRepository;





@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userRepository.addUser(user);
	}

	
	 @GetMapping("/users/{userId}") 
	 public User getUserById(@PathVariable int userId) { 
		 return userRepository.getUserById(userId);
	 }
	 

	@DeleteMapping("/users/{userId}")
	public void deleteUserById(@PathVariable int userId) {
		userRepository.deleteUserById(userId);
	}

	
	@PutMapping("/users/{userId}") 
	public User editUser(@PathVariable int userId, @RequestBody User user) { 
		return userRepository.editUser(userId, user);
	}
	 
}
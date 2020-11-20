/**
 * 
 */
package com.example.productStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.productStore.entity.UserDetails;
import com.example.productStore.service.UserServiceImpl;

/**
 * @author Keerti
 *
 * 
 */
@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/createUser")
	public UserDetails createUser(@RequestBody UserDetails user){
		return userServiceImpl.createUser(user);
		
	}
	
	@GetMapping("/getAllUsers")
	public List<UserDetails> getAllUsers(){
		return userServiceImpl.getAllUsers();
	}

}

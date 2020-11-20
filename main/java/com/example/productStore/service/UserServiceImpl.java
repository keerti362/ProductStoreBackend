/**
 * 
 */
package com.example.productStore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productStore.entity.UserDetails;
import com.example.productStore.repository.UserRepository;

/**
 * @author Keerti
 *
 * 
 */
@Service
public class UserServiceImpl implements  UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails createUser(UserDetails user) {
		return userRepository.save(user);
		
	}

	@Override
	public List<UserDetails> getAllUsers() {
		List<UserDetails> list=new ArrayList<UserDetails>();
		userRepository.findAll().forEach(user -> list.add(user));
		return list;
	}

}

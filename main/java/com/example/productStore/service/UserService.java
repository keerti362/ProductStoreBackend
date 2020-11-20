/**
 * 
 */
package com.example.productStore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productStore.entity.UserDetails;

/**
 * @author Keerti
 *
 * 
 */
@Service
public interface UserService {

	public UserDetails createUser(UserDetails user);
	
	public List<UserDetails> getAllUsers();
		
	
}

/**
 * 
 */
package com.example.productStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.productStore.entity.Product;

/**
 * @author Keerti
 *
 * 
 */

@Service
public interface ProductService {
		
	public List<Product> getAllProducts();
	
	public Optional<Product> getProductById(int id);

	public  List<Product> findProductByName(String name);
}

/**
 * 
 */
package com.example.productStore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.productStore.entity.Product;
import com.example.productStore.service.ProductServiceImpl;

/**
 * @author Keerti
 *
 * 
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productServiceImpl.getAllProducts();	
		
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable ("id") int id){
		return productServiceImpl.getProductById(id);
		
	}
	
	@GetMapping("/productByName/{name}")
	public List<Product> findProductProductByName(@PathVariable ("name") String name) {
		return productServiceImpl.findProductByName(name);
	}
		
	

}

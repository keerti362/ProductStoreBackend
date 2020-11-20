/**
 * 
 */
package com.example.productStore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productStore.entity.Product;
import com.example.productStore.repository.ProductRepository;

/**
 * @author Keerti
 *
 * 
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		List<Product> list=new ArrayList<Product>();
		productRepository.findAll().forEach(product -> list.add(product));
		return list;
	}

	@Override
	public Optional<Product> getProductById(int id) {
		return productRepository.findById(id);
	}

	@Override
	public List<Product> findProductByName(String name) {
	   return productRepository.findByName(name);
	   
	}

}

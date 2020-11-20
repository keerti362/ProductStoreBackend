/**
 * 
 */
package com.example.productStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.productStore.entity.Product;


@Repository
//@CrossOrigin(origins = "http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product , Integer> {
	
	@Query(nativeQuery = true, value = "SELECT * FROM PRODUCTS where name =:productName")
	public List<Product> findByName(@Param("productName") String productName);

}

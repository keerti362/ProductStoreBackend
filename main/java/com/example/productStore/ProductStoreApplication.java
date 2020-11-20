package com.example.productStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class } )
public class ProductStoreApplication{

	public static void main(String[] args) {
		SpringApplication.run(ProductStoreApplication.class, args);
	}


}

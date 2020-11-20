/**
 * 
 */
package com.example.productStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productStore.entity.UserDetails;

/**
 * @author Keerti
 *
 * 
 */
@Repository
public interface UserRepository extends JpaRepository<UserDetails , Integer>{

}

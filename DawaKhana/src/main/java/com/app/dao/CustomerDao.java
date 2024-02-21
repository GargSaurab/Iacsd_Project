package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer,Long> {
	
	List<Customer> findByUserId(long userId);
	//if i want to search customer by id we cant use the name of the method find by id we will have to use findByuserId(User/user)   
	
	Customer findByEmail(String id);

}

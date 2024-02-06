package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Customer;

public interface EmployeeDao extends JpaRepository<Customer, Long> {
	
	

}

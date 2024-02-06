package com.app.service;

import java.util.List;

import com.app.entities.Customer;

public interface EmployeeService {
 
	List<Customer>getAllEmps();

	Customer addEmpDetails(Customer newEmp);

}

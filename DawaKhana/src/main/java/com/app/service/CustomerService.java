package com.app.service;

import java.util.List;

import com.app.entities.Customer;

public interface CustomerService {
	
	public List<Customer> listAllCustomers();
	
	public boolean addCustomer(Customer cust);
	
	public boolean deleteCustomer(long customerId);
	
	public Customer getByCustomerId(long Id);

}

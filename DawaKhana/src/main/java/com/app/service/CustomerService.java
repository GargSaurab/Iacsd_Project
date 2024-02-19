package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.CustomerDTO;
import com.app.entities.Customer;

public interface CustomerService {
	
	public List<Customer> listAllCustomers();
	
	public CustomerDTO addCustomer(CustomerDTO cust);
	
	public ApiResponse deleteCustomer(long customerId);
	
	public Customer getByCustomerId(long Id);
	
	public ApiResponse updateCustomer(long custId,CustomerDTO updateCust);

}

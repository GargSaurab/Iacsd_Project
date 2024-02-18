package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Customer;
import com.app.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins="http://localhost:3000")
public class CustomerController {
	@Autowired
	private CustomerService custService;
	
	@GetMapping
	public List<Customer> listAllCustomer()
	{
		System.out.println("In Customer List Controller Method");
		return custService.listAllCustomers();
	}
	
	@PostMapping("/addCustomer")
	public boolean addCustomer(@RequestBody Customer customer)
	{
		System.out.println("In Add Customer Controller Method");
		custService.addCustomer(customer);
		return true;
	}
	
	@PostMapping("/CustomerById")
	public boolean deleteCustomer(@RequestBody long Id)
	{
		System.out.println("In Delete Customer Controller Method");
		custService.deleteCustomer(Id);
		return true;
	}

}

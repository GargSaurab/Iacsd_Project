package com.app.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerDTO;
import com.app.entities.Customer;
import com.app.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins="http://localhost:3000")
public class CustomerController {
	@Autowired
	private CustomerService custService;
	
	@GetMapping
	public ResponseEntity<?> listAllCustomer()
	{
		System.out.println("In Customer List Controller Method");
		return ResponseEntity.ok(custService.listAllCustomers());
	}
	
	@PostMapping("/addCustomer")
	public ResponseEntity<?> addCustomer(@RequestBody @Valid CustomerDTO customer)
	{
		System.out.println("In Add Customer Controller Method");
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(custService.addCustomer(customer));
	}
	
	@DeleteMapping("/{Id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable long Id)
	{
		System.out.println("In Delete Customer Controller Method");
		return ResponseEntity.ok(custService.deleteCustomer(Id));
	}
	
	@PutMapping("/{custId}")
	public ResponseEntity<?> updateCustomer(@PathVariable long custId,@RequestBody CustomerDTO updateCust)
	{
		System.out.println("In CustomerController Update Action/Method");
		return ResponseEntity.ok(custService.updateCustomer(custId,updateCust));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCustomerByUserId(@PathVariable long id)
	{
		System.out.println("In Customer Controller GetByID action/Method");
		return ResponseEntity.ok(custService.getByUserId(id));
	}

}

package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.app.custom_Exception.ResourceNotFoundException;
import com.app.dao.CustomerDao;
import com.app.dto.CustomerDTO;
import com.app.entities.Customer;
import com.app.dto.ApiResponse;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	public CustomerDao custDao;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public List<Customer> listAllCustomers() {
		return custDao.findAll();
	}

	@Override
	public CustomerDTO addCustomer(CustomerDTO cust) {
		Customer customerEntity=mapper.map(cust,Customer.class);
		Customer persistentCust=custDao.save(customerEntity);
		return mapper.map(persistentCust, CustomerDTO.class);
	}

	@Override
	public ApiResponse deleteCustomer(long customerId) {
		Optional<Customer> optionalCust=custDao.findById(customerId);
		if(optionalCust.isPresent())
		{
		custDao.delete(optionalCust.get());
		return new ApiResponse("Customer Details with Id "+customerId+" Deleted");
		}
		return new ApiResponse("Customer Details not found");
	}

	@Override
	public CustomerDTO getByUserId(long Id) {
		System.out.println("In Customer Service GetByID action/Method");
		Customer cust=custDao.getById(Id);
		System.out.println("In Customer Service GetByID action/Method after getting data from Dao");
		return mapper.map(cust,CustomerDTO.class);
		
	}

	@Override
	public ApiResponse updateCustomer(long id,CustomerDTO updateCust) {
		Customer cust=custDao.findById(id).orElseThrow(()->new ResourceNotFoundException("Customer Id Not Found"));
		mapper.map(updateCust,cust);
		System.out.println("After mapping");
		return new ApiResponse("Customer Details Updated");
	}

	@Override
	public boolean getAuthenticate(String id, String pass) {
		Customer cust=custDao.findByEmail(id);
		
		System.out.println(cust);
		
		if(cust!=null)
		{
             if(cust.getEmail().equals(id))
              return true;
		}
		
		return false;
	}

}

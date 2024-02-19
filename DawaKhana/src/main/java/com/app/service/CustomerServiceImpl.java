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
	public Customer getByCustomerId(long Id) {
		custDao.getById(Id);
		return null;
	}

	@Override
	public ApiResponse updateCustomer(long id,CustomerDTO updateCust) {
		Customer cust=custDao.findById(id).orElseThrow(()->new ResourceNotFoundException("Customer Id Not Found"));
		mapper.map(updateCust,cust);
		System.out.println("After mapping");
		return new ApiResponse("Customer Details Updated");
	}

//	@Override
//	public List<Customer> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Customer> findAll(Sort sort) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Customer> findAllById(Iterable<Long> ids) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Customer> List<S> saveAll(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void flush() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public <S extends Customer> S saveAndFlush(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Customer> List<S> saveAllAndFlush(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteAllInBatch(Iterable<Customer> entities) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAllByIdInBatch(Iterable<Long> ids) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAllInBatch() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public Customer getOne(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Customer getById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Customer getReferenceById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Customer> List<S> findAll(Example<S> example) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Page<Customer> findAll(Pageable pageable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Customer> S save(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Optional<Customer> findById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean existsById(Long id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public long count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void deleteById(Long id) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void delete(Customer entity) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAllById(Iterable<? extends Long> ids) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAll(Iterable<? extends Customer> entities) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public <S extends Customer> Optional<S> findOne(Example<S> example) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Customer> long count(Example<S> example) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public <S extends Customer> boolean exists(Example<S> example) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public <S extends Customer, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
//		// TODO Auto-generated method stub
//		return null;
//	}



}

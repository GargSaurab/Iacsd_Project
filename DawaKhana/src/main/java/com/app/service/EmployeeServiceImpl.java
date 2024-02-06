package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.entities.Customer;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	//dep:
	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public List<Customer>getAllEmps(){
		return empDao.findAll();
	}

	@Override
	public Customer addEmpDetails(Customer newEmp) {
		
		return empDao.save(newEmp);
	}

}

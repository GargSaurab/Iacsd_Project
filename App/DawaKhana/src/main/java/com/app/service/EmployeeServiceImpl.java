package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.entities.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	//dep:
	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public List<Employee>getAllEmps(){
		return empDao.findAll();
	}

	@Override
	public Employee addEmpDetails(Employee newEmp) {
		
		return empDao.save(newEmp);
	}

}

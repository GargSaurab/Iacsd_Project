package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins="http://localhost:3000")
public class EmployeeController {
   //dep:
	@Autowired
	private EmployeeService empService;
	
	public EmployeeController() {
		System.out.println("in ctor of"+getClass());
	}
	//Rest API and point
	//URL:http://localhost:8080/employees/
	//Method:GET
	//resp:List<Emp>
	@GetMapping
	public List<Employee> listAllEmps(){
		System.out.println("in list all emps");
		return empService.getAllEmps();
	}
	
	public Employee addEmpDetails(@RequestBody Employee newEmp)
	{
		System.out.println("in empadd"+newEmp);
		
		return empService.addEmpDetails(newEmp);
	}
	
}

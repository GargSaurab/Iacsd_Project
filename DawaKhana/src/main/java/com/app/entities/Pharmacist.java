package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Entity
@ToString
@Table(name="pharmacist")
public class Pharmacist extends User {
	private LocalDate doj;
	private double salary;
	private String empId;
	
	public Pharmacist(String name, LocalDate dob, String address, String email, int phnNo,LocalDate doj, double salary, String empId) {
		super(name,dob,address,email,phnNo);
		this.doj = doj;
		this.salary = salary;
		this.empId = empId;
	}

	public Pharmacist() {
		super();
	}

	@Override
	public String toString() {
		return "Pharmacist ["+ super.toString()+"doj=" + doj + ", salary=" + salary + ", empId=" + empId
				+ "]";
	}
  
	

}

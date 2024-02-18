package com.app.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PharmacistDto {

	private Long userId;
	private String name;
	private LocalDate dob;
	private String address;
	private String email;
	private int phnNo;
	private LocalDate doj;
	private double salary;
	private String empId;
	
}

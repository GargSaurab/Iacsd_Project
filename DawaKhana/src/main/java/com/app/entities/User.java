package com.app.entities;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass // to tell hibernate following class is a
//common super class for all other entities n DO NOT generate any tables for it .
@Getter
@Setter
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Id") // customizes col name
	private Long userId;
	private String name;
	private LocalDate dob;
	private String address;
	private String email;
	private int phnNo;
	

	public User() {
		super();
	}

	public User(String name, LocalDate dob, String address,String email,int phnNo) {
		super();
		this.userId = userId;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.email=email;
		this.phnNo=phnNo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	 // Getter and setter methods for phnNo
    public int getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(int phnNo) {
        this.phnNo = phnNo;
    }
	

}

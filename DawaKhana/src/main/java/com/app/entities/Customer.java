package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;//all specs Java EE supplied

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="customer")
public class Customer extends User {
	
	@Column
	private LocalDate LastPurchaseDate;
	
	public Customer() {
		super();
	}
	
	public Customer(String name, LocalDate dob, String address, String email,String password, int phnNo) {
		super(name,dob,address,email,password,phnNo);
		LastPurchaseDate = LocalDate.now();
	}
	
	public LocalDate getLastPurchaseDate() {
		return LastPurchaseDate;
	}
	
	public void setLastPurchaseDate(LocalDate lastPurchaseDate) {
		LastPurchaseDate = lastPurchaseDate;
	}

	@Override
	public String toString() {
		return "LastPurchaseDate=" + LastPurchaseDate + ":";
	}
	
}

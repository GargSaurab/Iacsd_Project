package com.app.dto;

import java.time.LocalDate;

public class CustomerDTO {
	private Long userId;
	private String name;
	private LocalDate dob;
	private String address;
	private String email;
	private int phnNo;
	private LocalDate LastPurchaseDate;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(int phnNo) {
		this.phnNo = phnNo;
	}
	public LocalDate getLastPurchaseDate() {
		return LastPurchaseDate;
	}
	public void setLastPurchaseDate(LocalDate lastPurchaseDate) {
		LastPurchaseDate = lastPurchaseDate;
	}
	@Override
	public String toString() {
		return "CustomerDTO [userId=" + userId + ", name=" + name + ", dob=" + dob + ", address=" + address + ", email="
				+ email + ", phnNo=" + phnNo + ", LastPurchaseDate=" + LastPurchaseDate + "]";
	}
	
	
	

}

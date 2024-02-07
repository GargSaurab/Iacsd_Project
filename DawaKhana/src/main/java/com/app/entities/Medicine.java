package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;

public class Medicine {

	@Column(name="Medicine")
	public int medicineId;
	@Column(name="Original Name",length=40)
	public String orgName;
	@Column(name="Company",length=40)
	public String company;
	@Column(name="Power",length=40)
	public String power;
	@Column(name="Manufactured Date")
	public LocalDate mfd;
	@Column(name="Expiry Date")
	public LocalDate expd;
	@Column(name="Cost Price")
	public double cP;
	@Column(name="Mrp.")
	public double mkdPrice;

}

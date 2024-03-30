package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table
@Getter
@Setter
@ToString
public class Medicine {

	@Id
	@Column(name="Medicine")
	public int medicineId;
	@Column(name="Original_Name",length=40)
	public String originalName;
	@Column(name="Company",length=40)
	public String company;
	@Column(name="Power",length=40)
	public String power;
	@Column(name="Manufactured_Date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public LocalDate mfd;
	@Column(name="Expiry_Date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public LocalDate expd;
	@Column(name="Cost_Price")
	public double cP;
	@Column(name="Mrp.")
	public double mkdPrice;

}

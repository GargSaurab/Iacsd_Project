package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Entity
@ToString
@Table(name="pharmacyst")
public class Pharmacist {
	private LocalDate doj;
	private double salary;
	private int enpId;
	
	
	
	public Pharmacist(LocalDate doj, double salary, int enpId) {
		super();
		this.doj = doj;
		this.salary = salary;
		this.enpId = enpId;
	}



	public Pharmacist() {
		super();
	}
	
	

}

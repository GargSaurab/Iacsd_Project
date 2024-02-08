package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
public class Purchase {
	
	public int PurchaseID;
	
	public LocalDate purchaseDate;
	
	public int qty;
	
	public double unitPrice;
	
	public double totalCost;

}

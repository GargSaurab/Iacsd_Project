package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
public class Distributor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int companyId;
	@Column(name="Distributor",length=40)
	public String distributor;
	@Column(name="Company",length=40)
	public String companyName;
	@Column(name="Salesman",length=40)
	public String salesMan;
	@Column(name="Address",length=40)
	public String address;
	public int cntNo;
	
	public Distributor(int companyId, String distributor, String companyName, String salesMan, String address,
			int cntNo) {
		super();
		this.companyId = companyId;
		this.distributor = distributor;
		this.companyName = companyName;
		this.salesMan = salesMan;
		this.address = address;
		this.cntNo = cntNo;
	}	

}

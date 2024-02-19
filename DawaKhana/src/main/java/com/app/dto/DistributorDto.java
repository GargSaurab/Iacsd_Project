package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DistributorDto {

	public int companyId;
	
	public String distributor;
	
	public String companyName;
	
	public String salesMan;
	
	public String address;
	
	public int cntNo;
	
}

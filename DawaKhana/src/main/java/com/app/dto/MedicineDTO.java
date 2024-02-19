package com.app.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class MedicineDTO {
	public int medicineId;
	public String orgName;
	public String company;
	public String power;
	public LocalDate mfd;
	public LocalDate expd;
	public double cP;
}

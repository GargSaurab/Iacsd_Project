package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Pharmacist;

public interface PharmacistDao extends JpaRepository<Pharmacist,Long> {
	
	   Pharmacist findByEmpId(String Id);

}

package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Medicine;

public interface MedicineDao extends JpaRepository<Medicine,Integer> {

}
package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Medicine;
import java.util.List;


public interface MedicineDao extends JpaRepository<Medicine,Integer> {

   List<Medicine> findByOriginalNameStartingWith(String OriginalName);


}

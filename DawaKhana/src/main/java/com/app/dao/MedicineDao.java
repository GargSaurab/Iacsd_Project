package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entities.Medicine;
import java.util.List;


public interface MedicineDao extends JpaRepository<Medicine,Integer> {

   @Query("SELECT m FROM Medicine m WHERE m.originalName LIKE :query% OR m.company LIKE :query%")
   List<Medicine> search(@Param("query") String query);


}

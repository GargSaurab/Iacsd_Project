package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Search;
import java.util.List;


public interface SearchDao extends JpaRepository<Search,Integer> {
      
     List<Search> findByNameStartingWith(String query);

}

package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Search;

public interface SearchDao extends JpaRepository<Search,Integer> {

}

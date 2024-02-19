package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Distributor;

public interface DistributorDao extends JpaRepository<Distributor,Integer> {

}

package com.app.service;


import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.PharmacistDao;
import com.app.dto.PharmacistDto;

@Service
@Transactional
public class PharmacistServiceImpl implements PharmacistService {
	
    @Autowired
    public PharmacistDao pharmDao;
    
    @Autowired
    public ModelMapper mapper;
    
	@Override
	public List<PharmacistDto> getAllPharmacist() {
		
		return pharmDao.findAll()
				.stream()
				.map(pharm->mapper.map(pharm, PharmacistDto.class))
				.collect(Collectors.toList());
	}

}

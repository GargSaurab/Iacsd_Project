package com.app.service;


import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_Exception.ResourceNotFoundException;
import com.app.dao.PharmacistDao;
import com.app.dto.ApiResponse;
import com.app.dto.PharmacistDto;
import com.app.entities.Pharmacist;

@Service
@Transactional
public class PharmacistServiceImpl implements PharmacistService {
	
    @Autowired
    public PharmacistDao pharmaDao;
    
    @Autowired
    public ModelMapper mapper;
    
	@Override
	public List<PharmacistDto> getAllPharmacist() {
		
		return pharmaDao.findAll()
				.stream()
				.map(pharm->mapper.map(pharm, PharmacistDto.class))
				.collect(Collectors.toList());
	}
	
	@Override
	public void addPharmacist(PharmacistDto pharmDto)
	{
		Pharmacist pharmaEntity=mapper.map(pharmDto,Pharmacist.class);
		pharmaDao.save(pharmaEntity);
	}
	
	@Override
	public void updatePharmacist(PharmacistDto pharmaDto)
	{
		Pharmacist pharma=pharmaDao.findById(pharmaDto.getUserId())
				          .orElseThrow(()->new ResourceNotFoundException("Pharmacist Not Found"));
		
		System.out.println("Updated Pharmacist before "+pharma);
		
		mapper.map(pharmaDto,pharma);
		
		System.out.println("Updated Pharmacist after"+pharma);
	}

	@Override
	public ApiResponse deletePharmacist(Long Id) {
		
		Pharmacist pharma=pharmaDao.findById(Id)
				          .orElseThrow(()->new ResourceNotFoundException("Pharmacist Not Found"));
		
		pharmaDao.delete(pharma);
		
		return new ApiResponse("Pharmacist "+pharma.getEmpId()+" is removed.");
	}

	@Override
	public PharmacistDto getPharmacistById(String Id) {
		
		Pharmacist pharma=pharmaDao.findByEmpId(Id);
		
	    if(pharma.equals(null))
	    	throw new ResourceNotFoundException("Pharmacist Not Found");
	    
	    System.out.println(pharma);
		
		return mapper.map(pharma,PharmacistDto.class);
	}

	@Override
	public Boolean getAuthenticate(String empId, String password) {
		
		Pharmacist pharma=pharmaDao.findByEmpId(empId);
		
		if(pharma!=null)
		{
			if(pharma.getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
	}
	


}

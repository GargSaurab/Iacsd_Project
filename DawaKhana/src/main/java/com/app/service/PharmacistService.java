package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.PharmacistDto;

public interface PharmacistService {

	List<PharmacistDto> getAllPharmacist();
	
	void addPharmacist(PharmacistDto pharmaDto);
	
	void updatePharmacist(PharmacistDto pharmaDto);
	
    ApiResponse deletePharmacist(Long Id);
    
    PharmacistDto getPharmacistById(String Id);
	
}

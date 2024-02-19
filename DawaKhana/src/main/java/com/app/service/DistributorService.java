package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.DistributorDto;

public interface DistributorService {
	
    void addDistributor(DistributorDto disDto);
    
    List<DistributorDto> getAllDistributor();
    
    ApiResponse deleteDistributor(Integer Id); 
    
    ApiResponse updateDistributor(DistributorDto disDto);
    
    DistributorDto getById(Integer Id);

}

package com.app.service;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_Exception.ResourceNotFoundException;
import com.app.dao.DistributorDao;
import com.app.dto.ApiResponse;
import com.app.dto.DistributorDto;
import com.app.entities.Distributor;

@Service
@Transactional
public class DistributorServiceImpl implements DistributorService {

	@Autowired
	  DistributorDao disDao;
	
	@Autowired
	  ModelMapper mapper;
	
	@Override
	public void addDistributor(DistributorDto disDto) {
		
		Distributor dis=mapper.map(disDto,Distributor.class);
		disDao.save(dis);
		
	}

	@Override
	public List<DistributorDto> getAllDistributor() {
		
		return disDao.findAll()
				.stream()
				.map(dis->mapper.map(dis, DistributorDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public ApiResponse deleteDistributor(Integer Id) {
		Distributor dis=disDao.findById(Id)
		          .orElseThrow(()->new ResourceNotFoundException("Distributor Not Found"));

             disDao.delete(dis);

         return new ApiResponse(dis.getCompanyName()+" is removed as Distributor.");
	}

	@Override
	public ApiResponse updateDistributor(DistributorDto disDto) {
		
		Distributor dis=disDao.findById(disDto.getCompanyId())
		          .orElseThrow(()->new ResourceNotFoundException("Distributor Not Found"));

		System.out.println("Before update " + dis );
		
		mapper.map(disDto,dis);
		
		System.out.println("After update" + dis);
		 return new ApiResponse(dis.getCompanyName()+" is updated.");
		
	}

	@Override
	public DistributorDto getById(Integer Id) {
		
		Distributor dis=disDao.findById(Id)
		          .orElseThrow(()->new ResourceNotFoundException("Distributor Not Found"));
		
		System.out.println(dis);
		
		return mapper.map(dis,DistributorDto.class);
	}
	
	
	
	

}

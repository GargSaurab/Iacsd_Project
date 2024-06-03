package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.SearchDao;
import com.app.dto.MedicineDTO;
import com.app.dto.SearchDto;
import com.app.entities.TypeEnum;

@Service
@Transactional
public class SerachServiceImpl implements SearchService{
    
    @Autowired
    private SearchDao searchDao;

    @Autowired
     private SearchDto srchDto;
    
    @Autowired
    private ModelMapper mapper;

    @Override
    public void SearchEntry(MedicineDTO medicineEntity, TypeEnum type) {
        
         srchDto.setName(medicineEntity.getCompany());
         
    
    }

}

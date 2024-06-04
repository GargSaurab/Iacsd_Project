package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.app.dao.SearchDao;
import com.app.entities.Search;
import com.app.entities.TypeEnum;

@Service
@Transactional
public class SerachServiceImpl implements SearchService{
    
    @Autowired
    private SearchDao searchDao;
    
    @Autowired
    private ModelMapper mapper;

    @Override
    public void addSearchEntry(String name, TypeEnum type) {

         Search search = new Search();
        
         search.setName(name);
         search.setType(type);
        
        try
         {
            searchDao.save(search);
            System.out.println("Data entered in search");
         }
         catch(DataIntegrityViolationException  ex)
         {
            System.out.println("Duplicate Entry");
         }
        
    }

}

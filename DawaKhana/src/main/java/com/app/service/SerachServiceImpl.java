package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.SearchDao;

@Service
@Transactional
public class SerachServiceImpl {
    
    @Autowired
    private SearchDao searchDao;
    
    @Autowired
    private ModelMapper mapper;

}

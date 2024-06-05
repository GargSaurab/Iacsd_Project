package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.app.dao.SearchDao;
import com.app.dto.SearchDto;
import com.app.entities.Search;
import com.app.entities.TypeEnum;

@Service
@Transactional
public class SerachServiceImpl implements SearchService {

   @Autowired
   private SearchDao searchDao;

   @Autowired
   private ModelMapper mapper;

   @Override
   public void addSearchEntry(String name, TypeEnum type) {

      Search srch = new Search();

      srch.setName(name);
      srch.setType(type);

      try {
         searchDao.save(srch);
         System.out.println("Data entered in search");
      } catch (DataIntegrityViolationException ex) {
         System.out.println("Duplicate Entry");
      }

   }

   @Override
   public List<SearchDto> searchKeyword(String query) {
      System.out.println("In Medicine Service search method");

      List<SearchDto> keywords = searchDao.findByNameStartingWith(query)
            .stream()
            .map(keyword -> mapper.map(keyword, SearchDto.class))
            .collect(Collectors.toList());

      System.out.println("after fetching the data from database");

      for (SearchDto keyword : keywords) {
         System.out.println(keyword);
      }

      return keywords;
   }

}

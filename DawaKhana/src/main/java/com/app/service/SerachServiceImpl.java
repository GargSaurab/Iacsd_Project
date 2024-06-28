package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.SearchDao;
import com.app.dto.SearchDto;
import com.app.entities.Search;
import com.app.entities.TypeEnum;

@Service
//Tansactional should imported from the org.springframework.transaction.annotation.Transactional only because only via this annotation is tailored to work with it while spring won't recognize other "javax.transaction.Transactional" annotation as part of the transaction managment, due to which we can't use the propagation or transaction config like feature of springboot.
//Below propagtion creates a new independent transaction for the search and pauses the other transaction via which it's called and will restart after the search tranaction stops or rollbacks.
//Via this annotation search transaction become independent of the medicine
@Transactional(propagation = Propagation.REQUIRES_NEW)
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
         throw ex;
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

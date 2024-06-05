package com.app.service;

import java.util.List;

import com.app.dto.SearchDto;
import com.app.entities.TypeEnum;

public interface SearchService{

     void addSearchEntry(String name, TypeEnum type);

     List<SearchDto> searchKeyword(String query);

}

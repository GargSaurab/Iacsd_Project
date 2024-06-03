package com.app.dto;

import lombok.Setter;

import com.app.entities.TypeEnum;

import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchDto {

    private int id;
    private String name;
    private String searchCount;
    private TypeEnum type;

}

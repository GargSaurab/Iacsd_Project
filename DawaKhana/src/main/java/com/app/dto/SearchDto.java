package com.app.dto;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchDto {

    private int id;
    private String name;
    private String searchCount;
    private String type;

}

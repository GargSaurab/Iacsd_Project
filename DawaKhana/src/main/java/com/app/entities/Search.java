package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "Search" ,
uniqueConstraints = @UniqueConstraint(columnNames={"Name"}))
public class Search {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="Name", length = 40)
    private String name;
    @Column(name="SearchCount")
    private int searchCount;
    @Column(name="Type")
    private String type;

}

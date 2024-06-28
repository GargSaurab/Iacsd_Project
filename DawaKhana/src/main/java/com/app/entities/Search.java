package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "Search" ,
uniqueConstraints = @UniqueConstraint(columnNames={"Name","Type"}))
public class Search {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="Name", length = 40, nullable = false)
    private String name;

    @Column(name="SearchCount", nullable = false)
    private int searchCount = 0;
   
    @Enumerated(EnumType.STRING)
    @Column(name="Type", nullable = false)
    private TypeEnum type;

}

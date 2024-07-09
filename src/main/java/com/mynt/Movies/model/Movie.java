package com.mynt.Movies.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table
public class Movie {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column
    public String name;

    @Column
    public Integer yearReleased;

    @Column
    public Boolean isSequel;

    @Column
    @Enumerated(EnumType.STRING)
    public List<Genre> genre;

    @Column
    public List<String> castList;
}

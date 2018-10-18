package com.example.codeclan.news.models;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
}

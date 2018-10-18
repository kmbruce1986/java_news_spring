package com.example.codeclan.news.models;

import javax.persistence.*;

@Entity
@Table(name = "journalists")
public class Journalist {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
}


package com.example.codeclan.news.controllers;

import com.example.codeclan.news.repositories.journalists.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JournalistController {

    @Autowired
    JournalistRepository journalistRepository;
}

package com.example.codeclan.news.controllers;

import com.example.codeclan.news.models.Article;
import com.example.codeclan.news.models.Category;
import com.example.codeclan.news.repositories.articles.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping(value = "/category/{categoryId}")
    public List<Article> findArticlesByCategory(@PathVariable Long categoryId) {
        return articleRepository.getArticlesByCategory(categoryId);
    }

    @GetMapping(value = "/journalist/{journalistId}")
    public List<Article> findArticlesByJournalist(@PathVariable Long journalistId) {
        return articleRepository.getArticlesByCategory(journalistId);
    }

    @GetMapping(value = "/")
    public List<Article> findAllArticles(){
        return articleRepository.getArticles();
    }

}

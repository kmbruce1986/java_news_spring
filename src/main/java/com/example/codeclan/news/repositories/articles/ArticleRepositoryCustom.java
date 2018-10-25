package com.example.codeclan.news.repositories.articles;

import com.example.codeclan.news.models.Article;

import java.util.List;

public interface ArticleRepositoryCustom {

    List<Article> getArticlesByCategory(Long categoryId);

    List<Article> getArticlesByJournalist(Long journalistId);

    List<Article> getArticles();
}

package com.example.codeclan.news.repositories.articles;

import com.example.codeclan.news.models.Article;
import com.example.codeclan.news.projections.EmbedArticleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@Repository
@RepositoryRestResource(excerptProjection = EmbedArticleDetails.class)
public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleRepositoryCustom {
}

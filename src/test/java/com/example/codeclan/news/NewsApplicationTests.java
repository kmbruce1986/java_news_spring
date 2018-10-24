package com.example.codeclan.news;

import com.example.codeclan.news.models.Article;
import com.example.codeclan.news.models.Category;
import com.example.codeclan.news.models.Journalist;
import com.example.codeclan.news.repositories.articles.ArticleRepository;
import com.example.codeclan.news.repositories.categories.CategoryRepository;
import com.example.codeclan.news.repositories.journalists.JournalistRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsApplicationTests {


	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	JournalistRepository journalistRepository;

	@Autowired
	ArticleRepository articleRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void orderArticlesByDate() {
// tested in debugger

		List<Article> articlesByDate = articleRepository.getArticles();
	}

	@Test
	public void articlesByCategory(){
		// tested in debugger

		List<Article> articlesByCategory = articleRepository.getArticlesByCategory(1L);
	}

	@Test
	public void articlesByJournalist(){
		// tested in debugger

		List<Article> articlesByJourno = articleRepository.getArticlesByJournalist(1L);

	}
}

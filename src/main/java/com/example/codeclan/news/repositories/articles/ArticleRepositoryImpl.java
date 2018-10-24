package com.example.codeclan.news.repositories.articles;

import com.example.codeclan.news.models.Article;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.OrderBy;
import javax.transaction.Transactional;
import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Article> getArticlesByCategory(Long categoryId) {
        List<Article> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Article.class);
        try {
            cr.createAlias("categories", "category");
            cr.add(Restrictions.eq("category.Id", categoryId));
            cr.addOrder(Order.desc("publishedDateTime"));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    @Override
    @Transactional
    public List<Article> getArticlesByJournalist(Long journalistId) {
        List<Article> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Article.class);
            cr.add(Restrictions.eq("journalist.id", journalistId));
            results = cr.list();
            cr.addOrder(Order.desc("publishedDateTime"));
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    @Override
    @Transactional
    public List<Article> getArticles() {
        List<Article> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Article.class);
        try {
            cr.addOrder(Order.desc("publishedDateTime"));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}

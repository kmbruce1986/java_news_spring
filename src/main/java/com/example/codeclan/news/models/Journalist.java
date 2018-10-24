package com.example.codeclan.news.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "journalists")
public class Journalist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String jobTitle;

    @Column
    private String portraitURL;

    @Column
    private String bio;

    @Column
    private String twitterHandle;

    @JsonIgnoreProperties("categories")
    @OneToMany(mappedBy = "journalist", fetch = FetchType.LAZY)
    List<Article> articles;

    public Journalist(String firstName, String lastName, String jobTitle, String portraitURL, String bio, String twitterHandle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.portraitURL = portraitURL;
        this.bio = bio;
        this.twitterHandle = twitterHandle;
        this.articles = new ArrayList<>();
    }

    public Journalist() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPortraitURL() {
        return portraitURL;
    }

    public void setPortraitURL(String portraitURL) {
        this.portraitURL = portraitURL;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTwitterHandle() {
        return twitterHandle;
    }

    public void setTwitterHandle(String twitterHandle) {
        this.twitterHandle = twitterHandle;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public void addArticle(Article article){
        this.articles.add(article);
    }

    public void removeArticle(Article article){
        Article foundArticle = null;
        for (Article item : this.articles){
            if (item == article){
                foundArticle = article;
            }
        }
        this.articles.remove(foundArticle);
    }

    public int countArticles(){
        return this.articles.size();
    }
}


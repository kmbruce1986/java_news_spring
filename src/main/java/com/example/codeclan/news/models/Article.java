package com.example.codeclan.news.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;


import javax.persistence.*;
import java.time.LocalDateTime;

import java.util.List;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String headline;

    @Column
    private String subline;


    @Column(name = "copy", columnDefinition = "TEXT")
    private String copy;

    @Column
    private String bannerImage;

    @Column
    private String thumbnailImage;

    @Column
    private LocalDateTime publishedDateTime;

    @JsonIgnoreProperties("articles")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "article_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "category_id", nullable = false, updatable = false)}
    )
    private List<Category> categories;

    @JsonIgnoreProperties("articles")
    @ManyToOne
    @JoinColumn(name = "journalist_id", nullable = false)
    private Journalist journalist;

    @Column
    private int timesRead;

    public Article(String headline, String subline, String copy, String bannerImage, String thumbnailImage, LocalDateTime publishedDateTime, List<Category> categories, Journalist journalist) {
        this.headline = headline;
        this.subline = subline;
        this.copy = copy;
        this.bannerImage = bannerImage;
        this.thumbnailImage = thumbnailImage;
        this.publishedDateTime = publishedDateTime;
        this.categories = categories;
        this.journalist = journalist;
        this.timesRead = 0;
    }



    public Article() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSubline() {
        return subline;
    }

    public void setSubline(String subline) {
        this.subline = subline;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public LocalDateTime getPublishedDateTime() {
        return publishedDateTime;
    }

    public void setPublishedDateTime(LocalDateTime publishedDateTime) {
        this.publishedDateTime = publishedDateTime;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public int getTimesRead() {
        return timesRead;
    }

    public void setTimesRead(int timesRead) {
        this.timesRead = timesRead;
    }

    public void addCategory(Category category){
        this.categories.add(category);
    }

    public void removeCategory(Category category){
        Category foundCategory = null;
        for (Category item : this.categories){
            if (item == category){
                foundCategory = category;
            }
        }
        this.categories.remove(foundCategory);
    }

    public void incrementTimesReadByOne(){
        this.timesRead += 1;
    }

}

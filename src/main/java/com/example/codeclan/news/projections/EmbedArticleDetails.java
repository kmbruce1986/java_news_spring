package com.example.codeclan.news.projections;
import com.example.codeclan.news.models.Article;
import com.example.codeclan.news.models.Category;
import com.example.codeclan.news.models.Journalist;
import org.springframework.data.rest.core.config.Projection;
import java.time.LocalDateTime;
import java.util.List;

@Projection(name = "embedArticleDetails", types = Article.class)
public interface EmbedArticleDetails {
    Long getId();
    String getHeadline();
    String getSubline();
    String getCopy();
    String getBannerImage();
    String getThumbnailImage();
    LocalDateTime getPublishedDateTime();
    List<Category> getCategories();
    Journalist getJournalist();


}

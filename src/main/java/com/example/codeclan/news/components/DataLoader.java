package com.example.codeclan.news.components;

import com.example.codeclan.news.models.Article;
import com.example.codeclan.news.models.Category;
import com.example.codeclan.news.models.Journalist;
import com.example.codeclan.news.repositories.articles.ArticleRepository;
import com.example.codeclan.news.repositories.categories.CategoryRepository;
import com.example.codeclan.news.repositories.journalists.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    JournalistRepository journalistRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args){

        Journalist clarkKent = new Journalist("Clark", "Kent", "Journalist", "blank.jpg", "Super-speedy journalist", "@secretidentity");
        journalistRepository.save(clarkKent);

        Journalist loisLane = new Journalist("Lois", "Lane", "Senior Journalist", "blank.jpg", "Gets herself into sticky situations", "@loislovessuperman");
        journalistRepository.save(loisLane);

        Category technology = new Category("Technology");
        categoryRepository.save(technology);

        Category health = new Category("Health");
        categoryRepository.save(health);

        Category travel = new Category("Travel");
        categoryRepository.save(travel);

        Category politics = new Category("Politics");
        categoryRepository.save(politics);

        Category sport = new Category("Sport");
        categoryRepository.save(sport);

        Date date1 = new GregorianCalendar(2018, Calendar.OCTOBER, 19, 14, 15, 30).getTime();
        Date date2 = new GregorianCalendar(2018, Calendar.OCTOBER, 19, 14, 20, 30).getTime();

        String copy1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non sodales tortor, et interdum ante. Suspendisse sit amet scelerisque ante. Nulla sollicitudin, lorem id ullamcorper pharetra, mi ipsum mollis lectus, et euismod nibh nisi non neque. Pellentesque non maximus est. Ut aliquam leo ut justo convallis, id tristique nunc vestibulum. Nulla a lacus urna. Aliquam pulvinar commodo enim. Sed et mauris auctor elit posuere luctus a vitae augue. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Suspendisse potenti. In hac habitasse platea dictumst. Quisque non odio et nisl bibendum lobortis sed eget augue. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nullam elit dolor, vulputate a lobortis quis, sollicitudin quis mauris. Mauris varius magna vel tellus gravida, ac molestie turpis rhoncus. In dapibus id sem vulputate dictum. Duis vel felis sit amet eros sodales tristique. Morbi nisi diam, tincidunt bibendum nisi ac, gravida vestibulum massa. Proin tempor nisl iaculis elit accumsan consequat eget laoreet odio. In egestas dui vitae imperdiet consectetur. Maecenas molestie tellus ligula, at vestibulum purus varius a. Nunc a ultricies tellus, vitae laoreet ipsum. Mauris eget euismod elit. Quisque consectetur mi turpis, a mollis purus consequat eget.";
        String copy2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non sodales tortor, et interdum ante. Suspendisse sit amet scelerisque ante. Nulla sollicitudin, lorem id ullamcorper pharetra, mi ipsum mollis lectus, et euismod nibh nisi non neque. Pellentesque non maximus est. Ut aliquam leo ut justo convallis, id tristique nunc vestibulum. Nulla a lacus urna. Aliquam pulvinar commodo enim. Sed et mauris auctor elit posuere luctus a vitae augue. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Suspendisse potenti. In hac habitasse platea dictumst. Quisque non odio et nisl bibendum lobortis sed eget augue. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nullam elit dolor, vulputate a lobortis quis, sollicitudin quis mauris. Mauris varius magna vel tellus gravida, ac molestie turpis rhoncus. In dapibus id sem vulputate dictum. Duis vel felis sit amet eros sodales tristique. Morbi nisi diam, tincidunt bibendum nisi ac, gravida vestibulum massa. Proin tempor nisl iaculis elit accumsan consequat eget laoreet odio. In egestas dui vitae imperdiet consectetur. Maecenas molestie tellus ligula, at vestibulum purus varius a. Nunc a ultricies tellus, vitae laoreet ipsum. Mauris eget euismod elit. Quisque consectetur mi turpis, a mollis purus consequat eget.";

        List<Category> category1 = new ArrayList<>();
        category1.add(technology);

        List<Category> category2 = new ArrayList<>();
        category2.add(health);

        Article article1 = new Article("Something happened", "So, something happened...", copy1, "image.png", "anotherimage.png", date1, category1, clarkKent);
        articleRepository.save(article1);

        Article article2 = new Article("Another thing happened", "here it goes", copy2, "image.png", "anotherimage.png", date2, category2, loisLane);
        articleRepository.save(article2);
    }
}

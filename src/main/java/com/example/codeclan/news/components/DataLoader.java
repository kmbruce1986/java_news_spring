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

import javax.persistence.criteria.From;
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
        Date date3 = new GregorianCalendar(2018, Calendar.JUNE, 22,17, 00, 00).getTime();

        String copy1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non sodales tortor, et interdum ante. Suspendisse sit amet scelerisque ante. Nulla sollicitudin, lorem id ullamcorper pharetra, mi ipsum mollis lectus, et euismod nibh nisi non neque. Pellentesque non maximus est. Ut aliquam leo ut justo convallis, id tristique nunc vestibulum. Nulla a lacus urna. Aliquam pulvinar commodo enim. Sed et mauris auctor elit posuere luctus a vitae augue. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Suspendisse potenti. In hac habitasse platea dictumst. Quisque non odio et nisl bibendum lobortis sed eget augue. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nullam elit dolor, vulputate a lobortis quis, sollicitudin quis mauris. Mauris varius magna vel tellus gravida, ac molestie turpis rhoncus. In dapibus id sem vulputate dictum. Duis vel felis sit amet eros sodales tristique. Morbi nisi diam, tincidunt bibendum nisi ac, gravida vestibulum massa. Proin tempor nisl iaculis elit accumsan consequat eget laoreet odio. In egestas dui vitae imperdiet consectetur. Maecenas molestie tellus ligula, at vestibulum purus varius a. Nunc a ultricies tellus, vitae laoreet ipsum. Mauris eget euismod elit. Quisque consectetur mi turpis, a mollis purus consequat eget.";
        String copy2 = "We arrived to Hoi An fairly late at night, however when we did arrive we were pleasantly surprised at the hotel. The hotel itself was a rather lovely building but when we got to our room we found it had been prepared in such a way to make it feel special. There were flowers on the bed, a little message and even a little story waiting for us. It just felt very considered and gave a nice touch to the beginning of our stay. \n The next morning we were up and off fairly early for a walk with our guide to show us around the city. We made our way towards the old town but even on the way there was some rather nice architecture. It felt very different from the modern cities we had been spending time in basically since Malaysia.\n A ticket was required to be in the old town. They didn't check it on entry or exit, however I believe if you were caught without it you could be fined. The ticket included entry to some historical buildings as well as some shows, however unfortunately we didn't really have enough time in Hoi An to take full advantage of all the ticket had to offer.\n We were walked around the old town, and I was in awe. It was just so beautiful and it looked like it had come straight off a postcard. I am pretty sure it was a total tourist trap, and not \"authentic\" but to be honest that didn't bother me it was beautiful and clearly was daily life for those who lived in the area.";
        String copy3 = "The most touristy activity possible in Cambodia is going to watch the sun rise behind Angkor Wat. So after a few days in Siem Reap we gave in and booked a tuk tuk to take us there, leaving our hotel at 4:30am.\nAs we arrived it was still pitch dark and we both instantly regretted not thinking to bring our head torches, but we had our phones so that was good enough. We debated a bit where to stand, I had seen plenty of photos of Angkor Wat at sunrise on the internet and I knew most of them had water in front of it so I wasn't sure if they were taken from the other side of the moat or if there was more water closer to the Wat.\n From the vague outline I could see in the sky that was beginning to lighten ever so slightly I decided we weren't close enough, after looking on google maps we saw that there were in fact two smaller bodies of water within the outer walls, so we went in search of them.\n As we approached we saw that the bodies of water were on either side of the main walkway and judging by the number of lights there, the one on the left hand side looked like it was already pretty crowded (we found out later that is because it is the \"northern reflecting pool\" while the southern one doesn't have a name so is probably less popular). So we headed to the other pool, which it turned out only had two people there when we turned up.\n We chose some spots to stand, or at least I stood and my husband sat down and tried to set up a time lapse on his phone. We soon found out we weren't standing close enough to the water for people not to come and stand directly in front of us. I am afraid I was a bit rude to one lady who did just that, but she hadn't realised, and I did apologise to her later, it was just so early in the morning. Because this incident happened fairly early on, I ended up right on the water's edge and my husband gave up on sitting and set his phone up right at my feet and then stood back a bit. He took photos of the crowd later on in the morning.";

        List<Category> category1 = new ArrayList<>();
        category1.add(technology);

        List<Category> category2 = new ArrayList<>();
        category2.add(health);

        List<Category> category3 = new ArrayList<>();
        category3.add(travel);

        Article article1 = new Article("Something happened", "So, something happened...", copy1, "image.png", "anotherimage.png", date1, category1, clarkKent);
        articleRepository.save(article1);

        Article article2 = new Article("Another thing happened", "here it goes", copy1, "image.png", "anotherimage.png", date2, category2, loisLane);
        articleRepository.save(article2);

        Article article3 = new Article("Take Me Back To Hoi An", "Historic City In Vietnam", copy2, "../../../public/images/take_me_back_to_hoi_an_banner.jpg", "../../../public/images/take_me_back_to_hoi_an_thumb.jpg", date3, category3, loisLane);
        articleRepository.save(article3);

        Article article4 = new Article("Sunrise? Wat Sunrise", "Unbelievable views at Angkor Wat", copy3, "../../../public/images/ankgor_banner.jpg", "../../../public/images/ankgor_thumb.jpg", date1, category3, loisLane);
        articleRepository.save(article4);
    }
}

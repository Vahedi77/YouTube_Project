package org.example.demo8.Model;

import java.util.Date;

class ShortVideo extends Video {
    String nameOfRefrence;

    public ShortVideo(String title, String description, int duration, int numberOfView,
                      int likeCount, Date date, Category category, String linkFile, String coverImage, String subTitles,String nameOfRefrence) {
        super(title, description, duration, numberOfView, likeCount, date, category, linkFile, coverImage, subTitles);
        this.nameOfRefrence=nameOfRefrence;
    }
}

package org.example.demo8.Model;

import java.util.Date;

public abstract class Video extends Content {
    String subTitles;
    public Video(String title, String description, int duration, int numberOfView,
                 int likeCount, Date date, Category category, String linkFile, String coverImage, String subTitles) {
        super(title, description, duration, numberOfView, likeCount, date, category, linkFile, coverImage);
        this.subTitles = subTitles;
    }
}
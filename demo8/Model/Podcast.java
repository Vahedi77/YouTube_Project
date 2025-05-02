package org.example.demo8.Model;

import java.util.Date;

public class Podcast extends Content {
    String ownerOfWork;
    public Podcast(String title, String description, int duration, int numberOfView,
                   int likeCount, Date date, Category category, String linkFile, String coverImage,String ownerOfWork)
    {
        super(title, description, duration,numberOfView,likeCount,date, category,linkFile, coverImage);
        this.ownerOfWork=ownerOfWork;
    }
}

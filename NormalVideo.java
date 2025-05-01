package org.example.demo8.Model;

import java.util.Date;

class NormalVideo extends Video {
    Quality quality;
    Format format;

    public NormalVideo(String title, String description, int duration,
                       int numberOfView, int likeCount, Date date, Category category, String linkFile, String coverImage, String subTitles,Quality quality,Format format) {
        super(title, description, duration, numberOfView, likeCount, date, category, linkFile, coverImage, subTitles);
        this.quality=quality;
        this.format=format;
    }
}

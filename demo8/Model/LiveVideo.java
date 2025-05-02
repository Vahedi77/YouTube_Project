package org.example.demo8.Model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class LiveVideo extends Video {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int viewerCount;

    public LiveVideo(String title, String description, int duration,
                     int numberOfView, int likeCount, Date date, Category category, String linkFile, String coverImage, String subTitles) {
        super(title, description, duration, numberOfView, likeCount, date, category, linkFile, coverImage, subTitles);
        this.startTime=LocalDateTime.now();
    }


    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        this.duration = (int) Duration.between(startTime, endTime).getSeconds();
    }

    public int getViewerCount() {
        return viewerCount;
    }

}

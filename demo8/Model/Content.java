package org.example.demo8.Model;

import java.util.ArrayList;
import java.util.Date;

///
public abstract class Content {
    protected int id=10000;
    protected String title;
    protected String description;
    protected int duration;
    protected int numberOfView;
    protected int likeCount = 0;
    protected Date date;
    protected Category category;
    protected String linkFile;
    protected String coverImage;
    protected ArrayList<Comment> listOfComment;


    public Content(String title, String description, int duration, int numberOfView,
                   int likeCount, Date date, Category category, String linkFile, String coverImage) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.numberOfView = numberOfView;
        this.likeCount = likeCount;
        this.date = date;
        this.category = category;
        this.linkFile = linkFile;
        this.coverImage = coverImage;
        id++;
    }
    public ArrayList<Comment> getListOfComment() {
        return listOfComment;
    }
    public String getTitle() {return title;}

    public String getDescription() {return description;}

    public int getDuration() {return duration;}

    public int getNumberOfView() {return numberOfView;}

    public Date getDate() {return date;}

    public Category getCategory() {return category;}

    public String getLinkFile() {return linkFile;}

    public String getCoverImage() {return coverImage;}

    public int getLikeCount() {
        return likeCount;
    }

    public int getId() {
        return id;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public void setNumberOfView(int numberOfView) {
        this.numberOfView = numberOfView;
    }
}

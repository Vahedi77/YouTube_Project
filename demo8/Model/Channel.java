package org.example.demo8.Model;

import java.util.ArrayList;
import java.util.Collections;

/// ////

public class  Channel {
    private int id=1000;
    private String name;
    private String description;
    private String cover;
    private User owner;
    private ArrayList<Content> contents=new ArrayList<>();
    private ArrayList<User> subscribers=new ArrayList<>();

    public Channel(String name, String description, String cover, User owner) {
        this.name = name;
        this.description = description;
        this.cover = cover;
        this.owner = owner;
        id++;
    }

    public ArrayList<Content> getContents() {
        return contents;
    }


    public int getSubscriberCount() {
        return subscribers.size();
    }

    public ArrayList<User> getSubscribers() {return subscribers;}

    public String getName() {
        return name;
    }
}

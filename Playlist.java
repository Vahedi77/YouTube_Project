package org.example.demo8.Model;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private int id=1000;
    private String name;
    private ArrayList<Content> contents = new ArrayList<>();


    public Playlist(String name) {

        this.name = name;
        id++;
    }

    public ArrayList<Content> getContents() {
        return contents;
    }

    public int getId() {return id;}

    public String getName() {return name;}

}

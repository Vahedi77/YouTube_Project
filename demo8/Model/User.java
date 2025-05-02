package org.example.demo8.Model;

import java.util.ArrayList;
import java.util.List;

public abstract class User extends Account {
    protected int credit;
    protected Channel channelOfUser;
    protected List<Playlist> playlists ;
    protected List<Channel> subscriptions ;
    protected ArrayList<Category> favoriteCategory;
    protected ArrayList<Content> likedContent;
    protected ArrayList<Content> playedContent;




    public User(String username, String password, String firstNameLastName, String email, String phone, String profilePictureURL, int credit) {
        super(username, password, firstNameLastName, email, phone, profilePictureURL);
        this.credit=credit;
        playlists= new ArrayList<>();
        subscriptions = new ArrayList<>();
        favoriteCategory=new ArrayList<>();
        likedContent=new ArrayList<>();
        playedContent=new ArrayList<>();
        Playlist likedPlayList=new Playlist("Liked");
        Playlist watchedLaterPlayList=new Playlist("Watch Later");
        playlists.add(likedPlayList);
        playlists.add(watchedLaterPlayList);
    }

    public ArrayList<Category> getFavoriteCategory() {return favoriteCategory;}
    public List<Playlist> getPlaylists() { return playlists; }
    public List<Channel> getSubscriptions() { return subscriptions; }

    public int getCredit() {
        return credit;
    }

    public Channel getChannelOfUser() {
        return channelOfUser;
    }


    public ArrayList<Content> getLikedContent() {
        return likedContent;
    }

    public ArrayList<Content> getPlayedContent() {
        return playedContent;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setChannelOfUser(Channel channelOfUser) {
        this.channelOfUser = channelOfUser;
    }
}



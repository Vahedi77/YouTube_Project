package org.example.demo8.Model;

public class RegularUser extends User {
    public static final int maxNumberOfContent = 50;
    public static final int maxNumberOfPlaylist = 10;
    public static  int numberOfPlaylist=0;
    public static  int numberOfContent=0;


    public RegularUser(String username, String password, String firstNameLastName, String email, String phone, String profilePictureURL, int credit) {
        super(username, password, firstNameLastName, email, phone, profilePictureURL, credit);
    }

    public static int getMaxNumberOfContent() {
        return maxNumberOfContent;
    }

    public static int getMaxNumberOfPlaylist() {
        return maxNumberOfPlaylist;
    }
    public  int getNumberOfPlaylist(){return numberOfPlaylist;};

}

package org.example.demo8.Model;

public  class Admin extends Account {
    private static Admin admin;
    private Admin(String username, String password, String firstNameLastName, String email
            , String phone, String profilePictureURL) {
        super(username, password, firstNameLastName, email, phone, profilePictureURL);
    }

        public static Admin getAdmin(String userName, String password, String firstNameLastName, String email, String phoneNumber,String profilePictureURL) {
            if (admin == null) {
               admin=new Admin(userName,password,firstNameLastName,email,phoneNumber,profilePictureURL);
            }
            return admin;
        }

        public static Admin getAdmin(){
            return admin;
        }


    }


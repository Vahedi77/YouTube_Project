package org.example.demo8.Model;

public abstract class Account {
    protected String username;
    protected String password;
    protected String firstNameLastName;
    protected String email;
    protected String phone;
    protected String profilePictureURL;

     public Account(String username, String password, String firstNameLastName,
                   String email, String phone, String profilePictureURL) {
        this.username = username;
        this.password = password;
        this.firstNameLastName = firstNameLastName;
        this.email = email;
        this.phone = phone;
        this.profilePictureURL = profilePictureURL;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        }
    }

    public void setFirstNameLastName(String firstNameLastName) {
        if (firstNameLastName != null && !firstNameLastName.isEmpty()) {
            this.firstNameLastName = firstNameLastName;
        }
    }
    public void setEmail(String email) {

            this.email = email;

    }
    public void setPhone(String phone) {
        if (phone != null && phone.matches("^\\+?[0-9]{10,15}$")) {
            this.phone = phone;
        }
    }

    public void setProfilePictureURL(String profilePictureURL) {
        if (profilePictureURL != null) {
            this.profilePictureURL = profilePictureURL;
        }
    }

    public String getProfilePictureURL() {
        return profilePictureURL;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }


    public String getFirstNameLastName() {
        return firstNameLastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

package org.example.demo8.Model;

import java.util.Date;

public class PremiumUser extends User {
    private Date subscriptionEndDate;

    public PremiumUser(String username, String password, String firstNameLastName, String email, String phone, String profilePictureURL, int credit, Date subscriptionEndDate) {
        super(username, password, firstNameLastName, email, phone, profilePictureURL, credit);
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public Date getSubscriptionEndDate() {
        return subscriptionEndDate;
    }

    public void setSubscriptionEndDate(Date subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }
}

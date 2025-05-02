package org.example.demo8.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.demo8.Model.*;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class ChargeSubscription {
    User user=(User)UserManager.getInstance().getCurrentUser();

    @FXML
    private Button bronzeBtn;

    @FXML
    private Button channelBtn;

    @FXML
    private Label errorLbl;

    @FXML
    private Button goldBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button libraryBtn;

    @FXML
    private Button silverBtn;

    @FXML
    private Button subscriptionBtn;

    @FXML
    void handleBronzeBtn(ActionEvent event) {
        if(user.getCredit()>5)
        {
            if(user instanceof RegularUser)
            {
                Date currentDate=new Date();
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(currentDate);
                calendar.add(Calendar.DAY_OF_YEAR,30);
                Date endTimeOfSubscription=calendar.getTime();
                PremiumUser premiumUser=new PremiumUser(user.getUsername(), user.getPassword(), user.getFirstNameLastName(),
                        user.getEmail(), user.getPhone(), user.getProfilePictureURL(), user.getCredit(),endTimeOfSubscription);
                Database.getDatabase().getAccounts().remove(user);
                Database.getDatabase().getAccounts().add(premiumUser);
                user=premiumUser;
                errorLbl.setText("The operation was successful.\n" +
                        "Bronze package purchased");

            }
            else if(user instanceof PremiumUser)
            {
                Date priviousEndTime=((PremiumUser) user).getSubscriptionEndDate();
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(priviousEndTime);
                calendar.add(Calendar.DAY_OF_YEAR,30);
                Date endTimeOfSubscription=calendar.getTime();
                ((PremiumUser) user).setSubscriptionEndDate(endTimeOfSubscription);
                errorLbl.setText("The operation was successful.\n" +
                        "Bronze package purchased");


            }
        }
        else {
            errorLbl.setText("you dont have enough credit");
        }

    }

    @FXML
    void handleSilverBtn(ActionEvent event) {
        if(user.getCredit()>9)
        {
            if(user instanceof RegularUser)
            {
                Date currentDate=new Date();
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(currentDate);
                calendar.add(Calendar.DAY_OF_YEAR,60);
                Date endTimeOfSubscription=calendar.getTime();
                PremiumUser premiumUser=new PremiumUser(user.getUsername(), user.getPassword(), user.getFirstNameLastName(),
                        user.getEmail(), user.getPhone(), user.getProfilePictureURL(), user.getCredit(),endTimeOfSubscription);
                Database.getDatabase().getAccounts().remove(user);
                Database.getDatabase().getAccounts().add(premiumUser);
                user=premiumUser;
                errorLbl.setText("The operation was successful.\n" +
                        "Silver package purchased");

            }
            else if(user instanceof PremiumUser)
            {
                Date priviousEndTime=((PremiumUser) user).getSubscriptionEndDate();
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(priviousEndTime);
                calendar.add(Calendar.DAY_OF_YEAR,60);
                Date endTimeOfSubscription=calendar.getTime();
                ((PremiumUser) user).setSubscriptionEndDate(endTimeOfSubscription);
                errorLbl.setText("The operation was successful.\n" +
                        "ُSilver package purchased");


            }

        }
        else {
            errorLbl.setText("you dont have enough credit");
        }



    }



    @FXML
    void handleGoldBtn(ActionEvent event) {

        if(user.getCredit()>14)
        {
            if(user instanceof RegularUser)
            {
                Date currentDate=new Date();
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(currentDate);
                calendar.add(Calendar.DAY_OF_YEAR,180);
                Date endTimeOfSubscription=calendar.getTime();
                PremiumUser premiumUser=new PremiumUser(user.getUsername(), user.getPassword(), user.getFirstNameLastName(),
                        user.getEmail(), user.getPhone(), user.getProfilePictureURL(), user.getCredit(),endTimeOfSubscription);
                Database.getDatabase().getAccounts().remove(user);
                Database.getDatabase().getAccounts().add(premiumUser);
                user=premiumUser;
                errorLbl.setText("The operation was successful.\n" +
                        "Gold package purchased");

            }
            else if(user instanceof PremiumUser)
            {
                Date priviousEndTime=((PremiumUser) user).getSubscriptionEndDate();
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(priviousEndTime);
                calendar.add(Calendar.DAY_OF_YEAR,180);
                Date endTimeOfSubscription=calendar.getTime();
                ((PremiumUser) user).setSubscriptionEndDate(endTimeOfSubscription);
                errorLbl.setText("The operation was successful.\n" +
                        "Gold package purchased");
            }

        }
        else {
            errorLbl.setText("you dont have enough credit");
        }

    }

    @FXML
    void handleHomeBtn(ActionEvent event) throws IOException {
        Stage currentStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root= FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene newScene=new Scene(root);
        currentStage.setScene(newScene);

    }

    @FXML
    void handleLibraryBtn(ActionEvent event) throws IOException {
        Stage currentStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root= FXMLLoader.load(getClass().getResource("Library.fxml"));
        Scene newScene=new Scene(root);
        currentStage.setScene(newScene);

    }

    @FXML
    void handleChannelBtn(ActionEvent event) {

    }
    @FXML
    void handleSubscriptionBtn(ActionEvent event) {

    }
}

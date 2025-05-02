package org.example.demo8.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.example.demo8.Model.User;

import java.io.IOException;
import java.util.ArrayList;

public class Library {
    UserController userController=new UserController();
    User user=(User)UserManager.getInstance().getCurrentUser();


    @FXML
    private Button channelBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button libraryBtn;


    @FXML
    private Button subscriptionBtn;

    @FXML
    private Button LogoutBtn;

    @FXML
    private Button NewPlayListBtn;

    @FXML
    private Button PurchaseSubscriptionBtn;

    @FXML
    private Button listOfPlaylistBtn;

    @FXML
    private Label nameLbl;

    @FXML
    private Label passwordLbl;

    @FXML
    private Label emailLbl;

    @FXML
    private Label phoneLbl;

    @FXML
    private ImageView profileImage;


    @FXML
    private Label libraryLbl;





    @FXML
    public void initialize()
    {
        Color paint = new Color(0.8632, 0.1279, 0.1279, 1.0);
        libraryLbl.setStyle(String.valueOf(paint));

        nameLbl.setText(user.getFirstNameLastName());
        emailLbl.setText(user.getEmail());
        passwordLbl.setText(user.getPassword());
        phoneLbl.setText(user.getPhone());
//        Image image=(Image)user.getProfilePictureURL();
//        profileImage.setImage(image);
//        String profileAddress=UserManager.getInstance().getCurrentUser().getProfilePictureURL();
//        int defaultImageResId = R.drawable.default_image;
//        if (profileAddress == null || profileAddress.trim().isEmpty()) {
//            profileView.setImageResource(defaultImageResId);
//            return;
//        }
//
//        Glide.with(this)
//                .load(profileAddress)
//                .placeholder(R.drawable.loading_placeholder)
//                .error(defaultImageResId)
//                .fallback(defaultImageResId)
//                .into(profileView);
    }



    @FXML
    void handleChannelBtn(ActionEvent event) {

    }

    @FXML
    void handleHomeBtn(ActionEvent event) throws IOException {
        Stage currentStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root= FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene newScene=new Scene(root);
        currentStage.setScene(newScene);

    }

//    @FXML
//    void handleSearchBtn(ActionEvent event) throws IOException {
//        String text=SearchField.getText();
//        ArrayList arrayList=userController.search(text);
//        Stage currentStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
//        Parent root= FXMLLoader.load(getClass().getResource("Library.fxml"));
//        Scene newScene=new Scene(root);
//        currentStage.setScene(newScene);
//
//    }

    @FXML
    void handleSubscriptionBtn(ActionEvent event) {

    }

    @FXML
    void handleLibraryBtn(ActionEvent event) throws IOException {
        Stage currentStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root= FXMLLoader.load(getClass().getResource("Library.fxml"));
        Scene newScene=new Scene(root);
        currentStage.setScene(newScene);

    }



    @FXML
    void handleLogoutBtn(ActionEvent event) throws IOException {
        userController.logOut();

        Stage currentStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root= FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene newScene=new Scene(root);
        currentStage.setScene(newScene);

    }


    @FXML
    void handleNewPlayListBtn(ActionEvent event) {



    }

    @FXML
    void handlePurchaseSubscriptionBtn(ActionEvent event) throws IOException {
        Stage currentStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root= FXMLLoader.load(getClass().getResource("CahrgeSubscription.fxml"));
        Scene newScene=new Scene(root);
        currentStage.setScene(newScene);

    }

    @FXML
    void handleListOfPlaylistBtn(ActionEvent event) {

    }
}

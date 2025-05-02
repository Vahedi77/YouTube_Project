package org.example.demo8.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Home {
    @FXML
    private TextField SearchField;

    @FXML
    private Button channelBtn;

    @FXML
    private AnchorPane homeAncherPane;

    @FXML
    private Button homeBtn;

    @FXML
    private Button libraryBtn;

    @FXML
    private Button searchBtn;

    @FXML
    private Button subscriptionBtn;

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

    @FXML
    void handleSearchBtn(ActionEvent event) {

    }

    @FXML
    void handleSubscriptionBtn(ActionEvent event) {

    }

    @FXML
    void handlelibraryBtn(ActionEvent event) {

    }

}

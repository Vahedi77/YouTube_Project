package org.example.demo8.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.example.demo8.Model.User;

import java.io.IOException;

public class SigningUpController {
    User user=(User)UserManager.getInstance().getCurrentUser();
    UserController userController=new UserController();

    @FXML
    private ImageView SignUpLabel;

    @FXML
    private TextField emailField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField numberField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signUpField;
    @FXML
    private Label errorLabel;


    @FXML
    void SignUpAction(ActionEvent event) throws IOException {
        String name=nameField.getText();
        String email=emailField.getText();
        String password=passwordField.getText();
        String number=numberField.getText();
        user.setFirstNameLastName(name);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(number);
        if(userController.SignUp()) {
            errorLabel.setText("login successfully");
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("FavoriteCategotry.fxml"));
            Scene newScene = new Scene(root);
            currentStage.setScene(newScene);

        }
        else {
            errorLabel.setText("Login failed.Try again!");

        }


    }

}


package org.example.demo8.Controller;
import javafx.scene.Node;
import org.example.demo8.Controller.UserController.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.example.demo8.Model.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    @FXML
    private ImageView LogoYouTub;


    @FXML
    private Button SignupBotton;


    @FXML
    private Button loginBotton;

    @FXML
    private Label errorLabel;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField textFeild;

    @FXML
    void handleLogin(ActionEvent event) throws IOException {
        UserController userController=new UserController();
        String username = textFeild.getText().trim();
        String password = passwordField.getText().trim();
        Account account = UserManager.getInstance().getCurrentUser();
        account.setPassword(password);
        account.setUsername(username);
        userController.login();
        if (username.isEmpty() || password.isEmpty()) {

            showError("please enter your username and password");
            return;
        }
        if (UserController.AdminLogin) {


            /// صفحه مدیر ساخته بشه

        } else {
            errorLabel.setText("This username was not found as an administrator! ");
            errorLabel.setStyle("-fx-text-fill: red;");
        }
        if (UserController.UserLogin)
        {
            Stage currentStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
            Parent root= FXMLLoader.load(getClass().getResource("Home.fxml"));
            Scene newScene=new Scene(root);
            currentStage.setScene(newScene);

        } else {
            errorLabel.setText("This username was not found!");
            errorLabel.setStyle("-fx-text-fill: red;");
        }
    }
    @FXML
    void handleSignupBotton(ActionEvent event) throws IOException {
        Stage currentStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root= FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene newScene=new Scene(root);
        currentStage.setScene(newScene);
    }



    private void showError(String message){
        errorLabel.setText(message);
        errorLabel.setVisible(true);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LogoYouTub.setImage(new Image("C:\\Users\\Aminsystem\\Desktop\\OIP.JPG"));
    }

//    private void loadUserScene(String fxmlFile, account) {
//        Parent root=FXMLLoader.load()
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("src/main/java/org/example/demo8/Controller/HomeController.java"));
//        Parent root = loader.load();
//
//        HomeController controller = loader.getController();
//
//        Stage stage = (Stage) enterBotton.getScene().getWindow();
//        stage.setScene(new Scene(root));
//    }

}
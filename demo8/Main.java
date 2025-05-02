package org.example.demo8;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Objects;

public class Main extends Application {
    @Override
        public void start(Stage primaryStage) throws Exception {
            FXMLLoader fxmlLoader=new FXMLLoader();
            URL fxml=getClass().getResource("login.fxml");

            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(fxml);
            Parent root=loader.load();

            primaryStage.setTitle("YouTube");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        }
    public static void main(String[] args) {
        launch(args);
    }


    }


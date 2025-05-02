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
import org.example.demo8.Model.Category;
import org.example.demo8.Model.User;

import java.io.IOException;

public class FavoriteCategory {
    @FXML
    private Label ChoosingCategoryLbl;


    @FXML
    private Button Artbtn;

    @FXML
    private Button Gamebtn;

    @FXML
    private Button Historybtn;

    @FXML
    private Button Livebtn;

    @FXML
    private Button Musicbtn;

    @FXML
    private Button NewsBotton;

    @FXML
    private Button Podcastbtn;

    @FXML
    private Button Societybtn;

    @FXML
    private Button Sportbtn;
    @FXML
    private Button NextBtn;


     User user=(User)UserManager.getInstance().getCurrentUser();
     static int numberOfCategory=0;


    @FXML
    void handleArtbtn(ActionEvent event) {
        Category art=Category.Art;
        boolean isClicked=false;
        if(!isClicked) {
            user.getFavoriteCategory().add(art);
            isClicked=true;
            numberOfCategory++;
        }
        if(isClicked)
        {
            user.getFavoriteCategory().remove(art);
            isClicked=false;
            numberOfCategory--;

        }

    }

    @FXML
    void handleGamebtn(ActionEvent event) {
        Category game = Category.Game;
        boolean isClicked=false;
        if(!isClicked) {
            user.getFavoriteCategory().add(game);
            isClicked=true;
            numberOfCategory++;
        }
        if(isClicked)
        {
            user.getFavoriteCategory().remove(game);
            isClicked=false;
            numberOfCategory--;
        }


    }

    @FXML
    void handleHistorybtn(ActionEvent event) {
        Category history=Category.History;
        boolean isClicked=false;
        if(!isClicked) {
            user.getFavoriteCategory().add(history);
            isClicked=true;
            numberOfCategory++;
        }
        if(isClicked)
        {
            user.getFavoriteCategory().remove(history);
            isClicked=false;
            numberOfCategory--;
        }

    }

    @FXML
    void handleLivebtn(ActionEvent event) {
        Category live=Category.Live;
        boolean isClicked=false;
        if(!isClicked) {
            user.getFavoriteCategory().add(live);
            isClicked=true;
            numberOfCategory++;
        }
        if(isClicked)
        {
            user.getFavoriteCategory().remove(live);
            isClicked=false;
            numberOfCategory--;
        }

    }

    @FXML
    void handleMusicbtn(ActionEvent event) {
        Category music=Category.Music;
        boolean isClicked=false;
        if(!isClicked) {
            user.getFavoriteCategory().add(music);
            isClicked=true;
            numberOfCategory++;
        }
        if(isClicked)
        {
            user.getFavoriteCategory().remove(music);
            isClicked=false;
            numberOfCategory--;
        }

    }

    @FXML
    void handleNewsBtn(ActionEvent event) {
        Category news=Category.News;
        boolean isClicked=false;
        if(!isClicked) {
            user.getFavoriteCategory().add(news);
            isClicked=true;
            numberOfCategory++;
        }
        if(isClicked)
        {
            user.getFavoriteCategory().remove(news);
            isClicked=false;
            numberOfCategory--;
        }

    }

    @FXML
    void handlePodcastbtn(ActionEvent event) {
        Category podcast=Category.Podcast;
        boolean isClicked=false;
        if(!isClicked) {
            user.getFavoriteCategory().add(podcast);
            isClicked=true;
            numberOfCategory++;
        }
        if(isClicked)
        {
            user.getFavoriteCategory().remove(podcast);
            isClicked=false;
            numberOfCategory--;

        }

    }

    @FXML
    void handleSocietybtn(ActionEvent event) {
        Category society=Category.Society;
        boolean isClicked=false;
        if(!isClicked) {
            user.getFavoriteCategory().add(society);
            isClicked=true;
            numberOfCategory++;
        }
        if(isClicked)
        {
            user.getFavoriteCategory().remove(society);
            isClicked=false;
            numberOfCategory--;
        }

    }

    @FXML
    void handleSportbtn(ActionEvent event) {
        Category sport=Category.Sport;
        boolean isClicked=false;
        if(!isClicked) {
            user.getFavoriteCategory().add(sport);
            isClicked=true;
            numberOfCategory++;
        }
        if(isClicked)
        {
            user.getFavoriteCategory().remove(sport);
            isClicked=false;
            numberOfCategory--;
        }

    }
    @FXML
    void handleNextbtn(ActionEvent event) throws IOException {
        if(numberOfCategory<4)
        {
            ChoosingCategoryLbl.setText("you have not selected at least 4 categories");
            ChoosingCategoryLbl.setStyle("-fx-text-fill: red;");
        }
        else
        {
            Stage currentStage=(Stage) ((Node) event.getSource()).getScene().getWindow();

        Parent root= FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene newScene=new Scene(root);
        currentStage.setScene(newScene);}

    }
}

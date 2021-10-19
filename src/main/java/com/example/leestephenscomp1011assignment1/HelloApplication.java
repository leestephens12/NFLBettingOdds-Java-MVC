package com.example.leestephenscomp1011assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mvp-line-graph-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        /*
            I downloaded this photo from https://air.inc/logos/nfl-logo-slack-theme
            but it isa property of the NFL and this image will be used for educational
            purposes only.
         */

        //Changing scene icon
        Image icon = new Image("file:nflLogo.png");
        stage.getIcons().add(icon);
        stage.setTitle("Mvp Odds Line Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
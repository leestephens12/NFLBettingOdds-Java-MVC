package com.example.leestephenscomp1011assignment1.Utilities;

import com.example.leestephenscomp1011assignment1.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//Scene changer class to make it easier to change between scenes
public class SceneChanger {
    public static void changeScenes(ActionEvent event, String fxmlFileLocation, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileLocation));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
}
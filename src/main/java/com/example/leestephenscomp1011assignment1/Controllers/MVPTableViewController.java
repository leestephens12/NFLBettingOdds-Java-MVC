package com.example.leestephenscomp1011assignment1.Controllers;

import com.example.leestephenscomp1011assignment1.Models.MvpPlayer;
import com.example.leestephenscomp1011assignment1.Utilities.DBUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MVPTableViewController implements Initializable {

    @FXML
    private TableView<MvpPlayer> mvpTableView;

    @FXML
    private TableColumn<MvpPlayer, String> mvpPlayerColumn;

    @FXML
    private TableColumn<MvpPlayer, Integer> mvpOddsColumn;

    @FXML
    private TableColumn<MvpPlayer, String> dateColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mvpPlayerColumn.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        mvpOddsColumn.setCellValueFactory(new PropertyValueFactory<>("odds"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        mvpTableView.getItems().addAll(DBUtility.getMvpPlayerData());
    }
}


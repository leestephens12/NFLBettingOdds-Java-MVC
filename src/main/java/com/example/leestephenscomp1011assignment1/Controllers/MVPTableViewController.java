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
    private TableColumn<MvpPlayer, Integer> playerIdColumn;

    @FXML
    private TableColumn<MvpPlayer, String> mvpPlayerColumn;

    @FXML
    private TableColumn<MvpPlayer, Integer> mvpOddsColumn;

    @FXML
    private TableColumn<MvpPlayer, String> dateColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playerIdColumn.setCellValueFactory(new PropertyValueFactory<>("mvpplayerId"));
        mvpPlayerColumn.setCellValueFactory(new PropertyValueFactory<>("mvpplayer"));
        mvpOddsColumn.setCellValueFactory(new PropertyValueFactory<>("mvpodds"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("mvpdate"));

        mvpTableView.getItems().addAll(DBUtility.getMVPOddsTable());
    }
}


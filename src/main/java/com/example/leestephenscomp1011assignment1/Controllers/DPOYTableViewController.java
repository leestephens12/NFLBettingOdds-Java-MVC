package com.example.leestephenscomp1011assignment1.Controllers;

import com.example.leestephenscomp1011assignment1.Models.DpoyPlayer;
import com.example.leestephenscomp1011assignment1.Utilities.DBUtility;
import com.example.leestephenscomp1011assignment1.Utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DPOYTableViewController implements Initializable {


    @FXML
    private TableView<DpoyPlayer> dpoyTableView;

    @FXML
    private TableColumn<DpoyPlayer, ?> dpoyPlayerColumn;

    @FXML
    private TableColumn<DpoyPlayer, ?> dpoyOddsColumn;

    @FXML
    private TableColumn<DpoyPlayer, ?> dateColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //setting the values to the individual columns
        dpoyPlayerColumn.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        dpoyOddsColumn.setCellValueFactory(new PropertyValueFactory<>("odds"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        dpoyTableView.getItems().addAll(DBUtility.getDpoyPlayerData());
    }


    @FXML
    void backToDpoyGraph(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event,"dpoy-line-graph-view.fxml", "DPOY Odds Line Chart");
    }
}

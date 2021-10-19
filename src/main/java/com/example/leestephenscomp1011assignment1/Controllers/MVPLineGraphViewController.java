package com.example.leestephenscomp1011assignment1.Controllers;

import com.example.leestephenscomp1011assignment1.Utilities.DBUtility;
import com.example.leestephenscomp1011assignment1.Utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MVPLineGraphViewController implements Initializable {

    @FXML
    private LineChart<String, Integer> mvpLineChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mvpLineChart.getData().add(DBUtility.getPatrickMahomes());
        mvpLineChart.getData().add(DBUtility.getTomBrady());
        mvpLineChart.getData().add(DBUtility.getJustinHerbert());
        mvpLineChart.getData().add(DBUtility.getJoshAllen());
        mvpLineChart.getData().add(DBUtility.getKylerMurray());
    }

    @FXML
    private void changeToDPOYLineChart(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "dpoy-line-graph-view.fxml", "DPOY Odds Line Chart");
    }

    @FXML
    public void goToMvpChart(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event,"mvp-table-view.fxml", "MVP Odds Table View");
    }
}

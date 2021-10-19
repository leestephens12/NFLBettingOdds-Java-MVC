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

public class DPOYLineGraphController implements Initializable {

    @FXML
    private LineChart<String, Integer> dpoyLineChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Adding each individual player stats to the line chart
        dpoyLineChart.getData().add(DBUtility.getMylesGarret());
        dpoyLineChart.getData().add(DBUtility.getAaronDonald());
        dpoyLineChart.getData().add(DBUtility.getTrevonDiggs());
        dpoyLineChart.getData().add(DBUtility.getNickBosa());
        dpoyLineChart.getData().add(DBUtility.getTJWatt());
    }

    @FXML
    private void changeToMVPLineChart(ActionEvent event) throws IOException {
        //change scenes to the mvp line chart
        SceneChanger.changeScenes(event, "mvp-line-graph-view.fxml", "MVP Odds Line Chart");
    }

    @FXML
    private void changeToDPOYTableView(ActionEvent event) throws IOException {
        //change scenes to dpoy table view
        SceneChanger.changeScenes(event, "dpoy-table-view.fxml", "DPOY Odds Chart");
    }
}

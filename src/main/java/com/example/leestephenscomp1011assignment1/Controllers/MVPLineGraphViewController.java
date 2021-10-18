package com.example.leestephenscomp1011assignment1.Controllers;

import com.example.leestephenscomp1011assignment1.Utilities.DBUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;

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
}

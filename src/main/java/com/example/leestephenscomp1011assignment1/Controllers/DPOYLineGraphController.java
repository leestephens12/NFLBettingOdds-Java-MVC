package com.example.leestephenscomp1011assignment1.Controllers;

import com.example.leestephenscomp1011assignment1.Utilities.DBUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;

import java.net.URL;
import java.util.ResourceBundle;

public class DPOYLineGraphController implements Initializable {

    @FXML
    private LineChart<String, Integer> dpoyLineChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dpoyLineChart.getData().add(DBUtility.getMylesGarret());
        dpoyLineChart.getData().add(DBUtility.getAaronDonald());
        dpoyLineChart.getData().add(DBUtility.getTrevonDiggs());
        dpoyLineChart.getData().add(DBUtility.getNickBosa());
        dpoyLineChart.getData().add(DBUtility.getTJWatt());
    }
}

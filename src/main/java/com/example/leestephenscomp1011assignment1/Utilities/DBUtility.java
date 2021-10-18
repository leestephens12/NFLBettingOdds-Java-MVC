package com.example.leestephenscomp1011assignment1.Utilities;

import javafx.scene.chart.XYChart;


import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class DBUtility {
    private static String user = "root";
    private static String pw = "";
    private static String connectURL = "jdbc:mysql://localhost:3306/javaProjects";

    public static XYChart.Series<String, Integer> getPatrickMahomes() {
        XYChart.Series<String, Integer> patrickMahomes = new XYChart.Series<>();

        //SQL command to get info to populate bar chart
        String sql = "SELECT mvpdate, mvpodds FROM mvp WHERE mvpplayer = 'Patrick Mahomes';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                patrickMahomes.getData().add(new XYChart.Data<>(resultSet.getString("mvpdate"), resultSet.getInt("mvpodds")));

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return patrickMahomes;
    }

    public static XYChart.Series<String, Integer> getTomBrady() {
        XYChart.Series<String, Integer> tomBrady = new XYChart.Series<>();

        //SQL command to get info to populate bar chart
        String sql = "SELECT mvpdate, mvpodds FROM mvp WHERE mvpplayer = 'Tom Brady';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                tomBrady.getData().add(new XYChart.Data<>(resultSet.getString("mvpdate"), resultSet.getInt("mvpodds")));

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return tomBrady;
    }

    public static XYChart.Series<String, Integer> getJustinHerbert() {
        XYChart.Series<String, Integer> justinHerbert = new XYChart.Series<>();

        //SQL command to get info to populate bar chart
        String sql = "SELECT mvpdate, mvpodds FROM mvp WHERE mvpplayer = 'Justin Herbert';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                justinHerbert.getData().add(new XYChart.Data<>(resultSet.getString("mvpdate"), resultSet.getInt("mvpodds")));

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return justinHerbert;
    }

    public static XYChart.Series<String, Integer> getJoshAllen() {
        XYChart.Series<String, Integer> joshAllen = new XYChart.Series<>();

        //SQL command to get info to populate bar chart
        String sql = "SELECT mvpdate, mvpodds FROM mvp WHERE mvpplayer = 'Josh Allen';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                joshAllen.getData().add(new XYChart.Data<>(resultSet.getString("mvpdate"), resultSet.getInt("mvpodds")));

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return joshAllen;
    }

    public static XYChart.Series<String, Integer> getKylerMurray() {
        XYChart.Series<String, Integer> kylerMurray = new XYChart.Series<>();

        //SQL command to get info to populate bar chart
        String sql = "SELECT mvpdate, mvpodds FROM mvp WHERE mvpplayer = 'Kyler Murray';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                kylerMurray.getData().add(new XYChart.Data<>(resultSet.getString("mvpdate"), resultSet.getInt("mvpodds")));

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return kylerMurray;
    }

}
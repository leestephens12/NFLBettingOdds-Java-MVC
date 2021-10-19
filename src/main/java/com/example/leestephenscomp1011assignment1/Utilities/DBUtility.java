package com.example.leestephenscomp1011assignment1.Utilities;

import com.example.leestephenscomp1011assignment1.Models.DpoyPlayer;
import com.example.leestephenscomp1011assignment1.Models.MvpPlayer;
import javafx.scene.chart.XYChart;


import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class DBUtility {
    private static String user = "root";
    private static String pw = "";
    private static String connectURL = "jdbc:mysql://localhost:3306/javaProjects";

    /**
     *
     * Returns All Mvp Classes to return XY Charts to populate line charts
     */
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
                patrickMahomes.setName("Patrick Mahomes");

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return patrickMahomes;
    }

    public static XYChart.Series<String, Integer> getTomBrady() {
        XYChart.Series<String, Integer> tomBrady = new XYChart.Series<>();

        //SQL command to get info to populate line chart
        String sql = "SELECT mvpdate, mvpodds FROM mvp WHERE mvpplayer = 'Tom Brady';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                tomBrady.getData().add(new XYChart.Data<>(resultSet.getString("mvpdate"), resultSet.getInt("mvpodds")));
                tomBrady.setName("Tom Brady");

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
                justinHerbert.setName("Justin Herbert");

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
                joshAllen.setName("Josh Allen");

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
                kylerMurray.setName("Kyler Murray");

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return kylerMurray;
    }

    /**
     *
     * All DPOY Classes that return XYCharts to populate line charts
     */
    public static XYChart.Series<String, Integer> getMylesGarret() {
        XYChart.Series<String, Integer> mylesGarrett = new XYChart.Series<>();

        //SQL command to get info to populate bar chart
        String sql = "SELECT dpoydate, dpoyodds FROM dpoy WHERE dpoyplayer = 'Myles Garrett';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                mylesGarrett.getData().add(new XYChart.Data<>(resultSet.getString("dpoydate"), resultSet.getInt("dpoyodds")));
                mylesGarrett.setName("Myles Garrett");

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return mylesGarrett;
    }

    public static XYChart.Series<String, Integer> getAaronDonald() {
        XYChart.Series<String, Integer> aaronDonald = new XYChart.Series<>();

        //SQL command to get info to populate bar chart
        String sql = "SELECT dpoydate, dpoyodds FROM dpoy WHERE dpoyplayer = 'Aaron Donald';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                aaronDonald.getData().add(new XYChart.Data<>(resultSet.getString("dpoydate"), resultSet.getInt("dpoyodds")));
                aaronDonald.setName("Aaron Donald");

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return aaronDonald;
    }

    public static XYChart.Series<String, Integer> getTrevonDiggs() {
        XYChart.Series<String, Integer> trevonDiggs = new XYChart.Series<>();

        //SQL command to get info to populate bar chart
        String sql = "SELECT dpoydate, dpoyodds FROM dpoy WHERE dpoyplayer = 'Trevon Diggs';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                trevonDiggs.getData().add(new XYChart.Data<>(resultSet.getString("dpoydate"), resultSet.getInt("dpoyodds")));
                trevonDiggs.setName("Trevon Diggs");

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return trevonDiggs;
    }

    public static XYChart.Series<String, Integer> getNickBosa() {
        XYChart.Series<String, Integer> nickBosa = new XYChart.Series<>();

        //SQL command to get info to populate bar chart
        String sql = "SELECT dpoydate, dpoyodds FROM dpoy WHERE dpoyplayer = 'Nick Bosa';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                nickBosa.getData().add(new XYChart.Data<>(resultSet.getString("dpoydate"), resultSet.getInt("dpoyodds")));
                nickBosa.setName("Nick Bosa");

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return nickBosa;
    }

    public static XYChart.Series<String, Integer> getTJWatt() {
        XYChart.Series<String, Integer> tjWatt = new XYChart.Series<>();

        //SQL command to get info to populate bar chart
        String sql = "SELECT dpoydate, dpoyodds FROM dpoy WHERE dpoyplayer = 'T.J Watt';";

        //Establishing database connection
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                tjWatt.getData().add(new XYChart.Data<>(resultSet.getString("dpoydate"), resultSet.getInt("dpoyodds")));
                tjWatt.setName("T.J Watt");

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return tjWatt;
    }

    /**
     *
     * returns an array list that holds information for our mvp table view
     */
    public static ArrayList<MvpPlayer> getMvpPlayerData() {
        ArrayList<MvpPlayer> mvpPlayerData = new ArrayList<>();

        String sql = "SELECT mvpplayerId, mvpplayer, mvpodds, mvpdate FROM mvp;";

        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                Integer playerId = resultSet.getInt("mvpplayerId");
                String mvpPlayer = resultSet.getString("mvpplayer");
                Integer mvpOdds = resultSet.getInt("mvpodds");
                String mvpDate = resultSet.getString("mvpdate");
                MvpPlayer newMvpPlayer = new MvpPlayer(playerId, mvpPlayer, mvpOdds, mvpDate);

                mvpPlayerData.add(newMvpPlayer);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return mvpPlayerData;
    }

    public static ArrayList<DpoyPlayer> getDpoyPlayerData() {
        ArrayList<DpoyPlayer> dpoyPlayerData = new ArrayList<>();

        String sql = "SELECT dpoyplayerId, dpoyplayer, dpoyodds, dpoydate FROM dpoy;";

        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            while (resultSet.next()) {
                Integer playerId = resultSet.getInt("dpoyplayerId");
                String mvpPlayer = resultSet.getString("dpoyplayer");
                Integer mvpOdds = resultSet.getInt("dpoyodds");
                String mvpDate = resultSet.getString("dpoydate");
                DpoyPlayer newDpoyPlayer = new DpoyPlayer(playerId, mvpPlayer, mvpOdds, mvpDate);

                dpoyPlayerData.add(newDpoyPlayer);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return dpoyPlayerData;
    }

}
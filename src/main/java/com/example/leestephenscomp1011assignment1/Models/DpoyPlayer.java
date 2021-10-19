package com.example.leestephenscomp1011assignment1.Models;

public class DpoyPlayer {

    private int playerId;
    private String playerName;
    private int odds;
    private String date;

    public DpoyPlayer(int playerId, String playerName, int odds, String date) {
        setPlayerId(playerId);
        setPlayerName(playerName);
        setOdds(odds);
        setDate(date);
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;

    }

    public int getOdds() {
        return odds;
    }

    public void setOdds(int odds) {
        this.odds = odds;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {
        return "Name: " + playerName + " , DPOY Odds: " + odds + " , Date: " + date;
    }
}

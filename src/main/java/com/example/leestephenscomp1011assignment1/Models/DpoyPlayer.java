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
        if(playerId > 0) {
            this.playerId = playerId;
        }
        else {
            throw new IllegalArgumentException("Player Id must be greater than 0");
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        if(playerName.length() < 50) {
            this.playerName = playerName;
        }
        else {
            throw new IllegalArgumentException("Player name must be smaller than 50 letters");
        }

    }

    public int getOdds() {
        return odds;
    }

    public void setOdds(int odds) {
        if(odds < 100000 && odds > -10000) {
            this.odds = odds;
        }
        else {
            throw new IllegalArgumentException("Odds must be between 100000 -> -10000");
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if(date.length() < 11) {
            this.date = date;
        }
        else {
            throw new IllegalArgumentException("Date must be smaller than 11 characters and must be formatted yyyy-mm-dd");
        }

    }

    public String toString() {
        return "Name: " + playerName + " , DPOY Odds: " + odds + " , Date: " + date;
    }
}

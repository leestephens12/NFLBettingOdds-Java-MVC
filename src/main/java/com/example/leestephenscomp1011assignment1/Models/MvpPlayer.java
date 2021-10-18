package com.example.leestephenscomp1011assignment1.Models;

public class MvpPlayer {

    private int playerId;
    private String playerName;
    private int odds;
    private String date;

    public MvpPlayer(int playerId, String playerName, int odds, String date) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.odds = odds;
        this.date = date;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        if(playerId == 0) {
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
            throw new IllegalArgumentException("Player name cannot be longer than 50 letters");
        }
    }

    public int getOdds() {
        return odds;
    }

    public void setOdds(int odds) {
        if(odds > 10000 || odds < -1000) {
            this.odds = odds;
        }
        else {
            throw new IllegalArgumentException("Betting odds must be between +10000 - (-1000)");
        }

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if(date.length() < 10) {
            this.date = date;
        }
        else {
            throw new IllegalArgumentException("Date must be smaller than 10 letters and be in the form of yyyy-mm-dd");
        }
    }

    public String toString() {
        return "Name: " + playerName + " , MVP Odds: " + odds + " , Date: " + date;
    }
}

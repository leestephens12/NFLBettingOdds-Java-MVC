package com.example.leestephenscomp1011assignment1.Models;

public class MvpPlayer {

    private int playerId;
    private String playerName;
    private int odds;
    private String date;

    public MvpPlayer(int playerId, String playerName, int odds, String date) {
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
        this.odds = odds;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
            this.date = date;
    }

    public String toString() {
        return "Name: " + playerName + " , MVP Odds: " + odds + " , Date: " + date;
    }
}

package com.bi.entity;

public class Player {
    private final Integer playerID;
    private final String playerName;

    private String homeCity;
    private String originCity;
    private String destinationCity;

    private int totalMoney = 10000;
    private int currentPos;
    private double orderValue;

    public Player(int playerID, String playerName){
        this.playerID = playerID;
        this.playerName = playerName;
    }

    public void setHomeCity(String homeCity){
        this.homeCity = homeCity;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public String getPlayerName(){
        return playerName;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

     public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public int getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }

    public void takeTurn(){
        // prompt user stuff here and call back to game manager
    }
}

package com.bi.managers;

import com.bi.entity.Player;
import com.bi.entity.Stop;
import com.bi.util.CitySelectorUtil;
import com.bi.util.DiceUtil;

public class GameManager {

    public StopsManager sm = new StopsManager(this); 
    public RailroadManager rm = new RailroadManager(this);
    public EconomyManager em = new EconomyManager(this);

    private static float difficulty;

    private int turnIndex = 0;
    private boolean gameRunning = false;

    public static void setDifficulty(float diff){
        difficulty = diff;
    }

    public static float getDifficulty(){
        return difficulty;
    }

    public void determineOrder(){
        Player[] players = PlayersManager.getAllPlayers();
        int numPlayers = PlayersManager.getNumPlayers();

        for (Player player : players) {
            player.setOrderValue(DiceUtil.doubleDice());
            System.out.println(player.getPlayerName() + " rolled a " + player.getOrderValue() + "!");
             try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //yeah we got an n^2 selection sort over here but its only gonna be sorting like 6 entries at most so whatever
        for(int i = 0; i < numPlayers - 1 ; i++){
            int minIndex = i;
            for(int j = 0; j < numPlayers; j++){
                if(players[j].getOrderValue() < players[minIndex].getOrderValue()){
                   minIndex = j;
                }
            }
            Player temp = players[i];
            players[i] = players[i+1];
            players[i+1] = temp;
        }
    }

    public void assignHomeCity(Player player){
        player.setHomeCity(getNewCity());
    }

    // Setting the origin city to the current destination, given that this call occurs after the prev destination has been reached
    public void getNewDestination(Player player){
        player.setOriginCity(player.getDestinationCity());
        player.setDestinationCity(getNewCity());
    }

    // Probably need some more here that will change the state and allow the other players to change their routes to 
    // the declared player's home city. Need to look over the rules before I try to implement anything like that.
    public void declare(Player player){
        if(player.getTotalMoney() >= 100000){
            player.setOriginCity(player.getDestinationCity());
            player.setDestinationCity(player.getHomeCity());
        }
    }

    private String getNewCity(){
        boolean isEven = CitySelectorUtil.isEven(DiceUtil.singleDie());
        String region = CitySelectorUtil.getRegion(isEven, DiceUtil.doubleDice());
        String city = null;

        if(region != null){
            city = CitySelectorUtil.getCity(isEven, region, DiceUtil.doubleDice()); 
        }

        return city;
    }

    private void nextTurn(){
        if((turnIndex + 1) == PlayersManager.getNumPlayers()){
            turnIndex = 0;
        }else{
            turnIndex++;
        }
    }

    public void runGame(){

        determineOrder();
        gameRunning = true;

        Stop stop = StopsManager.getStop(71);

        for (int stopId : stop.getNextList()) {
            System.out.println(stopId);
        }

        System.out.println(stop.getNextList().size());
        
        while(gameRunning){
            PlayersManager.getAllPlayers()[turnIndex].takeTurn();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nextTurn();
        }
    }
}

package com.bi.managers;

import com.bi.entity.Player;
import com.bi.entity.CpuPlayer;

public class PlayersManager {
    
    private static Player[] players;
    private static Integer numPlayers = 0; 


    public static void addNewPlayer(String name, boolean isUser){
        if(players == null){
            players = new Player[numPlayers];
        }

        for(int i = 0; i < numPlayers; i ++){
            if(players[i] == null){
                Player player;
                if(isUser){
                   player = new Player(i, name);
                }else{
                    player = new CpuPlayer(i, name);
                }
                players[i] = player;
                break;
            }
        }
    }

    public static void generateCpuPlayers(){

    }

    public static void overwritePlayersArray(Player[] playersArray){
        players = playersArray;
    }

    public static Player[] getAllPlayers(){
        return players;
    }

    public static Player getPlayer(int id){
        Player returnPlayer = null;
        if(players.length != 0){
            for (Player player : players) {
                if(player.getPlayerID() == id){
                    returnPlayer = player;
                }
            }
        }

       return returnPlayer;
    }

    public static void setNumPlayers(Integer num){
        numPlayers = num;
    }

    public static Integer getNumPlayers(){
        return numPlayers;
    }
}

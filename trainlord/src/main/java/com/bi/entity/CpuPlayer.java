package com.bi.entity;

import com.bi.managers.GameManager;
import com.bi.managers.StopsManager;
import com.bi.util.DiceUtil;

public class CpuPlayer extends Player {
    private enum turnActionEnums{
        STANDARD_MOVE,
        FASTEST_MOVE,
        CHEAPEST_MOVE,
        MOVE_TO_DESTINATION, 
        DECLARE
    }

    private final float DIFF_ADDITION = GameManager.getDifficulty();

    public CpuPlayer(int playerID, String playerName) {
        super(playerID, playerName);
    }

    /*
    
    Some of this stuff may be handled by the game manager, 
    but I think that since this will be programmed it won't
    really matter outside of readability and maintenance.

    Also gotta do some kinda of articial 'processing' time here 
    just to help with the game feel.

        If I am a player I need to know:
        1. Before moving
            - Where am I on the board?
                - Can I make it to my destination during this turn?
                - Can I make it to my destination without using any unfriendly railroads?
            - Other players
                - Has anyone declared?
                - Is anyone close to declaring? 
            - Can I declare?
                - Do I have enougth money?
                - Am I close enough for it to make sense to declare?
                - Does the position of anyone else on the board prevent me from making it home safely?
        2. After moving
            - Do I want to purchase a railroad?
                - Do I have enough money?
                - How many railroads do other players have?
                - What is my purchasing stategy? (just had this idea, maybe some more aggressive/passive, buy a lot of short railroads or a few long ones, etc.)
                    - Do I want to buy as many railroads as possible, wracking up a bunch of cheaper ones?
                    - Do I want to focus on buying railroads close to where players currently are?
                    - Do I want to save up to purchase expensive railroads?
    */
 
    // Decision 
    // @Override
    // public void takeTurn(){
    //     int roll = DiceUtil.doubleDice();
    //     switch(preMove(roll)){
    //         case STANDARD_MOVE:
    //         break;
    //         case FASTEST_MOVE:
    //         break;
    //         case CHEAPEST_MOVE:
    //         break;
    //         case MOVE_TO_DESTINATION:
    //         break;
    //         case DECLARE:
    //         break;
    //     }

    // }

    /*
        1. Determine the efficiency index
        2. Build array of decisions by efficiency from most to least efficient option with assigned ranges
        3. Based on the efficiency index, select the option of the correct range.

        Doing this to add in an aspect of randomness, although the most efficient options should have the highest ranges
        so the computer doesn't act so random that it never makes sense.
    */

    // private turnActionEnums preMove(int roll) {
    //     double baseDecisionValue = Math.round(Math.random() * 100.0) / 100.0;
    //     double difficultyConsideredValue = DIFF_ADDITION + baseDecisionValue;
    //     double efficiencyIndex = difficultyConsideredValue * 100;

    //     turnActionEnums[] actionArray = new turnActionEnums[5];

    //     int currentPos = getCurrentPos();
    //     int destinationPos = StopsManager.getStopByCityName(getDestinationCity()).getId();

    //     boolean closeToDestination = (currentPos - getDistanceToDestination(currentPos, destinationPos) <= 0);

    //     if(closeToDestination && !opponentRailroadNeeded()){
    //         actionArray[0] = turnActionEnums.MOVE_TO_DESTINATION;
    //     }

        
        
    // }                

    private boolean decidePurchase(){
        return false;
    }

    // returns distance to destination if taking fastest possible route
    private int getDistanceToDestination(int currentPos, int destinationPos){
        return 0;
    }

    private boolean opponentRailroadNeeded(){
        return false;
    }
}
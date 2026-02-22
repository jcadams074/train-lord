package com.bi.main;
import com.bi.managers.StateManager;
import com.bi.managers.StateManager.ProgramState;

public class Main {

    static ProgramState lastState;
    static GameFrame gameFrame;
    
    public static void main(String[] args){

        StateManager.setStateMENU();
        lastState = StateManager.getState();
        gameFrame = new GameFrame();

        while(Thread.currentThread() != null){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            checkState();
        }
    }


    private static void checkState(){
        ProgramState currentState = StateManager.getState();

        if(currentState != lastState){
            lastState = currentState;

            switch (currentState) {
                case MENU:
                    gameFrame.showMenu();
                    break;
                case SETUP:
                    gameFrame.showSetup();
                    break;
                case GAME:
                    gameFrame.showGame();
                default:
                    break;
            }
        }
    }
}
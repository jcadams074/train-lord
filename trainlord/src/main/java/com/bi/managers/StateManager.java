package com.bi.managers;

public class StateManager {
    public enum ProgramState {
        MENU,
        SETUP,
        PREGAME,
        GAME
    }

    private static ProgramState state;

    //idk if we'll use this ever
    public static boolean validateState(ProgramState passedState){
        return state == passedState;
    }

    public static ProgramState getState() {
        return state;
    }

    public static void setStateMENU() {
        state = ProgramState.MENU;
    }

    public static void setStateSETUP() {
        state = ProgramState.SETUP;
    }

     public static void setStatePREGRAME() {
        state = ProgramState.PREGAME;
    }

     public static void setStateGAME() {
        state = ProgramState.GAME;
    }
}

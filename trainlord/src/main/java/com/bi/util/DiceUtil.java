package com.bi.util;

public class DiceUtil {
    
    public static Integer doubleDice(){
        int roll1 = singleDie();
        int roll2 = singleDie();

        return ( roll1 + roll2);
    }

    public static Integer singleDie(){
        return ((int) Math.floor((Math.random() * 6) + 1));
    }
}

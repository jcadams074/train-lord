package com.bi.entity;

public class Connection {
    private final int stop1;
    private final int stop2;

    public Connection(int stop1, int stop2){
        this.stop1 = stop1;
        this.stop2 = stop2;
    }

    public int getStop1() {
        return stop1;
    }

    public int getStop2() {
        return stop2;
    }
}

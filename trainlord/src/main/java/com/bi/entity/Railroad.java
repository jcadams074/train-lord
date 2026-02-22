package com.bi.entity;

public class Railroad{
    private final Connection[] connections;
    private final String name;
    private final String abbreviation;
    private final Integer id;
    private final int cost;
    private Integer owner;

    public Railroad(int id, String name,  String abbreviation, int cost, Connection[] connections){
        this.connections = connections; 
        this.cost = cost;
        this.abbreviation = abbreviation;
        this.name = name;
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public int getId(){
        return id;
    }

    public int getCost() {
        return cost;
    }

    public Connection[] getConnections() {
        return connections;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(int playerID) {
        this.owner = playerID;
    }

}

package com.bi.managers;

import com.bi.entity.Stop;
import com.bi.util.ChartSelectorUtil;

public class EconomyManager {

    RailroadManager rm;
    StopsManager sm;
    
    public EconomyManager(GameManager gm){
        this.rm = gm.rm;
        this.sm = gm.sm;
    }


    public double calculatePayoff(int originID, int destinationID){

        Stop origin = sm.getStop(originID);
        Stop destination = sm.getStop(destinationID);
        double basePayoff = 1000;

        if(origin == destination || notCities(origin, destination)){
            return 0;
        }

        return (basePayoff * ChartSelectorUtil.getPayoffMultiplier(origin.getCityName(), destination.getCityName()));

    }

    private boolean notCities(Stop city1, Stop city2){

        if(city1 != null && city2 != null){ 
            return (city1.isCity() && city2.isCity());
        }else{
            return false;
        }
    }
}
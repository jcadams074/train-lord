package com.bi.managers;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.bi.entity.Stop;
import com.bi.util.IntegerUtil;

public class StopsManager {
    GameManager gm;
    private static List<Stop> stops = new ArrayList<>();  
    
    public StopsManager(GameManager gm){
        this.gm = gm;
        loadStops("/texts/stops.txt");
    }

// This method loads in the stops from stops.txt file by converting each value to appropriate datatype and builing a Stop object.
// NOTE: I don't love it but the list of connected stops (i.e. the adjacency list) must be last in the list and formatted as "[num1-num2-...]" bc
// that's how I'm differentiating between that list of values and the other "single" values in the overall list. 
    private void loadStops(String filePath){
        try {
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int fileRows = Integer.parseInt(br.readLine());

            for(int i = 0; i < fileRows; i++){
                String line = br.readLine();

                String details[] = line.split(",");
                char nextChars[] = details[details.length - 1].toCharArray();
                List<Integer> nextInts = new LinkedList<>();

                int j = 1; 
                char c = nextChars[j]; 
                char[] num = new char[3];
                int l = 0;

                // some issue here where the last id in the next list is not being added to the object
                while(c != ']'){
                    if(c != '-'){
                        num[l++] = c; 
                    }else{
                        int processedNum = IntegerUtil.convertCharArrayToInt(num);
                        if(processedNum != -1){
                            nextInts.add(processedNum);
                        }
                        l=0;
                        Arrays.fill(num, '\u0000');
                    }
                    c = nextChars[++j];
                } 

                Stop stop = new Stop(
                Integer.parseInt(details[0]),
                Integer.parseInt(details[1]),
                Integer.parseInt(details[2]),
                Boolean.parseBoolean(details[3]), 
                details[4],
                nextInts);
                
                stops.add(stop);
            }
            br.close();

        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public void handleClick(Point p) {
        for (Stop stop : stops) {
            if (stop.getShape().contains(p)) {
               System.out.println(stop.getId());
                if(!stop.isSelected()){
                    stop.setSelected(true);
                }else{
                    stop.setSelected(false);
                }
            }
        }
    }

    public void draw(Graphics2D g2){
      for (Stop stop : stops) {
        stop.draw(g2);
        Graphics2D gline = (Graphics2D) g2;

        for (Integer integer : stop.getNextList()) {
            gline.setColor(Color.BLACK);
            int targetX = gm.sm.getStop(integer).getX();
            int targetY = gm.sm.getStop(integer).getY();
            gline.drawLine(stop.getX(), stop.getY(), targetX, targetY);
        }
      }
    }

    public static Stop getStopByCityName(String cityName){
        Stop returnStop = null;
        for (Stop stop : stops) {
            if(stop.getCityName() == cityName){
                returnStop = stop;
            }
        }
        return returnStop;
    }

    public List<Stop> getAllStops(){
        return stops;
    }

    public static Stop getStop(int stopID){
        Stop returnStop = null;
        if(stops.get(stopID) !=  null){
            returnStop = stops.get(stopID);
        }
        return returnStop;
    }

    public void setStopAsOccupied(int stopID){
        if(stops.get(stopID) !=  null){
            stops.get(stopID).setOccupied(true);
        }
    }

    public void setStopAsUnoccupied(int stopID){
        if(stops.get(stopID) !=  null){
            stops.get(stopID).setOccupied(false);
        }
    }

   
}

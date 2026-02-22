package com.bi.managers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.bi.entity.Connection;
import com.bi.entity.Railroad;
import com.bi.util.IntegerUtil;

public class RailroadManager {
    GameManager gm;

    HashMap<Integer,String> asciiMap = new HashMap<>(10);
    private Railroad[] railroads = new Railroad[28];  
    
    public RailroadManager(GameManager gm){
        this.gm = gm;
        loadRailroads("/texts/railroads.txt");
    }

    // This method loads in the railroads from railroads.txt file by converting each value to appropriate datatype and builing a Railroad object.
    // See note about loading Stops data. Same sentiment here.
    private void loadRailroads(String filePath){
        try {
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            int fileRows = 3;
            int rrPos = 0;

            for(int i = 0; i < fileRows; i++){
                String line = br.readLine();

                String[] details = line.split(",");
                char[] connectChars = details[details.length - 1].toCharArray();
                Connection[] connections = new Connection[100];
                int connectionPos = 0;

                for (int j = 1; j < connectChars.length - 1;) {

                    char[] num1 = new char[3];
                    char[] num2 = new char[3];
                    char[] activeArray = num1;

                    int l = 0;

                    while (j < connectChars.length && connectChars[j] != '|' && connectChars[j] != ']') {
                        char c = connectChars[j];

                        if (c == '-') {
                            activeArray = num2;
                            l = 0;
                        } else {
                            if (l < activeArray.length) {
                                activeArray[l++] = c;
                            }
                        }
                        j++;
                    }

                    int firstStop = IntegerUtil.convertCharArrayToInt(num1);
                    int secondStop = IntegerUtil.convertCharArrayToInt(num2);
                    Connection connection = null;

                    if (firstStop != -1 && secondStop != -1) {
                        connection = new Connection(firstStop, secondStop);
                    }

                    if(connection != null){
                        connections[connectionPos++] = connection;
                    }
                    j++;
                }
                railroads[rrPos++] = new Railroad(
                    Integer.parseInt(details[0]),
                    details[1],
                    details[2],
                    Integer.parseInt(details[3]),
                    connections
                );
            }
         } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public void assignRailroad(int railroadID, int playerID){ 
        for (Railroad railroad : railroads) {
            if(railroad.getId() == railroadID){
                railroad.setOwner(playerID);
            }
        }
    }

    public boolean checkRailroadAvailability(int railroadID){
        boolean available = true;
        if(railroads[railroadID].getOwner() != null){
            available = false;
        }
        return available;
    }

    public Integer checkRailroadOwner(int railroadID){
        Integer ownerId = null;
        if(railroads[railroadID].getOwner() != null){
            ownerId = railroads[railroadID].getOwner();;
        }
        return ownerId;
    }

    public Railroad[] getAllRailroads(){
        return railroads;
    }

    public Railroad getRailroad(int railroadID){
        return railroads[railroadID];
    }
}
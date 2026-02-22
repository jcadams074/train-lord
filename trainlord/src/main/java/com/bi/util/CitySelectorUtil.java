package com.bi.util;

import com.bi.constants.RegionConstants;
import com.bi.util.charts.DestinationCharts;
import com.bi.util.charts.DestinationCharts.KeyCombo;

public class CitySelectorUtil {

    public static boolean isEven(int roll){
        return (roll % 2 == 0);
    }

    public static String getRegion(boolean isEven, int roll){
        String region = null;

        if(isEven){
            switch (roll) {
                case 2:
                    region = RegionConstants.NORTH_CENTRAL;
                    break;
                case 3:
                    region = RegionConstants.PLAINS;
                    break;
                case 4:
                    region = RegionConstants.NORTH_CENTRAL;
                    break;
                case 5:
                    region = RegionConstants.SOUTH_EAST;
                    break;
                case 6:
                    region = RegionConstants.SOUTH_EAST;
                    break;
                case 7:
                    region = RegionConstants.PLAINS;
                    break;
                case 8:
                    region = RegionConstants.SOUTH_WEST;
                    break;
                case 9:
                    region = RegionConstants.NORTH_EAST;
                    break;
                case 10:
                    region = RegionConstants.NORTH_EAST;
                    break;
                case 11:
                    region = RegionConstants.NORTH_EAST;
                    break;
                case 12:
                    region = RegionConstants.NORTH_EAST;
                    break;
            }
        }else{
            switch (roll) {
                case 2:
                    region = RegionConstants.NORTH_CENTRAL;
                    break;
                case 3:
                    region = RegionConstants.NORTH_WEST;
                    break;
                case 4:
                    region = RegionConstants.NORTH_CENTRAL;
                    break;
                case 5:
                    region = RegionConstants.SOUTH_CENTAL;
                    break;
                case 6:
                    region = RegionConstants.SOUTH_CENTAL;
                    break;
                case 7:
                    region = RegionConstants.NORTH_WEST;
                    break;
                case 8:
                    region = RegionConstants.SOUTH_WEST;
                    break;
                case 9:
                    region = RegionConstants.NORTH_EAST;
                    break;
                case 10:
                    region = RegionConstants.NORTH_CENTRAL;
                    break;
                case 11:
                    region = RegionConstants.SOUTH_WEST;
                    break;
                case 12:
                    region = RegionConstants.NORTH_EAST;
                    break;
            }
        }        
        return region;
    }

    public static String getCity(boolean isEven, String region, Integer roll){
        String city;
        if(isEven){
            city = DestinationCharts.evenMap.get(new KeyCombo(region, roll));
        }else{
            city = DestinationCharts.oddMap.get(new KeyCombo(region, roll));
        }
        return city;
    }
}

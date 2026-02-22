package com.bi.util.charts;

import java.util.Map;

import com.bi.constants.CityConstants;
import com.bi.constants.RegionConstants;

public class DestinationCharts {
    public record KeyCombo(String key1, Integer key2){}
 
    public static Map<KeyCombo,String> evenMap = Map.ofEntries(
        //NORTHEAST
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 2), CityConstants.PITTSBURGH),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 3), CityConstants.PHILADELPHIA),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 4), CityConstants.WASHINGTON_DC),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 5), CityConstants.PORTLAND_ME),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 6), CityConstants.WASHINGTON_DC),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 7), CityConstants.PITTSBURGH),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 8), CityConstants.BOSTON),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 9), CityConstants.BOSTON),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 10), CityConstants.NEW_YORK),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 11), CityConstants.NEW_YORK),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 12), CityConstants.BOSTON),

        //SOUTHEAST
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 2), CityConstants.MOBILE),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 3), CityConstants.TAMPA),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 4), CityConstants.CHARLOTTE),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 5), CityConstants.CHARLESTON),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 6), CityConstants.MOBILE),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 7), CityConstants.KNOXVILLE),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 8), CityConstants.TAMPA),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 9), CityConstants.ATLANTA),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 10), CityConstants.ATLANTA),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 11), CityConstants.ATLANTA),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 12), CityConstants.ATLANTA),

        //NORTH CENTRAL
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 2), CityConstants.ST_LOUIS),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 3), CityConstants.CINCINNATI),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 4), CityConstants.CLEVELAND),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 5), CityConstants.ST_LOUIS),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 6), CityConstants.INDIANAPOLIS),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 7), CityConstants.CINCINNATI),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 8), CityConstants.DETROIT),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 9), CityConstants.CHICAGO),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 10), CityConstants.CHICAGO),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 11), CityConstants.CHICAGO),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 12), CityConstants.CHICAGO),

        //SOUTH CENTRAL
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 2), CityConstants.FORT_WORTH),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 3), CityConstants.LOUISVILLE),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 4), CityConstants.SHREVEPORT),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 5), CityConstants.LITTLE_ROCK),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 6), CityConstants.LOUISVILLE),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 7), CityConstants.SAN_ANTONIO),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 8), CityConstants.DALLAS),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 9), CityConstants.NEW_ORLEANS),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 10), CityConstants.DALLAS),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 11), CityConstants.HOUSTON),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 12), CityConstants.HOUSTON),

        //PLAINS
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 2), CityConstants.OMAHA),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 3), CityConstants.OKLAHOMA_CITY),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 4), CityConstants.FARGO),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 5), CityConstants.DENVER),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 6), CityConstants.PUEBLO),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 7), CityConstants.OKLAHOMA_CITY),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 8), CityConstants.MINNEAPOLIS_ST_PAUL),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 9), CityConstants.KANSAS_CITY),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 10), CityConstants.KANSAS_CITY),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 11), CityConstants.KANSAS_CITY),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 12), CityConstants.KANSAS_CITY),

        //NORTHWEST
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 2), CityConstants.SALT_LAKE_CITY),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 3), CityConstants.BILLINGS),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 4), CityConstants.BILLINGS),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 5), CityConstants.POCATELLO),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 6), CityConstants.SPOKANE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 7), CityConstants.PORTLAND_OR),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 8), CityConstants.PORTLAND_OR),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 9), CityConstants.SEATTLE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 10), CityConstants.SEATTLE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 11), CityConstants.SEATTLE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 12), CityConstants.PORTLAND_OR),

        //SOUTHWEST
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 2), CityConstants.SAN_DIEGO),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 3), CityConstants.LOS_ANGELES),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 4), CityConstants.TUCUMCARI),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 5), CityConstants.LOS_ANGELES),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 6), CityConstants.SACRAMENTO),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 7), CityConstants.SAN_DIEGO),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 8), CityConstants.LOS_ANGELES),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 9), CityConstants.SAN_FRANCISCO_OAKLAND),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 10), CityConstants.SAN_FRANCISCO_OAKLAND),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 11), CityConstants.SAN_FRANCISCO_OAKLAND),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 12), CityConstants.SAN_FRANCISCO_OAKLAND)
    );

    public static Map<KeyCombo,String> oddMap = Map.ofEntries(
        //NORTHEAST
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 2), CityConstants.BALTIMORE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 3), CityConstants.PHILADELPHIA),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 4), CityConstants.BALTIMORE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 5), CityConstants.ALBANY),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 6), CityConstants.BALTIMORE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 7), CityConstants.BUFFALO),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 8), CityConstants.PHILADELPHIA),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 9), CityConstants.NEW_YORK),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 10), CityConstants.NEW_YORK),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 11), CityConstants.NEW_YORK),
        Map.entry(new KeyCombo(RegionConstants.NORTH_EAST, 12), CityConstants.PHILADELPHIA),

        //SOUTHEAST
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 2), CityConstants.NORFOLK),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 3), CityConstants.NORFOLK),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 4), CityConstants.CHATTENOOGA),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 5), CityConstants.NORFOLK),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 6), CityConstants.RICHMOND),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 7), CityConstants.JACKSONVILLE),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 8), CityConstants.MIAMI),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 9), CityConstants.MIAMI),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 10), CityConstants.ATLANTA),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 11), CityConstants.ATLANTA),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_EAST, 12), CityConstants.MIAMI),

        //NORTH CENTRAL
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 2), CityConstants.CLEVELAND),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 3), CityConstants.MILWAUKEE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 4), CityConstants.CLEVELAND),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 5), CityConstants.ST_LOUIS),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 6), CityConstants.COLUMBUS),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 7), CityConstants.MILWAUKEE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 8), CityConstants.DETROIT),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 9), CityConstants.CHICAGO),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 10), CityConstants.CLEVELAND),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 11), CityConstants.CHICAGO),
        Map.entry(new KeyCombo(RegionConstants.NORTH_CENTRAL, 12), CityConstants.DETROIT),

        //SOUTH CENTRAL
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 2), CityConstants.NASHVILLE),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 3), CityConstants.NASHVILLE),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 4), CityConstants.MEMPHIS),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 5), CityConstants.MEMPHIS),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 6), CityConstants.FORT_WORTH),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 7), CityConstants.BIRMINGHAM),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 8), CityConstants.NEW_ORLEANS),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 9), CityConstants.NASHVILLE),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 10), CityConstants.HOUSTON),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 11), CityConstants.HOUSTON),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_CENTAL, 12), CityConstants.HOUSTON),

        //PLAINS
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 2), CityConstants.DENVER),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 3), CityConstants.MINNEAPOLIS_ST_PAUL),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 4), CityConstants.DENVER),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 5), CityConstants.DENVER),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 6), CityConstants.DES_MOINES),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 7), CityConstants.OMAHA),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 8), CityConstants.MINNEAPOLIS_ST_PAUL),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 9), CityConstants.KANSAS_CITY),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 10), CityConstants.KANSAS_CITY),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 11), CityConstants.MINNEAPOLIS_ST_PAUL),
        Map.entry(new KeyCombo(RegionConstants.PLAINS, 12), CityConstants.KANSAS_CITY),

        //NORTHWEST
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 2), CityConstants.SALT_LAKE_CITY),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 3), CityConstants.RAPID_CITY),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 4), CityConstants.RAPID_CITY),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 5), CityConstants.CASPER),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 6), CityConstants.BUTTE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 7), CityConstants.SALT_LAKE_CITY),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 8), CityConstants.PORTLAND_OR),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 9), CityConstants.SEATTLE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 10), CityConstants.SEATTLE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 11), CityConstants.SEATTLE),
        Map.entry(new KeyCombo(RegionConstants.NORTH_WEST, 12), CityConstants.SALT_LAKE_CITY),

        //SOUTHWEST
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 2), CityConstants.PHOENIX),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 3), CityConstants.PHOENIX),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 4), CityConstants.RENO),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 5), CityConstants.EL_PASO),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 6), CityConstants.PHOENIX),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 7), CityConstants.LAS_VEGAS),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 8), CityConstants.LOS_ANGELES),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 9), CityConstants.SAN_FRANCISCO_OAKLAND),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 10), CityConstants.SAN_FRANCISCO_OAKLAND),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 11), CityConstants.SAN_FRANCISCO_OAKLAND),
        Map.entry(new KeyCombo(RegionConstants.SOUTH_WEST, 12), CityConstants.LOS_ANGELES)
    );
}

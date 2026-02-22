package com.bi.util;

import java.util.HashMap;

public class IntegerUtil {

    private static HashMap<Integer,String> asciiMap = new HashMap<>(10);
    
    // Note: returns a true decimal value, not the ascii value of the character as an integer
    public static int convertCharArrayToInt(char[] charArray){
        for(Integer i = 0; i < 10; i++){
            asciiMap.put(i + 48,i.toString());
        }
        String val = "";
    
        for(int i = 0; i < charArray.length; i++){
            int asciiVal = charArray[i];
            if(asciiVal != 32 && asciiVal != 0){
                val += asciiMap.get(asciiVal); 
            } 
        }
        if(val != ""){
            return Integer.parseInt(val);
        }else{
            return -1;
        }
    }
}
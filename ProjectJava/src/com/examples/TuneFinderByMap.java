package com.examples;

import com.exceptions.NotAValidTuneNumber;
import com.exceptions.NotEvenANumber;

import java.util.HashMap;
import java.util.Map;

public class TuneFinderByMap {

    Map<Integer,String> tuneMap = new HashMap<Integer, String>();

    public TuneFinderByMap(){

        tuneMap.put(new Integer(1),new String("Sa"));
        tuneMap.put(new Integer(2),new String("Ri"));
        tuneMap.put(new Integer(3),new String("Ga"));
        tuneMap.put(new Integer(4),new String("Ma"));
        tuneMap.put(new Integer(5),new String("Pa"));
        tuneMap.put(new Integer(6),new String("Da"));
        tuneMap.put(new Integer(7),new String("Ni"));
        tuneMap.put(new Integer(8),new String("Saa"));

    }

    public String findTune(String tuneNumber) throws NotAValidTuneNumber, NotEvenANumber {

        String tuneName = null;
        int intTuneNumber = 0;

        try{
            intTuneNumber = Integer.parseInt(tuneNumber);
        }catch (NumberFormatException aExp){
            throw new NotEvenANumber();
        }

        if(intTuneNumber<1 || intTuneNumber>8){
            throw new NotAValidTuneNumber();
        }
        tuneName = tuneMap.get(new Integer(intTuneNumber));
        return tuneName;
    }
}

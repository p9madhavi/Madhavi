package com.examples;

import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;

import java.util.HashMap;
import java.util.Map;

public class MonthFinderByMap {

    Map<Integer,String> monthMap = new HashMap<Integer, String>();

    public MonthFinderByMap(){

        monthMap.put(new Integer(1),new String("January"));
        monthMap.put(new Integer(2),new String("February"));
        monthMap.put(new Integer(3),new String("March"));
        monthMap.put(new Integer(4),new String("April"));
        monthMap.put(new Integer(5),new String("May"));
        monthMap.put(new Integer(6),new String("June"));
        monthMap.put(new Integer(7),new String("July"));
        monthMap.put(new Integer(8),new String("August"));
        monthMap.put(new Integer(9),new String("September"));
        monthMap.put(new Integer(10),new String("October"));
        monthMap.put(new Integer(11),new String("November"));
        monthMap.put(new Integer(12),new String("December"));
    }

    public String findMonth(String monthNumber) throws NotAValidMonthNumber, NotEvenANumber {

        String monthName = null;
        int intMonthNumber = 0;

        try{
            intMonthNumber = Integer.parseInt(monthNumber);
        }catch (NumberFormatException aExp){
            throw new NotEvenANumber();
        }

        if(intMonthNumber<1 || intMonthNumber>12){
            throw new NotAValidMonthNumber();
        }
        monthName = monthMap.get(new Integer(intMonthNumber));
        return monthName;
    }
}

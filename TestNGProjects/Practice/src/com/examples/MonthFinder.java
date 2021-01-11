package com.examples;

import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;

public class MonthFinder {

    public String findMonth(String monthNumber) throws NotAValidMonthNumber, NotEvenANumber {

        String monthName = null;
        int intMonthNumber =0;

        try{
             intMonthNumber = Integer.parseInt(monthNumber);
        }catch (NumberFormatException aExp){

            throw new NotEvenANumber();
        }

        if(intMonthNumber <1 || intMonthNumber >12){
            throw new NotAValidMonthNumber();
        }
        switch (intMonthNumber){
            case 1:
                monthName ="January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName ="March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName ="May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName ="July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName ="September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName ="November";
                break;
            case 12:
                monthName = "December";
                break;

       }
        return monthName;

    }
}

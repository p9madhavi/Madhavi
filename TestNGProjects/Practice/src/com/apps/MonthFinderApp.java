package com.apps;

import com.examples.MonthFinder;
import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;

public class MonthFinderApp {

    public static void main(String[] args) {

        MonthFinder aMonthFinder = new MonthFinder();
        String monthName = null;

        try{
           monthName= aMonthFinder.findMonth("10");
            System.out.println("The monthName is " + monthName);
        }catch (NotAValidMonthNumber aexp){
            System.out.println("The monthNumber you entered is an invalid monthNumber");
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }

        try{
            monthName= aMonthFinder.findMonth("3");
            System.out.println("The monthName is " + monthName);
        }catch (NotAValidMonthNumber aexp){
            System.out.println("The monthNumber you entered is an invalid monthNumber");
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }

        try{
            monthName= aMonthFinder.findMonth("-3");
            System.out.println("The monthName is " + monthName);
        }catch (NotAValidMonthNumber aexp){
            System.out.println("The monthNumber you entered is an invalid monthNumber");
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }

        try{
            monthName= aMonthFinder.findMonth("110");
            System.out.println("The monthName is " + monthName);
        }catch (NotAValidMonthNumber aexp){
            System.out.println("The monthNumber you entered is an invalid monthNumber");
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }

        try{
            monthName= aMonthFinder.findMonth("AutoTools");
            System.out.println("The monthName is " + monthName);
        }catch (NotAValidMonthNumber aexp){
            System.out.println("The monthNumber you entered is an invalid monthNumber");
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }


    }
}

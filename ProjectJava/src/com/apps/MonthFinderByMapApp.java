package com.apps;

import com.examples.MonthFinderByMap;
import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;

public class MonthFinderByMapApp {
    public static void main(String[] args) {

        MonthFinderByMap aMonthFinder = new MonthFinderByMap();
        String monthName=null;

        try{
            monthName = aMonthFinder.findMonth("5");
            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        try{
            monthName = aMonthFinder.findMonth("10");
            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        try{
            monthName = aMonthFinder.findMonth("HashMap");
            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        try{
            monthName = aMonthFinder.findMonth("-4");
            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        try{
            monthName = aMonthFinder.findMonth("19");
            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }


    }
}

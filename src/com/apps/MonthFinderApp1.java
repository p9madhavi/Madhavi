package com.apps;

import com.examples.MonthFinder1;

import com.exceptions.NotAValidMonthNumber;

public class MonthFinderApp1{

  public static void main(String[] args) {

  	MonthFinder1 aMonthFinder = new MonthFinder1();

    try{


	  	String monthName = aMonthFinder.findMonth(5);

	  	System.out.println(monthName);

	    monthName = aMonthFinder.findMonth(20);

	    System.out.println(monthName);

	}catch(NotAValidMonthNumber aExceptionReference){
       
       System.out.println("You entered an invalid monthnumber");
       aMonthFinder = new MonthFinder1();
	}
  	
  }

}
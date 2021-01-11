package com.apps;

import com.examples.MonthFinder2;
import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;

public class MonthFinderApp2{

  public static void main(String[] args) {

  	MonthFinder2 aMonthFinder = new MonthFinder2();
    String monthName;
    

    try{
	    monthName = aMonthFinder.findMonth("5");
	  	System.out.println(monthName);
    }catch(NotAValidMonthNumber aExceptionReference){
       System.out.println("You entered an invalid monthnumber");  
    }catch(NotEvenANumber aExceptionReference){
       System.out.println("The Number you entered is not even a monthnumber");
    }         

    try{
	    monthName = aMonthFinder.findMonth("20");
	    System.out.println(monthName);
    }catch(NotAValidMonthNumber aExceptionReference){
       System.out.println("You entered an invalid monthnumber");  
    }catch(NotEvenANumber aExceptionReference){
       System.out.println("The Number you entered is not even a monthnumber");
    }         

    try{
      monthName = aMonthFinder.findMonth("SomeRandomString");
      System.out.println(monthName);
	  }catch(NotAValidMonthNumber aExceptionReference){
       System.out.println("You entered an invalid monthnumber");  
	  }catch(NotEvenANumber aExceptionReference){
       System.out.println("The Number you entered is not even a mothnumber");
    } 	
  }

}
package com.examples;

import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotAValidMonthName;


public class MonthFinder{

    // Write A Method by the name findMonth which takes a int and returns a String;

    // The integer argument passed is the monthNumber, and the method return String should be the equivalent monthName;

    public String findMonth(int monthNumber) throws NotAValidMonthNumber{

    	String monthName= null;

    	if(monthNumber<1 || monthNumber>12 ){
    		// monthName =null;
            throw new NotAValidMonthNumber();
    	}
    	switch(monthNumber){

    		case 1:
    		   	monthName = "January";
    		   break;
    		case 2:
    			monthName ="February";
    			break;
    		case 3:
    			monthName ="March";
    			break;
    		case 4:
    			monthName ="April";
    			break;
    		case 5:
    		   	monthName = "May";
    		   break;
    		case 6:
    			monthName ="June";
    			break;
    		case 7:
    			monthName ="July";
    			break;
    		case 8:
    			monthName ="August";
    			break;
    		case 9:
    		   	monthName = "September";
    		   break;
    		case 10:
    			monthName ="October";
    			break;
    		case 11:
    			monthName ="November";
    			break;
    		case 12:
    			monthName ="December";
    			break;              
    	}

    	return monthName;
    }

    public String findSeasonBySwitch(String monthName) throws NotAValidMonthName{

    	// System.out.println("The monthName in findSeasonBySwitch method is::"+ monthName);

    	String season = null;

    	// System.out.println("The Value Of Season in findSeasonBySwitch method is :"+ season);

    	if( monthName != "January" && monthName != "February" && monthName != "March" &&
    			monthName != "April" && monthName != "May" && monthName != "June" &&
    			monthName != "July" && monthName != "August" && monthName != "September" &&
    			monthName != "October" && monthName != "November" && monthName != "December" ){

    		// System.out.println("Inside the If block about to change the season" + season);
		
    		// season ="Invalid monthName";

            throw new NotAValidMonthName();
    	}

    		// System.out.println("Outside the If block  the season value is " + season);
		

    	switch(monthName){

    		case "February" :
    		    season = "Spring";
    		    break;
    		case "March"    :
    		     season ="Spring";
    		     break;
    		case "April" :
    		    season = "Spring";
    		    break;
    		case "May"    :
    		     season ="Summer";
    		     break;
    		case "June" :
    		    season = "Summer";
    		    break;
    		case "July"    :
    		     season ="Summer";
    		     break;
    		case "August" :
    		    season = "Fall";
    		    break;
    		case "September"    :
    		     season ="Fall";
    		     break;
    		case "October" :
    		    season = "Fall";
    		    break;
    		case "November"    :
    		     season ="Winter";
    		     break;
    		case "December" :
    		    season = "Winter";
    		    break;
    		case "January"    :
    		     season ="Winter";
    		     break;

    	}
    	 return season;
    }



    public String findSeasonByIf(String monthName) throws NotAValidMonthName {

    	String season = null;

    	if( monthName != "January" && monthName != "February" && monthName != "March" &&
                monthName != "April" && monthName != "May" && monthName != "June" &&
                monthName != "July" && monthName != "August" && monthName != "September" &&
                monthName != "October" && monthName != "November" && monthName != "December" ){

            throw new NotAValidMonthName();



    		// season ="Not a Valid monthName";
    	}

    	else {

    		if(monthName=="February"|| monthName=="March"||monthName=="April"){
    			season ="Spring";

    		}else if(monthName=="May"|| monthName=="June"||monthName=="July"){
    			season="Summer";

    		}else if(monthName=="August"|| monthName=="September"||monthName=="October"){

    			season="Fall";

    		}else {

    			season="winter";
    		}

       	}

       	 return season;

    }


}
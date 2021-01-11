package com.apps;

import com.examples.MonthFinder;
import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotAValidMonthName;


public class MonthFinderApp{

	public static void main(String[] args) {
		

		MonthFinder aMonthFinder = new MonthFinder();

		
		// int monthNumber=5;
		// String monthName=aMonthFinder.findMonth(monthNumber);
		// if(monthName != null)
		// 	System.out.println("The MonthName Of "+ monthNumber  + "  Is ::" + monthName);
		// else
		// 	// System.out.println("You have entered "+ monthNumber  + "  which is  incorrect number");
		// 	System.out.println("The month number "+ monthNumber  + "  you entered is invalid");

	
  //       monthNumber = 11;
		// monthName = aMonthFinder.findMonth(monthNumber);
		// if(monthName != null)
		// 	System.out.println("The MonthName Of "+ monthNumber  + "  Is ::" + monthName);
		// else
		// 	// System.out.println("You have entered "+ monthNumber  + "  which is  incorrect number");
		// System.out.println("The month number "+ monthNumber  + "  you entered is invalid");
		

  //       monthNumber = 18;
		// monthName = aMonthFinder.findMonth(monthNumber);
		// if(monthName != null)
		// 	System.out.println("The MonthName Of "+ monthNumber  + "  Is ::" + monthName);
		// else
		// 	// System.out.println("You have entered "+ monthNumber  + "  which is  incorrect number");
		// 	System.out.println("The month number "+ monthNumber  + "  you entered is invalid");

   //       monthNumber = -1; 
		// monthName = aMonthFinder.findMonth(monthNumber);
		// System.out.println("The MonthName Of "+ monthNumber  + "  Is ::" + monthName);


		try{
			String monthName = aMonthFinder.findMonth(5);
			System.out.println("The MonthName Is ::" + monthName);

		}catch (NotAValidMonthNumber aexp) {

		    System.out.println("you entered an invalid monthNumber;");		
		}

		try{
			String monthName = aMonthFinder.findMonth(18);
			System.out.println("The MonthName Is ::" + monthName);

		}catch (NotAValidMonthNumber aexp) {

		    System.out.println("you entered an invalid monthNumber;");		
		}

		try{
			String monthName = aMonthFinder.findMonth(-4);
			System.out.println("The MonthName Of Is ::" + monthName);

		}catch (NotAValidMonthNumber aexp) {

		    System.out.println("you entered an invalid monthNumber;");		
		}






		
		// monthName = "March";
		// String season = aMonthFinder.findSeasonBySwitch(monthName);
		// System.out.println("The season for the " + monthName + " Is::" + season);

		//  monthName = "August";
		// season = aMonthFinder.findSeasonBySwitch(monthName);
		// System.out.println("The season for the " + monthName + " Is::" + season);

		// monthName = "January";
		// season = aMonthFinder.findSeasonBySwitch(monthName);
		// System.out.println("The season for the " + monthName + " Is::" + season);

		// monthName = "May";
		// season = aMonthFinder.findSeasonBySwitch(monthName);
		// System.out.println("The season for the " + monthName + " Is::" + season);


		// monthName = "Something";
		// // System.out.println("The Value In monthName:"+monthName);
		// season = aMonthFinder.findSeasonBySwitch(monthName);
		// System.out.println("The season for the " + monthName + " Is::" + season);

		try{
			String season = aMonthFinder.findSeasonBySwitch("March");
			 System.out.println("The season  Is::" + season);

		}catch (NotAValidMonthName aexp) {

		    System.out.println("you entered an invalid monthName");		
		}
		try{
			String season = aMonthFinder.findSeasonBySwitch("May");
			 System.out.println("The season  Is::" + season);

		}catch (NotAValidMonthName aexp) {

		    System.out.println("you entered an invalid monthName");		
		}
		try{
			String season = aMonthFinder.findSeasonBySwitch("October");
			 System.out.println("The season  Is::" + season);

		}catch (NotAValidMonthName aexp) {

		    System.out.println("you entered an invalid monthName");		
		}
		try{
			String season = aMonthFinder.findSeasonBySwitch("January");
			 System.out.println("The season  Is::" + season);

		}catch (NotAValidMonthName aexp) {

		    System.out.println("you entered an invalid monthName");		
		}
		try{
			String season = aMonthFinder.findSeasonBySwitch("SomeString");
			 System.out.println("The season  Is::" + season);

		}catch (NotAValidMonthName aexp) {

		    System.out.println("you entered an invalid monthName");		
		}














  //       String monthName = "March";
		// String season = aMonthFinder.findSeasonByIf(monthName);
		// System.out.println("The season for the " + monthName + " Is::" + season);

		//  monthName = "August";
		// season = aMonthFinder.findSeasonByIf(monthName);
		// System.out.println("The season for the " + monthName + " Is::" + season);

		// monthName = "January";
		// season = aMonthFinder.findSeasonByIf(monthName);
		// System.out.println("The season for the " + monthName + " Is::" + season);

		// monthName = "May";
		// season = aMonthFinder.findSeasonByIf(monthName);
		// System.out.println("The season for the " + monthName + " Is::" + season);


		// monthName = "Something";
		// season = aMonthFinder.findSeasonByIf(monthName);
		// System.out.println("The season for the " + monthName + " Is::" + season);

		try{
			String season = aMonthFinder.findSeasonByIf("March");
			 System.out.println("The season  Is::" + season);

		}catch (NotAValidMonthName aexp) {

		    System.out.println("you entered an invalid monthName");		
		}
		try{
			String season = aMonthFinder.findSeasonByIf("May");
			 System.out.println("The season  Is::" + season);

		}catch (NotAValidMonthName aexp) {

		    System.out.println("you entered an invalid monthName");		
		}
		try{
			String season = aMonthFinder.findSeasonByIf("October");
			 System.out.println("The season  Is::" + season);

		}catch (NotAValidMonthName aexp) {

		    System.out.println("you entered an invalid monthName");		
		}
		try{
			String season = aMonthFinder.findSeasonByIf("January");
			 System.out.println("The season  Is::" + season);

		}catch (NotAValidMonthName aexp) {

		    System.out.println("you entered an invalid monthName");		
		}
		try{
			String season = aMonthFinder.findSeasonByIf("SomeString");
			 System.out.println("The season  Is::" + season);

		}catch (NotAValidMonthName aexp) {

		    System.out.println("you entered an invalid monthName");		
		}

    }
}
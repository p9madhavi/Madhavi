package com.examples;

public class MonthFinder{



	String[] months ={"January","February","March"};
	

	public String findMonth(int monthNumber){

		String monthName = null;


	if(monthNumber<1 || monthNumber>3){

		System.out.println("The monthNumber You Entered Is Invalid");

	}

	switch(monthNumber){
		case 1: monthName = months[0];
		break;
		case 2: monthName = months[1];
		break;
		case 3: monthName = months[2];
		break;
	}
	return monthName;
}
}
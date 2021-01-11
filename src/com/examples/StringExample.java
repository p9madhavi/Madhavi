package com.examples;

public class StringExample{

	/**
	This method will give  you the character at position in the given string
	
	*/

	public void printCharacterAtLocation(String aString, int index){

		char theChar = aString.charAt(index);

		System.out.println(" The character at index: " + index +"in the string: "+aString+"is : "+theChar);


	}



public void compareTwoStrings(String firstString, String secondString )	{

	if(firstString.compareTo(secondString)==0){
		System.out.println("The Strings are equal");
       }
	else{
		System.out.println("The Strings are NOT equal");
	    }	
	
	}

}



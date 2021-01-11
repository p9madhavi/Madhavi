package com.examples;

public class ArrayExample{

	String[] anArrayOfString = new String[10];

	int[] anArrayOfInteger = new int[30];

	public void showValues(){

		anArrayOfString[0] = "first String";
		anArrayOfString[1] = "second String";
		anArrayOfString[2] = "third String";
		anArrayOfString[3] = "fourth String";
		anArrayOfString[4] = "fifth String";
		anArrayOfString[5] = "sixth String";
		anArrayOfString[6] = "seventh String";
		anArrayOfString[7] = "eighth String";
		anArrayOfString[8] = "ninth String";
		anArrayOfString[9] = "tenth String";

		  for(int i=0 ; i< anArrayOfString.length; i++){

			  System.out.println("The" + (i+1) +"th string is:::"+ anArrayOfString[i]);

			}

			for(int i=0 ; i< anArrayOfInteger.length;i++){

				anArrayOfInteger[i] = i*20;

			}



		  for(int i=0; i<anArrayOfInteger.length;i++){

		  	   System.out.println("The "+ (i+1) + "th String is---------" + anArrayOfInteger[i]);
		  	}	




	}
}
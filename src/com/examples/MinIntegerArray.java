package com.examples;

public class MinIntegerArray{

	int anArrayOfInteger [] = new int [10];

	int min = anArrayOfInteger[0];

	public void findMinInteger(){

		//System.out.println("The Value Of min is:"+ min);

		//System.out.println("The Value of anArrayOfInteger[0] is"+ anArrayOfInteger[0]);
		//System.out.println("The Size Of Array:"+ anArrayOfInteger.length);

		int anArrayOfInteger [] = {399, 23, 58,15,9,112,57,6,89,3};

		min = anArrayOfInteger[0];

		//System.out.println("The Value of anArrayOfInteger[0] is"+ anArrayOfInteger[0]);
		//System.out.println("The Value Of min is:"+ min);

		//System.out.println("The Size Of Array:"+ anArrayOfInteger.length);


		for(int i=1;i<anArrayOfInteger.length;i++){

			  System.out.println("Inside For loop The Value of anArrayOfInteger[i] is"+ anArrayOfInteger[i]);
		      System.out.println("Inside For loop The Value Of min is:"+ min + " Value Of i is :" +i);


			    
			    	if(min > anArrayOfInteger[i]){

			    		min = anArrayOfInteger[i];
			    }

		}

		System.out.println(" the min integer is---------"+ min);
    }
}

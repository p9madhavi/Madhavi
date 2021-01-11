package com.examples;

public class ArrayExample{

	int [] intArray = {45, 78, -24, -93, 156, 212, 38};

	public void demoArray(){

		// standard method of creating object
		String firstString = new String("javaTraining");
		// special method
		String secondString = "sivaReddy";

		// declare the variable and initialization seperately
		String [] aStringArray = new String[2];
		aStringArray[0] = "javaTraining";
		aStringArray[1] = "sivareddy";

		// decalre and intialize at the same time
		String [] secondArray = {"javatraining","sivareddy","classes","methods","wrapperClasses","objects"};

		System.out.println("The value in first String of array: "+aStringArray[0]);
		System.out.println("The value in first String of array: "+aStringArray[1]);

		for(int counter=0; counter<secondArray.length; counter++){
			System.out.println("The value in first String of array: "+secondArray[counter]);
		}

	}

	/**
	* this method takes a number that will be searched in the array
	* if found will return the index where the number is there
	* otherwise it will throw the NotFoundException
	*/
	public int findNumber(int numberTobeFound) throws NotFoundException{

	}

	public int findMax(){

	}

	public int findMin(){

	}
}
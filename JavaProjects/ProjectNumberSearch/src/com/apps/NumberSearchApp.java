package com.apps;
import com.examples.NumberSearch;
import com.exceptions.NotFound;


public class NumberSearchApp {

	public static void main(String[] args) {
		
		NumberSearch aSearchNumber = new NumberSearch();

		int passed =0;
		int failed =0;
		int expectedIndex=0;


		int numberTobeFound = 156;
		int index =-1;
		try{
			index = aSearchNumber.findNumber(156);
//			System.out.println("The number: "+numberTobeFound+" is at index: "+index+" in the int array");
		}catch(NotFound aExp){
            System.out.println("The number you requested is not found in the given array.");
		}
		expectedIndex = 4;
		if(index == expectedIndex){
			System.out.println("Test for 4th index is passed::: Passed ");
			passed++;
		}else{
			System.out.println("Test for 4th index is failed::: Failed ");
		    failed++;
		}

		numberTobeFound =45;
		try{
			index = aSearchNumber.findNumber(45);
//			System.out.println("The number: "+numberTobeFound+" is at index: "+index+" in the int array");
		}catch (NotFound aExp){
			System.out.println("The number you requested is not found in the given array");
		}
		expectedIndex = 0;
		if(index == expectedIndex){
			System.out.println("Test for 0th index is passed::: Passed ");
			passed++;
		}else{
			System.out.println("Test for 0th index is failed::: Failed ");
			failed++;
		}

		numberTobeFound =211;
         String output = null;
		try{
			index = aSearchNumber.findNumber(211);
			System.out.println("The number: "+numberTobeFound+" is at index: "+index+" in the int array");
		}catch (NotFound aExp){
//			System.out.println("The number you requested is not found in the given array");
			output = "InvalidIndex";
		}
		String expectedOutput = "InvalidIndex";
		if(output.equals(expectedOutput)){
			System.out.println("Test for the number 211 passed::: Passed ");
			passed++;
		}else{
			System.out.println("Test for the number 211 failed::: Failed ");
			failed++;
		}


		numberTobeFound =-23;
		output = null;
		try{
			index = aSearchNumber.findNumber(-23);
			System.out.println("The number: "+numberTobeFound+" is at index: "+index+" in the int array");
		}catch (NotFound aExp){
//			System.out.println("The number you requested is not found in the given array");
			output = "InvalidIndex";
		}
		expectedOutput = "InvalidIndex";
		if(output.equals(expectedOutput)){
			System.out.println("Test for the number -23 passed::: Passed ");
			passed++;
		}else{
			System.out.println("Test for the number -23 failed::: Failed ");
			failed++;
		}
//		TestCases for maxNumber
		int maxNumber = aSearchNumber.findMax();
//		System.out.println("The Maximum Number In the Array :::" + maxNumber);
		int expectedMaxNumber = 21289;
		if(maxNumber == expectedMaxNumber){
			System.out.println("Test for the maxNumber passed::: Passed ");
			passed++;
		}else{
			System.out.println("Test for the maxNumber failed::: Failed ");
			failed++;
		}

//       TestCases for minNumber
		int minNumber = aSearchNumber.findMin();
//		System.out.println("The Minimum Number In the Arrry:::" + minNumber);
		int expectedminNumber = -156;
		if(minNumber == expectedminNumber){
			System.out.println("Test for the minNumber passed::: Passed ");
			passed++;
		}else{
			System.out.println("Test for the minNumber failed::: Failed ");
			failed++;
		}

		System.out.println("::::  T E S T    R E P O R T   F O R   N U M B E R S E A R C H   ::::::");
		System.out.println("Total passed: "+passed);
		System.out.println("Total failed: "+failed);
		System.out.println("Total testcases for NumberSearch : "+(passed+failed));
	}
}

//    number is there in the array
//  number is there at the first position
// number is there in the last position
// number not found inside the min and max number
// number not found less than min number
// number not found greater than max number
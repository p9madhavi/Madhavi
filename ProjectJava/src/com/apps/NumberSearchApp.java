package com.apps;
import com.examples.NumberSearch;
import com.exceptions.NotFound;


public class NumberSearchApp{

	public static void main(String[] args) {
		
		NumberSearch aSearchNumber = new NumberSearch();

		// int returnMaxNumber = aSearchNumber.findMax();
		// System.out.println("The Maximum Number In the Array :::" + returnMaxNumber);

		// int returnMinNumber = aSearchNumber.findMin();
		// System.out.println("The Minimum Number In the Arrry:::" + returnMinNumber);
		int numberTobeFound = 156;
		int index =-1;
		try{
			index = aSearchNumber.findNumber(156);
			System.out.println("The number: "+numberTobeFound+" is at index: "+index+" in the int array");
		}catch(NotFound aExp){
            System.out.println("The number you requested is not found in the given array.");
		}

		numberTobeFound =211;

		try{
			index = aSearchNumber.findNumber(211);
			System.out.println("The number: "+numberTobeFound+" is at index: "+index+" in the int array");
		}catch (NotFound aExp){
			System.out.println("The number you requested is not found in the given array");
		}
		numberTobeFound =-23;
		try{
			index = aSearchNumber.findNumber(-23);
			System.out.println("The number: "+numberTobeFound+" is at index: "+index+" in the int array");
		}catch (NotFound aExp){
			System.out.println("The number you requested is not found in the given array");
		}
		numberTobeFound =45;
		try{
			index = aSearchNumber.findNumber(45);
			System.out.println("The number: "+numberTobeFound+" is at index: "+index+" in the int array");
		}catch (NotFound aExp){
			System.out.println("The number you requested is not found in the given array");
		}
	}
}

//    number is there in the array
//  number is there at the first position
// number is there in the last position
// number not found inside the min and max number
// number not found less than min number
// number not found greater than max number
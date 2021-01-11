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

		try{
			int numberToBeReturned = aSearchNumber.findNumber(156);
		}catch(NotFound aExp){
            System.out.println("The Number You Requested Is NotFound in the GivenArray....");
		}


	}
}
package com.examples;

import com.exceptions.NotFound;

public class NumberSearch {

	int [] intArray = {45, 78, -24, -93, 156, 212, 38};

	public int findNumber(int numberTobeFound) throws NotFound {

		int index=-1;

	 	for(int counter=0;counter<intArray.length;counter++){

			if(intArray[counter] == numberTobeFound){
				index = counter;
				break;
			}
	 	}
	 	if(index == -1)
	 		throw new NotFound();

	 	return index;
	}


	 public int findMax(){

	 	int [] intArray = {45, 78, -24, -93, 156, 21289, 38};

	  	int maxNumber = intArray[0];

	  	for(int counter=1;counter<intArray.length;counter++){

	  		if(intArray[counter]>maxNumber){
	  			maxNumber=intArray[counter];
	  		}

  		}

  		return maxNumber;
 		
	 }

	 public int findMin(){

	 	int [] intArray = {45, 78, -24, -93, -156, 21289, 38};

	  	int minNumber = intArray[0];

	  	for(int counter=1;counter<intArray.length;counter++){

	  		if(intArray[counter]<minNumber){
	  			minNumber=intArray[counter];
	  		}

  		}

  		return minNumber;
 		
	 }

}
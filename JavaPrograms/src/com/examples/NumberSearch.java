package com.examples;
import com.exceptions.NotFound;

public class NumberSearch{

	 public int findNumber(int numberTobeFound) throws NotFound{

	 	int [] intArray = {45, 78, -24, -93, 156, 212, 38};

	 	int numberToBeReturned;


	 	for(int counter=0;counter<intArray.length;counter++){

	 		
	 			if(intArray[counter] == numberTobeFound){

	 				numberToBeReturned = intArray[counter];
	 			}else{
	 				 		
	 			throw new NotFound();
	 			}
			 	 		
	 	}

	 	return numberToBeReturned;

	}


	// public int findMax(){

	// 	int [] intArray = {45, 78, -24, -93, 156, 21289, 38};

	//  	int maxNumber = intArray[0];

	//  	for(int counter=1;counter<intArray.length;counter++){

	//  		if(intArray[counter]>maxNumber){
	//  			maxNumber=intArray[counter];
	//  		}

 // 		}

 // 		return maxNumber;
 		
	// }

	// public int findMin(){

	// 	int [] intArray = {45, 78, -24, -93, -156, 21289, 38};

	//  	int minNumber = intArray[0];

	//  	for(int counter=1;counter<intArray.length;counter++){

	//  		if(intArray[counter]<minNumber){
	//  			minNumber=intArray[counter];
	//  		}

 // 		}

 // 		return minNumber;
 		
	// }

}
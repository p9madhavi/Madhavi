package com.examples;

public class Calculator {	

 public int add ( int firstNumber,int secondNumber){
 	int addedNumber = firstNumber + secondNumber;
 	return addedNumber;
 }

 public int substract (int firstNumber,int secondNumber){
      int subNumber = firstNumber - secondNumber;
      return subNumber;
 }

public int  multiply (int firstNumber,int secondNumber){
	int  mulNumber = firstNumber * secondNumber;
	return mulNumber;
 }

 public int division (int firstNumber, int secondNumber){

    int dividedNumber=0;

 	if(secondNumber == 0){
 		System.out.println("'Division by zero is not possible");
 	} else {
 		dividedNumber =  firstNumber / secondNumber ;
 	}
 	return dividedNumber;
 }
}
	

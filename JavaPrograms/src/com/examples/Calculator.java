package com.examples;

import com.exceptions.CanNotDivideTheNumbers;

public class Calculator{

	public int add(int firstNumber,int secondNumber){

		int thirdNumber = firstNumber+secondNumber;
		return thirdNumber;
	}

	public int substract(int firstNumber,int secondNumber){

       int substractedNumber = firstNumber- secondNumber;
       return substractedNumber;

	}

	public int multiply(int firstNumber,int secondNumber){

		int multipliedNumber = firstNumber*secondNumber;
		return multipliedNumber;
	}

	public int divide(int firstNumber,int secondNumber) throws CanNotDivideTheNumbers{

		int dividedNumber=0;

		if(secondNumber==0){

			// System.out.println("divsion is Not Possible");
			throw new CanNotDivideTheNumbers();
		}else{
			 dividedNumber=firstNumber/secondNumber;
		}
		return dividedNumber;

	}




	public float add(float firstNumber,float secondNumber){

		float addedNumber = firstNumber+secondNumber;
		return addedNumber;
	}

	public float substract(float firstNumber,float secondNumber){

		float substractedNumber = firstNumber - secondNumber;
		return substractedNumber;

	}

	public float multiply(float firstNumber,float secondNumber){

		float multipliedNumber = firstNumber*secondNumber;
		return multipliedNumber;
	}

	public float divide(float firstNumber,float secondNumber) throws CanNotDivideTheNumbers{

		float dividedNumber = 0;
		if(secondNumber==0){
			// System.out.println("Division With zero Is Not Possible");
			throw new CanNotDivideTheNumbers();

		}else{
			dividedNumber = firstNumber/secondNumber;

		}
		return dividedNumber;
	}

	
}
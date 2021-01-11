package com.apps;

import com.examples.Calculator;
import com.exceptions.CanNotDivideTheNumbers;


public class CalculatorApp{

	public static void main(String[] args) {
		
		Calculator aCalculator = new Calculator();

		// System.out.println("CalculatorApp By Using Integer Numbers");

		// int addedNumber = aCalculator.add(7,8);
		// System.out.println("The additon Of two numbers :"+ addedNumber);


		// int subStractedNumber = aCalculator.substract(18,9);
		// System.out.println("The Substarction Of Two Numbers :"+ subStractedNumber);


		// int multipliedNumber = aCalculator.multiply(20,2);
		// System.out.println("The Multiplication Of two  Numbers :" + multipliedNumber);

        try{

		int dividedNumber = aCalculator.divide(10,2);
		System.out.println("The Division Of two numbers :"+ dividedNumber);
		  }	catch(CanNotDivideTheNumbers exp){
			System.out.println("Division by zero is not possible");
		}	
		

		 try{

		int dividedNumber = aCalculator.divide(10,0);
		System.out.println("The Division Of two numbers :"+ dividedNumber);
		  }	catch(CanNotDivideTheNumbers exp){
			System.out.println("Division by zero is not possible");
		}	
		

		System.out.println("Calculator App  by Using Float Numbers");

		float addedNumber = aCalculator.add(10.55f,22.55f);
		System.out.println("The addition Of Two Float Numbers :::"+addedNumber);


		float subStractedNumber=aCalculator.substract(45.46f,39.25f);
		System.out.println("The Substarction Of Two Float Numbers :"+ subStractedNumber);


		float multipliedNumber = aCalculator.multiply(33.25f,89.56f);
		System.out.println("The Multiplication Of two Float Numbers :" + multipliedNumber);


		try{

			float dividedNumber = aCalculator.divide(2977.87f,89.56f);
			System.out.println("The Division Of two Float Numbers :"+ dividedNumber);

		}catch(CanNotDivideTheNumbers exp){
			System.out.println("Division by zero is not possible");
		}

		try{

			float dividedNumber = aCalculator.divide(2977.87f,0);
			System.out.println("The Division Of two Float Numbers :"+ dividedNumber);

		}catch(CanNotDivideTheNumbers exp){
			System.out.println("Division by zero is not possible");
		}


		// float dividedNumber = aCalculator.divide(2977.87f,89.56f);
		// if(dividedNumber != 0)
		// 	System.out.println("The Division Of two Float Numbers :"+ dividedNumber);


		// dividedNumber = aCalculator.divide(2977.87f,0);
		// if(dividedNumber != 0)
		// 	System.out.println("The Division Of two Float Numbers :"+ dividedNumber);

		try{

			float dividedNumber = aCalculator.divide(0,2977.87f);
			System.out.println("The Division Of two Float Numbers :"+ dividedNumber);

		}catch(CanNotDivideTheNumbers exp){
			System.out.println("Division by zero is not possible");
		}
	
	}
}
package com.apps;

import com.examples.Calculator;

public class CalculatorApp{

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();

		int addedNumber = myCalc.add(4,5);

		System.out.println("The Value of addition is:" + addedNumber);


		int subNumber = myCalc.substract(9,5);

		System.out.println("The value of subtraction is:" + subNumber);

		int  mulNumber = myCalc.multiply(2,2);

		System.out.println("The value of multiplication is:" + mulNumber);

		int dividedNumber = myCalc.division(10,2);

		System.out.println("The Value Of Division Is :" + dividedNumber);
			

	}

}
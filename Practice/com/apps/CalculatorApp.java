package com.apps;

import com.examples.Calculator;

public class CalculatorApp{

	public static void main(String[] args) {
		
		Calculator aCalculator = new Calculator();

		int addedNumber = aCalculator.add(7,8);

        System.out.println("The added Number is :: " +addedNumber);

		int substractedNumber = aCalculator.substract(9,7);

		System.out.println("The substractedNumber is :: " + substractedNumber);
	}
}
package com.apps;
import com.examples.*;

import com.exceptions.NotAValidNumber;
import com.exceptions.NotEvenANumber;

import com.interfaces.PrintStarPattern;
import com.interfaces.PrintNumberPattern;


public class PrintPatternApp{

  	public static void main(String[] args) {
		

		PrintPattern aPrintPattern = new PrintPatternFor();


		System.out.println("About to start printStarTriangle Of PrintPatternFor:::::");

						try{
							aPrintPattern.printStarTriangle("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarTriangle("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarTriangle("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


		        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("About to start printNumberTriangle Of PrintPatternFor:::::");

						try{
							aPrintPattern.printNumberTriangle("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberTriangle("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberTriangle("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("About to start printStarPyramid Of PrintPatternFor:::::");

						try{
							aPrintPattern.printStarPyramid("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarPyramid("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarPyramid("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("About to start printNumberPyramid Of PrintPatternFor:::::");


						try{
							aPrintPattern.printNumberPyramid("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberPyramid("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberPyramid("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


		aPrintPattern = new PrintPatternWhile();


	 	System.out.println("############################################################");
		System.out.println("About to start printStarTriangle Of PrintPatternWhile:::::");

						try{
							aPrintPattern.printStarTriangle("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarTriangle("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarTriangle("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


				System.out.println("############################################################");
				System.out.println("About to start printNumberTriangle Of PrintPatternWhile:::::");


						try{
							aPrintPattern.printNumberTriangle("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberTriangle("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberTriangle("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


				System.out.println("############################################################");
				System.out.println("About to start printStarPyramid Of PrintPatternWhile:::::");



						try{
							aPrintPattern.printStarPyramid("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarPyramid("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarPyramid("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


		        System.out.println("############################################################");
				System.out.println("About to start printNumberPyramid Of PrintPatternWhile:::::");


						try{
							aPrintPattern.printNumberPyramid("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberPyramid("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberPyramid("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						

		PrintStarPattern anInterfacePrintStarPattern = new PrintPatternFor( );

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("About to start The  PrintStarPattern Interface for the PrintPatternFor:::::");

					System.out.println("About to start printStarTriangle Of PrintPatternFor of Interface^^^^^^^^^^^^:::::");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					


						try{
							aPrintPattern.printStarTriangle("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarTriangle("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarTriangle("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


				System.out.println("About to start printStarPyramid Of PrintPatternFor of Interface^^^^^^^^^^^:::::");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

						try{
							aPrintPattern.printStarPyramid("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarPyramid("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarPyramid("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


		PrintNumberPattern anInterfacePrintNumberPattern = new PrintPatternFor( );

		System.out.println("!!!!!!!9999999999999999999!!!!!!!!!!!!!!!!!!!!!!9999999999999999999999999");
		System.out.println("About to start The PrintNumberPattern Interface for the PrintPatternFor:::::");
				

		       System.out.println("About to start printNumberTriangle Of PrintPatternFor of Interface^^^^^^^^^^^^:::::");
			   System.out.println("!!!!!!!!!!!!!!!!99999999999999999999999999!!!!!!!!!!!!!!!!!!!!99999999999999999999999");


						try{
							aPrintPattern.printNumberTriangle("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberTriangle("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberTriangle("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

				System.out.println("About to start printNumberPyramid Of PrintPatternFor of Interface^^^^^^^^^^^^:::::");
				System.out.println("!!!!!!!!!!!!!9999999999999999999999!!!!!!!!!!!!!!!!!!9999999999999999999999999");


						try{
							aPrintPattern.printNumberPyramid("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberPyramid("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberPyramid("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


         anInterfacePrintStarPattern = new PrintPatternWhile( );

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("About to start The  PrintStarPattern Interface for the PrintPatternWhile:::::");

					System.out.println("About to start printStarTriangle Of PrintPatternWhile of Interface^^^^^^^^^^^^:::::");
					System.out.println("&&&&&&&& 5555555555555 &&&&&&&&&&&&&&&  555555555555555");
					


						try{
							aPrintPattern.printStarTriangle("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarTriangle("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarTriangle("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


				System.out.println("About to start printStarPyramid Of PrintPatternWhile of Interface^^^^^^^^^^^:::::");
				System.out.println("&&&&&&&&&&& 55555555555555 &&&&&&&&&&&&&&&&&&&&&& 5555555555555555555");

						try{
							aPrintPattern.printStarPyramid("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarPyramid("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printStarPyramid("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


		 anInterfacePrintNumberPattern = new PrintPatternWhile( );

		System.out.println("&&&&&&&&&&&&&& 777777777777777777777 &&&&&&&&&&&&&&&&&& 77777777777777777777");
		System.out.println("About to start The PrintNumberPattern Interface for the PrintPatternWhile:::::");
				

		       System.out.println("About to start printNumberTriangle Of PrintPatternWhile of Interface^^^^^^^^^^^^:::::");
			   System.out.println("&&&&&&&&&&&&&&& 77777777777777777 &&&&&&&&&&&&&&&&&&&&&& 7777777777777777777");


						try{
							aPrintPattern.printNumberTriangle("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberTriangle("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberTriangle("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

				System.out.println("About to start printNumberPyramid Of PrintPatternWhile of Interface^^^^^^^^^^^^:::::");
				System.out.println("&&&&&&&&&&&&&&&&&& 7777777777777777 &&&&&&&&&&&&&&& 77777777777777777777777");


						try{
							aPrintPattern.printNumberPyramid("6");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberPyramid("-5");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}

						try{
							aPrintPattern.printNumberPyramid("someString");
						}catch(NotAValidNumber aExp){
							System.out.println("You Entered An Invalid Number");
						}catch(NotEvenANumber aExp){
							System.out.println("The Number You Entered Is Not even a Number");
						}


	}
}
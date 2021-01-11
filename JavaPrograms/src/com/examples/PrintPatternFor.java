package com.examples;

import com.exceptions.NotAValidNumber;
import com.exceptions.NotEvenANumber;

import com.interfaces.PrintStarPattern;
import com.interfaces.PrintNumberPattern;


public class PrintPatternFor extends PrintPattern implements PrintStarPattern,PrintNumberPattern{



	public void printStarTriangle(String stringNumber) throws NotAValidNumber, NotEvenANumber{

		int noOfLines=0;

		try{
			noOfLines =Integer.parseInt(stringNumber);
		}catch(NumberFormatException aexp){
			throw new NotEvenANumber();
		}

		if(noOfLines<=0){
			throw new NotAValidNumber();
		}

		for(int i=1;i<=noOfLines;i++){
		
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
    }


    public void printNumberTriangle(String stringNumber) throws NotAValidNumber, NotEvenANumber{

    	int noOfLines=0;

		try{
			noOfLines =Integer.parseInt(stringNumber);
		}catch(NumberFormatException aexp){
			throw new NotEvenANumber();
		}

		if(noOfLines<=0){
			throw new NotAValidNumber();
		}

		for(int i=1;i<=noOfLines;i++){
		
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
    }

    public void printStarPyramid(String stringNumber) throws NotAValidNumber, NotEvenANumber{

    	int noOfLines=0;

		try{
			noOfLines =Integer.parseInt(stringNumber);
		}catch(NumberFormatException aexp){
			throw new NotEvenANumber();
		}

		if(noOfLines<=0){
			throw new NotAValidNumber();
		}

		for(int i=1;i<=noOfLines;i++){
		
			for(int j=noOfLines;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(" *");
			}
			System.out.println();
		}

    }

    public void printNumberPyramid(String stringNumber) throws NotAValidNumber, NotEvenANumber{

    	int noOfLines=0;

		try{
			noOfLines =Integer.parseInt(stringNumber);
		}catch(NumberFormatException aexp){
			throw new NotEvenANumber();
		}

		if(noOfLines<=0){
			throw new NotAValidNumber();
		}

		for(int i=1;i<=noOfLines;i++){
		
			for(int j=noOfLines;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(" "+k);
			}
			System.out.println();
		}

    }

}


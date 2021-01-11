package com.examples;


import com.exceptions.NotAValidNumber;
import com.exceptions.NotEvenANumber;

import com.interfaces.PrintStarPattern;
import com.interfaces.PrintNumberPattern;


public class PrintPatternWhile extends PrintPattern implements PrintStarPattern,PrintNumberPattern{

	public void printStarTriangle(String stringNumber) throws NotAValidNumber, NotEvenANumber{

         int noOfLines=0;

		    try{
		     	noOfLines = Integer.parseInt(stringNumber);
		    }catch(NumberFormatException aExp){
		     	throw new NotEvenANumber();
		    }

		    if(noOfLines<=0){
		     	throw new NotAValidNumber();
		    }

		     int i=1;
		     while(i<=noOfLines){
		     	int j=1;
		     	while(j<=i){
		     		System.out.print("*");
		     		j++;
		     	}
		     	System.out.println();
		     	i++;
		     }

	}

	public void printNumberTriangle(String stringNumber) throws NotAValidNumber, NotEvenANumber{

         int noOfLines=0;

		    try{
		     	noOfLines = Integer.parseInt(stringNumber);
		    }catch(NumberFormatException aExp){
		     	throw new NotEvenANumber();
		    }

		    if(noOfLines<=0){
		     	throw new NotAValidNumber();
		    }

		     int i=1;
		     while(i<=noOfLines){
		     	int j=1;
		     	while(j<=i){
		     		System.out.print(j);
		     		j++;
		     	}
		     	System.out.println();
		     	i++;
		     }

	}

	public void printStarPyramid(String stringNumber) throws NotAValidNumber, NotEvenANumber{

         int noOfLines=0;

		    try{
		     	noOfLines = Integer.parseInt(stringNumber);
		    }catch(NumberFormatException aExp){
		     	throw new NotEvenANumber();
		    }

		    if(noOfLines<=0){
		     	throw new NotAValidNumber();
		    }

		     int i=1;
		     while(i<=noOfLines){
		     	int j=noOfLines;
		     	while(j>=i){
		     		System.out.print(" ");
		     		j--;
		     	}
		     	int k=1;
		     	while(k<=i){
		     		System.out.print(" *");
		     		k++;
		     	}
		     	System.out.println();
		     	i++;
		     }

	}

	public void printNumberPyramid(String stringNumber) throws NotAValidNumber, NotEvenANumber{

         int noOfLines=0;

		    try{
		     	noOfLines = Integer.parseInt(stringNumber);
		    }catch(NumberFormatException aExp){
		     	throw new NotEvenANumber();
		    }

		    if(noOfLines<=0){
		     	throw new NotAValidNumber();
		    }

		     int i=1;
		     while(i<=noOfLines){
		     	int j=noOfLines;
		     	while(j>=i){
		     		System.out.print(" ");
		     		j--;
		     	}
		     	int k=1;
		     	while (k<=i) {
		     		System.out.print(" "+k);
		     		k++;
		     	}
		     	System.out.println();
		     	i++;
		     }

	}
}
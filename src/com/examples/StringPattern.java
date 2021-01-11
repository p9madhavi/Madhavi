package com.examples;

import com.exceptions.NotAStringPattern;

public class StringPattern extends SuperPatterns{

	public void printTriangle(String design, int noOfLines) throws NotAStringPattern{

		int length;

		if(length!=1)
		try{
		length=design.length();
         
         }catch(NumberFormatException exp){
         	throw NotAStringPattern();

         }

         for(int i=1;i<=noOfLines;i++)
			{
				for(int j=1;j<=i;j++)
                  {
                  	System.out.print(design);
                   }
			}
	      System.out.println( );

	}


	public void printPyramid(String design, int noOfLines) throws NotAStringPattern{

		int length;
		
		if(length!=1)
		try{
		length=design.length();
         
         }catch(NumberFormatException exp){
         	throw NotAStringPattern();

         }
         for (int i=1;i<=intnoOfLines;i++){
			
			for(int j=noOfLines;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print(" "+k);
			}
			System.out.println( );
		
















} 
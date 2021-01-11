package com.examples;


public class NumberspaceWhile{

	public void printNumberPyramid(int noOfLines)
	{
		int i =1;
		
		while(i<=noOfLines){
           int j=noOfLines;
			while(j>=i)
			{
			System.out.print(" ");
			j--;
			}
		
           int k=1;
			while(k<=i)
			{
			System.out.print(" "+k);
			k++;
			}
		
		System.out.println( );
		i++;
		}
	}
}		
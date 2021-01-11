package com.examples;

// Right Angle number Pattern//
public class Number1while{

	public void printNumberRightangle(int noOfLines)
	{
		int i =1;
		
		while(i<=noOfLines){
           int j=1;
			while(j<=i)
			{
			System.out.print(j);
			j++;
			}
		
		System.out.println( );
		i++;
		}
	}
}		
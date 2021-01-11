package com.examples;

public class StarPattern{

	public void printStar(int noOfLines){

		for(int i=1;i<=noOfLines;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
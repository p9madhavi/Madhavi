package com.examples;

public class StarPattern{

	int noOfLines;

	public StarPattern(){

		noOfLines =10;
	}

	public void printStar( ){

		for (int i = 1; i <= noOfLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
	
}
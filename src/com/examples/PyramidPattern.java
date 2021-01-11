package com.examples;

public class PyramidPattern{

	private int noOfLines;

	public int getNoOfLines(){
		return this.noOfLines;
	}

	public void setNoOfLines(int noOfLines){
		this.noOfLines=noOfLines;
	}

	public void printPyramidPattern(){

		for(int i=1;i<=this.noOfLines;i++){

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


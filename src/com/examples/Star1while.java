package com.examples;

public class Star1while{

	int noOfLines;
	
	public Star1while(){
		super();
	}
    
    public Star1while(int wantedLines){

		super();
		this.noOfLines = wantedLines;

    }

	public void printStarRightangle(){    
       
		int i=1;
		
		while(i<=noOfLines){
           int j=1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println( );
			i++;
		}
	}
}









		
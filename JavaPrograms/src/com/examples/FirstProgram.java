package com.examples;

public class FirstProgram{

	int firstInteger =9;
	boolean aBoolean = true;
	long firstLong = 7L;

	public void showValues(){

		System.out.println("The Value Of The firstInteger class Variable Is ::: "+ firstInteger);
		System.out.println("The Value Of The aBoolean class Variable Is:::"+ aBoolean);
		System.out.println("The Value Of The firstLong class Variable Is ::: "+ firstLong);
	}

	public void intValue(int secondInteger){

		System.out.println("The value Of secondInteger Is::"+ secondInteger);
		// System.out.println("The value Of The Class Variable firstInteger Is::"+ this.firstInteger);
		
		System.out.println("The Sum of the two Integers ::"+ (secondInteger+this.firstInteger));

	}

	public long longValue(long secondLong){

         System.out.println("The Value Of The Second Long Is::" +secondLong);


         System.out.println("The Sum Of The Two Long Numbers ::" + (secondLong+this.firstLong)); 
         return this.firstLong+secondLong;
          
	}
}

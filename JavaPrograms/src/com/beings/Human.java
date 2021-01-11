package com.beings;

public class Human extends Animal{

	int noOfLegs = 2;
 	boolean hasTail = false;

 	public void showProperty(){

 		System.out.println("I am a Human, I have " + this.noOfLegs + " legs, whereas an Animal will have " + super.noOfLegs + "legs");
 	}

 	public void says(){

		System.out.println("I am a Human");
	}
}





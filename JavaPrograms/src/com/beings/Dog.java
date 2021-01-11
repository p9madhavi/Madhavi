package com.beings;



public class Dog extends Animal implements Pet{


	public void showProperty(){

		System.out.println("Number Of legs Of Dog :  "+  noOfLegs);
		System.out.println("Does Dog HasTail ?  "+  hasTail);
	}

	public void says(){

		System.out.println("Wooofffffff Wooooofff");
	}

	public void petable(){

		System.out.println("I am a Dog Pet");
	}

	public void isCute(){

		System.out.println("Iam a Cute Dog");
	}


}
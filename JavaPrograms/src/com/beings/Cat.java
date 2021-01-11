package com.beings;



public class Cat extends Animal implements Pet{


	public void says(){

		System.out.println("Meowww Meowww");
	}

	public void petable(){

		System.out.println("I am a Cat Pet");
	}

	public void isCute(){

		System.out.println("Iam a Cute Cat Pet");
	}


}
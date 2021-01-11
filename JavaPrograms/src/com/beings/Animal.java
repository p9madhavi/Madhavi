package com.beings;

abstract public class Animal{

	protected int noOfLegs = 4;
	protected boolean hasTail = true;

	public void showProperty(){

		System.out.println("Number Of legs Of Animal :  "+  noOfLegs);
		System.out.println("Does Animal HasTail ?  "+  hasTail);
	}

	abstract public void says();



}
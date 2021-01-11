package com.samples;

import com.examples.*;

public class Hello{
	public static void main (String[] args) {
		System.out.println("Hello to the Java World");

		Welcome myWelcome = new Welcome();
		myWelcome.printWelcome();

		MyAddress address = new MyAddress();
		address.printAddress();

		MyDetails details = new MyDetails();
		details.printDetails();
	}
}
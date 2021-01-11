package com.apps;

import com.examples.*;

public class StringExampleApp{

	public static void main (String[]args){

		String oneString = new String("I live in cary which is in North Carolina");

		StringExample aStringExample = new StringExample();

		aStringExample.printCharacterAtLocation( oneString,5);

		aStringExample.compareTwoStrings("Madhavi", "Shalini");

		aStringExample.compareTwoStrings("Madhavi", "Madhavi");

        aStringExample.compareTwoStrings("Madhavi", "madhavi");


			}
}
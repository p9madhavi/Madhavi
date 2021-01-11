package com.apps;

import com.examples.StringExample;

public class StringExampleApp{

	public static void main(String[] args) {
		
		StringExample anExample = new StringExample();

		// System.out.println(":::::::::::::::::::::::");
		// System.out.println(":::::::Char At  :::::::");
		// int index =4;
		// String aString = "SivaReddy";
		// try{
		// 	char character = anExample.demoCharAt(index, aString);
		// 	System.out.println(" The character at index"+ index+" is: "+character);
		// }catch(IndexOutOfBoundsException aExp){
		// 	System.out.println("index out of bound occurred");
		// }
		// index = 10;
		// try{
		// 	char character = anExample.demoCharAt(index, aString);
		// 	System.out.println(" The character at index"+ index+" is: "+character);
		// }catch(IndexOutOfBoundsException aExp){
		// 	System.out.println("index out of bound occurred");
		// }

		// System.out.println(":::::::::::::::::::::::");
		// System.out.println("::::::: Length  :::::::");
		// int length = anExample.demoLength(aString);
		// System.out.println("The lenght of string:"+aString+" is: "+length);
       

       anExample.stringMethods();


	}
}
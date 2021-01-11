package com.apps;

import com.examples.StringExample;
import com.sun.xml.internal.fastinfoset.tools.TransformInputOutput;

import java.sql.SQLOutput;

public class StringExampleApp{

	public static void main(String[] args) {
		
		StringExample anExample = new StringExample();

		 System.out.println(":::::::::::::::::::::::");
		 System.out.println(":::::::Char At  :::::::");
		 int index =4;
		 String aString = "SivaReddy";
		 try{
		 	char character = anExample.demoCharAt(index, aString);
		 	System.out.println(" The character at index"+ index+" is: "+character);
		 }catch(IndexOutOfBoundsException aExp){
		 	System.out.println("index out of bound occurred");
		 }
		 index = 10;
		 try{
		 	char character = anExample.demoCharAt(index, aString);
		 	System.out.println(" The character at index"+ index+" is: "+character);
		 }catch(IndexOutOfBoundsException aExp){
		 	System.out.println("index out of bound occurred");
		 }

		 System.out.println(":::::::::::::::::::::::");
		 System.out.println("::::::: Length  :::::::");
		 int length = anExample.demoLength(aString);
		 System.out.println("The lenght of string:"+aString+" is: "+length);

		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: ToUpperCase :::::::");

//		String firstString = "polymorphism";
		String upperCaseString = anExample.demoToUpperCase(aString);
		System.out.println("The upppercaseString Of  " +aString + "  is : " +upperCaseString  ) ;
		System.out.println(":::::::::::::::::::::::");

		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: ToLowerCase :::::::");
		String  secondString="URLFORMATOBJECT";
//		String lowerCaseString = anExample.demoToLowerCase(secondString);
		aString = anExample.demoToLowerCase(secondString);
		System.out.println("The lowercaseString Of  " +secondString + "  is : " +aString  ) ;
		System.out.println(":::::::::::::::::::::::");
//		aString = urlformatobject;

		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: Concat :::::::");
//		aString ="urlformatobject";
		String bString ="Url Parser Class";
		String conCatenatedString = anExample.demoConcat(aString,bString);
		System.out.println("The concatned string Of  " + aString+ "  and  " + bString + "  Is:  " + conCatenatedString );
		System.out.println(":::::::::::::::::::::::");

		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: Equals :::::::");
		boolean result = anExample.demoEquals(aString,bString);
		if(result == true){
			System.out.println("The two strings  " + aString+"  and "+ bString +" are equal");
		} else {
			System.out.println("The two strings  " + aString+"  and "+ bString +" are not equal");
		}
		System.out.println(":::::::::::::::::::::::");


		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: EqualsIgnorecase :::::::");
		 boolean answer = anExample.demoEqualsIgnoreCase(aString,secondString);
		if(answer){
			System.out.println("The two strings  " + aString+ " and " + secondString + " are equal");
		}else{
			System.out.println("The two strings  " + aString+ " and " + secondString + " are not equal");
		}
		System.out.println(":::::::::::::::::::::::");


		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: CompareTo :::::::");
		int difference= anExample.demoCompareTo(aString,bString);
		if(difference==0){
			System.out.println("The two strings  " + aString+ " and " + bString + " are equal");
		}else if(difference>0){
			System.out.println("The string  " +aString + "  will come first");
		}else {
			System.out.println("The string  " +bString + "  will come first");
		}
 		System.out.println(":::::::::::::::::::::::");


		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: CompareToIgnoreCase :::::::");
		int differenceOfTheString= anExample.demoCompareToIgnoreCae(aString,secondString);
		if(differenceOfTheString==0){
			System.out.println("The two strings  " + aString+ " and " + secondString + " are equal");
		}else if(differenceOfTheString>0){
			System.out.println("The string  " +secondString + "  will come first");
		}else {
			System.out.println("The string  " +aString + "  will come first");
		}
		System.out.println(":::::::::::::::::::::::");


		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: IS EMPTY :::::::");
		String dataOne = "javaTraining";
		boolean isEmpty = anExample.demoIsEmpty(dataOne);
		System.out.println("is String: "+dataOne+" empty?:"+isEmpty);

		dataOne = "";
		isEmpty = anExample.demoIsEmpty(dataOne);
		System.out.println("is String: "+dataOne+" empty?:"+isEmpty);
		System.out.println(":::::::::::::::::::::::");


		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: CONTAINS :::::::");
		String testString = "javaTraining";
		CharSequence seq = "java";
		result = anExample.demoContains(testString, seq);
		System.out.println("The seq: "+seq+" is present in String "+testString+" ?: "+result);
		seq = "program";
		result = anExample.demoContains(testString, seq);
		System.out.println("The seq: "+seq+" is present in String "+testString+" ?: "+result);
		System.out.println(":::::::::::::::::::::::");

		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: SUBSTRING WITH ONE INDEX :::::::");
		String mainString = "JavaTraining";
		int startIndex = 4;
		try {
			String subString = anExample.demoSubstringOne(mainString, startIndex);
			System.out.println("The substring of: " + mainString + " with index: " + startIndex + " is:" + subString);
		}catch(IndexOutOfBoundsException exp){
			System.out.println("Index value is more than the length of the string");
		}
		mainString="java";
		startIndex=5;
		try {
			String subString = anExample.demoSubstringOne(mainString, startIndex);
			System.out.println("The substring of: " + mainString + " with index: " + startIndex + " is:" + subString);
		}catch(IndexOutOfBoundsException exp){
			System.out.println("Index value is more than the length of the string");
		}
		System.out.println(":::::::::::::::::::::::");

		System.out.println(":::::::::::::::::::::::");
		System.out.println("::::::: SUBSTRING WITH Two INDEXs :::::::");
		String kString = "hamburger";
		startIndex=4;
		int endIndex=8;
		try{
		String subStringTwo	=anExample.demoSubStringTwo(kString,startIndex,endIndex);
			System.out.println("The subString of  " +kString+"  begin index  " + startIndex +"  ending index  " + endIndex + " Is:  " + subStringTwo);
		}catch (IndexOutOfBoundsException aExp){
			System.out.println("Exception thrown When beginIndex is negative ,or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex. ");
		}

		kString = "smile";
		startIndex=1;
		endIndex=5;
		try{
			String subStringTwo	=anExample.demoSubStringTwo(kString,startIndex,endIndex);
			System.out.println("The subString of  " +kString+"  begin index  " + startIndex +"  ending index  " + endIndex + " Is:  " + subStringTwo);
		}catch (IndexOutOfBoundsException aExp){
			System.out.println("Exception thrown When beginIndex is negative ,or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex. ");
		}

		kString = "pattern";
		startIndex=-1;
		endIndex=7;
		try{
			String subStringTwo	=anExample.demoSubStringTwo(kString,startIndex,endIndex);
			System.out.println("The subString of  " +kString+"  begin index  " + startIndex +"  ending index  " + endIndex + " Is:  " + subStringTwo);
		}catch (IndexOutOfBoundsException aExp){
			System.out.println("Exception thrown When beginIndex is negative ");
		}
		kString = "pattern";
		startIndex=4;
		endIndex=9;
		try{
			String subStringTwo	=anExample.demoSubStringTwo(kString,startIndex,endIndex);
			System.out.println("The subString of  " +kString+"  begin index  " + startIndex +"  ending index  " + endIndex + " Is:  " + subStringTwo);
		}catch (IndexOutOfBoundsException aExp){
			System.out.println("Exception thrown When endIndex is larger than the length of this String object");
		}

		kString = "pattern";
		startIndex=9;
		endIndex=7;
		try{
			String subStringTwo	=anExample.demoSubStringTwo(kString,startIndex,endIndex);
			System.out.println("The subString of  " +kString+"  begin index  " + startIndex +"  ending index  " + endIndex + " Is:  " + subStringTwo);
		}catch (IndexOutOfBoundsException aExp){
			System.out.println("Exception thrown When beginIndex is larger than endIndex");
		}
		System.out.println(":::::::::::::::::::::::");

	}
}
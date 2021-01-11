package com.examples;

public class StringExample{

	 public char demoCharAt(int index, String aString) throws IndexOutOfBoundsException{

	 	  char character = aString.charAt(index);
	 	  return character;

	 }

	 public int demoLength(String aString){
	 	int length = aString.length();
	 	return length;
	 }

	public String demoToUpperCase(String aString) {
		String upperCaseString = aString.toUpperCase();
		return upperCaseString;
	}

	public String demoToLowerCase(String aString){
		String lowerCaseString = aString.toLowerCase();
		return lowerCaseString;
	}

	public String demoConcat(String aString,String bString){
		String conCatenatedString = aString.concat(bString);
		return conCatenatedString;
	}

	public boolean demoEquals(String aString,String bString){
		boolean result = aString.equals(bString);
		return result;
	}

	public boolean demoEqualsIgnoreCase(String aString,String bString){
		boolean result = aString.equalsIgnoreCase(bString);
		return result;
	}

	public int demoCompareTo(String aString,String bString){
		int difference = aString.compareTo(bString);
		return difference;
	}

	public int demoCompareToIgnoreCae(String aString,String bString){
		int difference = aString.compareToIgnoreCase(bString);
		return difference;
	}

	public boolean demoIsEmpty(String testString){

		boolean result = testString.isEmpty();
		return result;
	}

	public boolean demoContains(String testString, CharSequence seq){
		boolean result = testString.contains(seq);
		return result;
	}
	public String demoSubstringOne(String testString, int startIndex) throws IndexOutOfBoundsException{

		String subString = testString.substring(startIndex);
		return subString;
	}
	public String demoSubStringTwo(String aString,int startIndex,int endIndex) throws IndexOutOfBoundsException{
	 	String subStringtwo = aString.substring(startIndex,endIndex);
	 	return subStringtwo;
	}






       
























}
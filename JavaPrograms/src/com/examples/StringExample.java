package com.examples;

public class StringExample{

	// public char demoCharAt(int index, String aString) throws IndexOutOfBoundsException{

	// 	  char character = aString.charAt(index);
	// 	  return character;

	// }

	// public int demoLength(String aString){
	// 	int length = aString.length();
	// 	return length;
	// }


	String firstString = "wrapperclasses";
	String secondString ="POLYMORPHISM";
	String thirdString = "IntegerDouble";
	String fourthString="Abstraction";
	String fifthString ="Encapsulation";


	public void stringMethods(){

		System.out.println("!!!!!!!!!!!!!!! ToUpperCase ()!!!!!!!!!!!!!!  wrapperclasses  ");
		String upperCaseString = firstString.toUpperCase();
		System.out.println("The resulted String is: "+ upperCaseString);
		System.out.println();
		System.out.println();

		System.out.println("!!!!!!!!!!!!!!! ToLowerCase ()!!!!!!!!!!!!!!   POLYMORPHISM ");
		String lowerCaseString = secondString.toLowerCase();
		System.out.println("The resulted String is: "+ lowerCaseString);
		System.out.println();
		System.out.println();

		System.out.println("!!!!!!!!!!!!!!! concat () !!!!!!!!!!!!!!   wrapperclasses & IntegerDouble ");
		String combinedString = firstString.concat(thirdString);
		System.out.println("The resulted String is: "+ combinedString);
		System.out.println();
		System.out.println();

		System.out.println("!!!!!!!!!!!!!!! equals() !!!!!!!!!!!!!!  ");
		boolean result = firstString.equals(thirdString);
		if(result = true){
			System.out.println("two Strings are equal");
		}else{
		     System.out.println("two Strings are not equal");	
		}

		System.out.println("The result is :::"+ result);
		System.out.println();
		System.out.println();


       	System.out.println("!!!!!!!!!!!!!!! equalsIgnoreCase() !!!!!!!!!!!!!!  ");
		boolean isequal = firstString.equalsIgnoreCase(secondString);
		if(isequal = true){
			System.out.println("two Strings are equal");
		}else{
		     System.out.println("two Strings are not equal");	
		}

		System.out.println("The isequal is :::"+ isequal);
		System.out.println();
		System.out.println();
       

       System.out.println("!!!!!!!!!!!!!!! compareTo() !!!!!!!!!!!!!!  ");

		int differenceOfString = fifthString.compareTo(fourthString);
     	 if(differenceOfString==0){
         System.out.println("both the strings are equal");
     	 }
     	 else if(differenceOfString >0){
          System.out.println("Abstraction will come first ");
      	}
       	else{
       	   System.out.println("Encapsulation will come first ");
       	}
     	System.out.println("The difference of the string is: "+ differenceOfString);
     	System.out.println();
		System.out.println();

		System.out.println("!!!!!!!!!!!!!!! compareToIgnoreCase() !!!!!!!!!!!!!!  ");

		int difference = fifthString.compareToIgnoreCase(secondString);
     	 if(difference==0){
         System.out.println("both the strings are equal");
     	 }
     	 else if(difference >0){
          System.out.println("Encapsulation will come first ");
      	}
       	else{
       	   System.out.println("POLYMORPHISM will come first ");
       	}
     	System.out.println("The difference of the string is: "+ difference);
     	System.out.println();
		System.out.println();



       























	}
}
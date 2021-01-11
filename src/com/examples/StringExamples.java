package com.examples;

//StringExamples compapre ,length,charAt,concatenation

public class StringExamples{

    String firstString = "Java Is An ObjectOriented Language";
    String secondString = "java is an objectoriented Language";
    String thirdString = "Abstraction";
    String fourthString ="Encapsulation";
    String fifthString = "JAVA IS AN OBJECTORIENTED LANGUAGE";
    String sixthString = "   Java Is An ObjectOriented Language  ";


public void demoStringMethods(){

	System.out.println("About to start String length ");
	System.out.println("First String : Java Is An ObjectOriented Language");
	int length = firstString.length(); 
    System.out.println("The lengthofthistString:" + length);
    System.out.println("Done demo String Length ");

    System.out.println();

    System.out.println("About to start to find the character in the String ");
	System.out.println("First String : Java Is An ObjectOriented Language"); 
    char aCharacter = firstString.charAt(9);
  	System.out.println("The character at 9th position is: "+aCharacter);
  	System.out.println("Done finding a character in the  String");

  	 System.out.println();

    System.out.println("About to start comparing two Strings ");
	System.out.println("First String : Abstraction"); 
	System.out.println("Second String : Encapsulation"); 
    int differenceOfString = thirdString.compareTo(fourthString);
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
  	 System.out.println("Done Comparing two Strings");
    
     System.out.println();

     System.out.println("About to start to concatenate two Strings ");
	 System.out.println("First String : Abstraction"); 
	 System.out.println("Second String : Encapsulation");  
     String combinedString  = thirdString.concat(fourthString);
     System.out.println("The concatenated String is: "+ combinedString);
  	 System.out.println("Done concatenating the two Strings");


     System.out.println();

     System.out.println("About to start replacing a letter in the firstString  ");
	 System.out.println("First String : Java Is An ObjectOriented Language");
     String replacedString = firstString.replaceAll("a", "o");
     System.out.println("The resulted String is: "+ replacedString);
  	 System.out.println("Done replacing a letter in thefirstString");

  	 System.out.println();


  	 System.out.println("About to start Uppercasing the secondString  ");
	 System.out.println("secondString : java is an objectoriented language");
     String uppercaseString = secondString.toUpperCase( );
     System.out.println("The resulted String is: "+ uppercaseString);
  	 System.out.println("Done  Uppercasing the secondString");

  	 System.out.println();

  	 System.out.println("About to start Lowercasing the fifthString  ");
	 System.out.println(" fifthString = JAVA IS AN OBJECTORIENTED LANGUAGE ");
     String lowercaseString = fifthString.toLowerCase( );
     System.out.println("The resulted String is: "+ lowercaseString);
  	 System.out.println("Done  Lowercasing the fifthString");

  	 System.out.println();

  	 System.out.println("About to start equalsIgnoreCase of two Strings ");
	 System.out.println("First String :Java Is An ObjectOriented Language"); 
	 System.out.println("Second String : java is an objectoriented language");  
  	 boolean isEqual =  firstString.equalsIgnoreCase(secondString);
  	   if (isEqual=true){
  	 	   System.out.println("both the Strings are equal");
  	 	   }

  	 	 else
  	 	 	{
  	 	 	 System.out.println("both the Strings are not equal");
  	 	 	}
  	 System.out.println("The result is: "+ isEqual);
  	 System.out.println("Done  equalsIgnoreCase of two Strings");

  	 System.out.println();

  	System.out.println("About to start trim the String ");
	 System.out.println("First String : Java Is An ObjectOriented Language");
	 System.out.println("sixthString  before "+ sixthString + "after");
	 String trimmedString=sixthString.trim( ); 
    System.out.println("The TrimmedString is:" + trimmedString + "after");
    System.out.println("Done Trimming the String");

       

}
}
package com.examples;

public class Palindrome{


	
	String reverse ="";



	public void isPalindrome(String aString){

             reverse ="";
              //System.out.println("Inside isPalindrome Method Start ");

             // System.out.println("Value Of aString "+ aString);

             // System.out.println("Value Of reverse "+ reverse);



       for(int i= aString.length()-1; i>=0 ;i--){

       	  reverse = reverse + aString.charAt(i);

       }

              //System.out.println("Value Of aString "+ aString);

             // System.out.println("Value Of reverse "+ reverse);


       if(reverse.equals(aString)){

       System.out.println("the given string is a Palindrome string " + reverse);
       }
       else{ 
       
       	System.out.println("the given string is  not a Palindrome string " + aString);

       }
	}
}
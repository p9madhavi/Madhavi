package com.examples;
import com.exceptions.NotevenANumber;

public class NumberPattern extends SuperPatterns {

     

     public void printTriangle(String noOfLines) throws NotevenANumber{

     	int intnoOfLines;
     	try{

          	int intnoOfLines = Integer.parseint(noOfLines);

         }catch(NumberFormatException exp){
         	throw NotevenANumber();

            }
         
         for(int i=1;i<=intnoOfLines;i++)
			{
				for(int j=1;j<=i;j++)
                  {
                  	System.out.print(j);
                   }
			}
	      System.out.println( );

     }

 public void printPyramid(String noOfLines) throws NotevenANumber{

     	int intnoOfLines;
     	try{

          	int intnoOfLines = Integer.parseint(noOfLines);

         }catch(NumberFormatException exp){
         	throw NotevenANumber();

            }
         
         for (int i=1;i<=intnoOfLines;i++){
			
			for(int j=intnoOfLines;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print(" "+k);
			}
			System.out.println( );
		
     }  


     
}
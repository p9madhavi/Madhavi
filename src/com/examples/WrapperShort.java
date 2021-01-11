package com.examples;

public class WrapperShort{

	public void  shortCompareDemo(){

		
    short aShort = 9;

		Short objectShort = new Short(aShort);

		Short firstObjectShort = null;

    Short thirdObjectShort = new Short(aShort);

		
    
       try{

             firstObjectShort = new Short("19");

           }catch(NumberFormatException aExp){

              System.out.println("Exception thrown when converting String 19 to Short");
           }
       try{

            Short secondObjectShort = new Short("Polymorphism");
           } catch(NumberFormatException aExp){

               System.out.println("Exception thrown when converting String Polymorphism to Short");
           }
  


		      if(objectShort.compareTo(firstObjectShort)==0){
             	System.out.println(" objectShort and firstObjectShort are equal");

          }
          else{
               
               System.out.println("objectShort and firstObjectShort are not equal");
               System.out.println( objectShort.shortValue() + "and " + firstObjectShort.shortValue() + "are not equal");

                }

              
            if(objectShort.compareTo(thirdObjectShort)==0)
              {
                 System.out.println("The obejectShort and thirdObjectShort are equal");
               }
               else
               {
                 System.out.println("The objectShort and thirdObjectShort are notequal");	
               }	


	}
}
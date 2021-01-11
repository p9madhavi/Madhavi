package com.examples;

public class WrapperExample{

	public void  integerCompareDemo(){

		int primitiveint = 7;

		Integer objectInteger = new Integer(9);

		Integer firstObjectInteger = null;

    Integer thirdObjectInteger = new Integer(9);

		
    
      try{

             firstObjectInteger = new Integer("19");

           }catch(NumberFormatException aExp){

              System.out.println("Exception thrown when converting String 19 to Integer");
           }
       try{

            Integer secondObjectInteger = new Integer("Polymorphism");
           } catch(NumberFormatException aExp){

               System.out.println("Exception thrown when converting String Polymorphism to Integer");
           }
  


		    if(objectInteger.compareTo(firstObjectInteger)==0){
             	System.out.println("The integers obejctInteger and firstObjectInteger are equal");

          }
          else{
               
               System.out.println("The integers obejctInteger and firstObjectInteger are not equal");
               System.out.println("The integers" + objectInteger.intValue() + "and " + firstObjectInteger.intValue() + "are not equal");

                }

              
            if(objectInteger.compareTo(thirdObjectInteger)==0)
              {
                 System.out.println("The integers obejctInteger and thirdObjectInteger are equal");
               }
               else
               {
                 System.out.println("The integers obejctInteger and thirdObjectInteger are notequal");	
               }	


	}
}
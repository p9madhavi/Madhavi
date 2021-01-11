package com.examples;

public class WrapperExample{

	public void wrapperInteger(){

			Integer objectInteger = new Integer("50");
			Integer firstObjectInteger = null;
			Integer thirdObjectInteger = new Integer("50");

			String stringNumber = new Integer("899").toString();
			System.out.println("The StringNumber is ::" + stringNumber);


			try{
				Integer secondObjectInteger = new Integer("WrapperClass");
			}catch(NumberFormatException aExp){
				System.out.println("Exception thrown when converting String to Integer");
			}

			try{

				firstObjectInteger = new Integer("89");
			}catch(NumberFormatException aexp){
				System.out.println(" Exception thrown When converting 89 to Integer");
			}

			if(firstObjectInteger.compareTo(objectInteger)==0){

                System.out.println("firstObjectInteger and objectInteger are equal");
                
			}else{
				 System.out.println("firstObjectInteger and objectInteger are not equal");
				 System.out.println("firstObjectInteger   " +firstObjectInteger.intValue() + "  and objectInteger    " +objectInteger.intValue() +" are not equal");
			
			}

			if(thirdObjectInteger.equals(objectInteger)==true){

				// System.out.println("thirdObjectInteger and objectInteger are equal");
				System.out.println("thirdObjectInteger   " +thirdObjectInteger.intValue() + "  and objectInteger    " +objectInteger.intValue() +" are equal");
				System.out.println("thirdObjectInteger    " +thirdObjectInteger.floatValue() + "  and objectInteger     " +objectInteger.floatValue() +" are equal");
			
			}else{

                 System.out.println("thirdObjectInteger and objectInteger are not equal");
			}

	}

	public void wrapperDouble(){

		Double objectDouble = new Double("10000.12345");
		Double firstObjectDouble = null;
		Double thirdObjectDouble = new Double("10000.12345");

			String stringNumber = new Double("2999899").toString();
			System.out.println("The StringNumber is ::" + stringNumber);
			


		try{
				Double secondObjectDouble = new Double("wrapperDouble");
			}catch(NumberFormatException aExp){
				System.out.println("Exception thrown when converting String to Double");
			}

			try{

				firstObjectDouble = new Double("99999.123456");
			}catch(NumberFormatException aexp){
				System.out.println(" Exception thrown When converting 99999.123456 to Double");
			}

			if(firstObjectDouble.compareTo(objectDouble)==0){

                System.out.println("firstObjectDouble and objectDouble are equal");
                
			}else{
				 System.out.println("firstObjectDouble and objectDouble are not equal");
				 System.out.println("firstObjectDouble    " +firstObjectDouble.intValue() + " and objectDouble     " +objectDouble.intValue() +"  are not equal");
				 System.out.println("firstObjectDouble     " +firstObjectDouble.floatValue() + "  and objectDouble    " +objectDouble.floatValue() +"  are equal");
			
			}

			if(thirdObjectDouble.equals(objectDouble)==true){

				System.out.println("thirdObjectDouble and objectDouble are equal");
				System.out.println("thirdObjectDouble     " +thirdObjectDouble.intValue() + " and objectDouble     " +objectDouble.intValue() +"  are equal");
				System.out.println("thirdObjectDouble     " +thirdObjectDouble.floatValue() + " and objectDouble     " +objectDouble.floatValue() +"  are equal");
			
			}else{

                 System.out.println("thirdObjectDouble and objectDouble are not equal");
			}


	}


}
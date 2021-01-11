package com.examples;

public class MonthFinder{

	public void findMonth(int monthNumber){
       
      if( (monthNumber < 1) || (monthNumber > 12)  )
      {
      	System.out.println(" Please give a Number which is between 1 and 12");
      } else {

        if(monthNumber == 1)
        {
        	System.out.println("January");
        }else if (monthNumber == 2){
        	System.out.println("Febraury");
        }else if (monthNumber == 3){
        	System.out.println("March");
        }else if (monthNumber == 4){
        	System.out.println("April");
        }else if (monthNumber == 5){
        	System.out.println("May");
        }else if (monthNumber == 6){
        	System.out.println("June");
        }else if (monthNumber == 7){
        	System.out.println("July");
        }else if (monthNumber == 8){
        	System.out.println("August");
        }else if (monthNumber == 9){
        	System.out.println("September");
        }else if (monthNumber == 10){
        	System.out.println("October");
        }else if (monthNumber == 11){
        	System.out.println("November");
        }else 
        {
        	System.out.println("December");
        }
      }


	}

	public void findMonthBySwitch(int monthNumber){
		if( (monthNumber < 1) || (monthNumber > 12)  ){
      	System.out.println(" Please give a Number which is between 1 and 12");
        } else {
         switch (monthNumber){
         	case 1:
         	  System.out.println("January");
         	  break;
         	case 2:
         	   System.out.println("Febraury");
         	  break;
         	case 3:
         	   System.out.println("March");
          	  break;
         	case 4:
         	   System.out.println("April");
         	  break;
         	case 5:
         	   System.out.println("May");
         	  break;
         	case 6:
         	   System.out.println("June");
         	  break;
         	case 7:
         	   System.out.println("July");
         	  break;
         	case 8:
         	   System.out.println("August");
         	  break;
         	case 9:
         	   System.out.println("September");
         	  break;
         	case 10:
         	   System.out.println("October");
         	  break;
         	case 11:
         	   System.out.println("November");
         	  break;                  
         	default:
         	   System.out.println("December");

         }

      }
	}
}
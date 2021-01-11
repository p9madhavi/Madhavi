package com.apps;

import com.examples.MonthFinderByMap;
import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;

public class CheckFlowException {

    public static void main(String[] args) {

        System.out.println("I'm starting here");
        String value=null;
        System.out.println("I'm trying to print value:"+value);

        MonthFinderByMap aMap = new MonthFinderByMap();
        System.out.println("I created a MonthFinderByMap class");
        int a=10;
        int b=10;
        int c=10;
        System.out.println("created 3 integers. a="+a+" b="+b+" c="+c);

        try {
            System.out.println("about to call findMonth");
            value=aMap.findMonth("-5");
            System.out.println("just now called findMonth");
            System.out.println("I'm trying to print value:"+value);
        } catch (NotAValidMonthNumber notAValidMonthNumber) {
            System.out.println("I'm in NotAValidMonthNumber catch block");
            a=5;
            b=5;
            c=5;
            System.out.println("created 3 integers. a="+a+" b="+b+" c="+c);
        } catch (NotEvenANumber notEvenANumber) {
            System.out.println("I'm in NotEvenANumber catch block");
            a=8;
            b=8;
            c=8;
            System.out.println("created 3 integers. a="+a+" b="+b+" c"+c);
        }
        // NotAValidMonthNumber ----  a = 5
        // NotEvenANumber --   a=8
        if(a==5){
            // pass
        }
        System.out.println("Ending the program, bye!");
    }
}

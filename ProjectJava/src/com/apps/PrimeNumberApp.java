package com.apps;

import com.examples.PrimeNumber;

public class PrimeNumberApp {
    public static void main(String[] args) {

        PrimeNumber aNumber = new PrimeNumber();
//        aNumber.isPrime(17);
//          aNumber.primeRange(50);

//        System.out.println("::::\t:::::::::::::::::End Of Line 1");
//        System.out.print("**\n");
//        System.out.println(":::::::End of line 2");

        //::::  ::::::::::::::::::::::::::
        //**
        // ::::::
        //  --- new line
        //   \n  --- newline    \t   tab
//        ::::\t:::::::::::::::::End Of Line 1
//        **\n:::::::End of line 2
        //   escape character is "\" --- it will forget the special meaning
//
//        System.out.println("::::\\t:::::::::::::::::End Of Line 1");
//        System.out.print("**\\n");
//        System.out.println(":::::::End of line 2");
        //  ::::::::::::::::::::::::::::::::::::::::::::::::::::::
        //  Staring tests for the method
        int passed=0;
        int failed=0;
        String result = aNumber.primeRange(25);
//        System.out.println(result);
        String expectedResult="1,2,3,5,7,11,13,17,19,23,";
        if(result.equals(expectedResult)){
            System.out.println("Test PrimeNumber Range for some positive number: PASSED");
            passed++;
        }else{
            System.out.println("Test PrimeNumber Range some positive number: FAILED");
            failed++;
        }

        result = aNumber.primeRange(1);
//        System.out.println(result);
        expectedResult="1,";
        if(result.equals(expectedResult)){
            System.out.println("Test PrimeNumber Range for 1: PASSED");
            passed++;
        }else{
            System.out.println("Test PrimeNumber Range for 1: FAILED");
            failed++;
        }
        result = aNumber.primeRange(2);
        expectedResult="1,2,";
        if(result.equals(expectedResult)){
            System.out.println("Test PrimeNumber Range for 2: PASSED");
            passed++;
        }else{
            System.out.println("Test PrimeNumber Range for 2: FAILED");
            failed++;
        }


        System.out.println("::::  T E S T    R E P O R T ::::::");
        System.out.println("Total passed: "+passed);
        System.out.println("Total failed: "+failed);
        System.out.println("Total testcases: "+(passed+failed));

    }
}

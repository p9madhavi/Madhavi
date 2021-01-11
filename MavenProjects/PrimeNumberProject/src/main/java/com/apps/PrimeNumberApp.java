package com.apps;

import com.examples.PrimeNumber;

public class PrimeNumberApp {
    public static void main(String[] args) {

        PrimeNumber aNumber = new PrimeNumber();
        boolean result ;
        String outputRange;
        result = aNumber.isPrime(17);
        System.out.println("The result is :" + result);
        result = aNumber.isPrime(25);
        System.out.println("The result is :" + result);
        outputRange = aNumber.primeRange(50);
        System.out.println("The PrimeNumbersRange is : " + outputRange);
    }

}

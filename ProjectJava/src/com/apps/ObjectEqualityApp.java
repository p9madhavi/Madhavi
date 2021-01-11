package com.apps;

import com.domain.Address;

public class ObjectEqualityApp {

    public static void main(String[] args) {
        Address oneAddress = new Address();
        Address secondAddress = new Address();

        if(oneAddress.equals(secondAddress)){
            System.out.println("oneAddress is equal to secondAddress");
        }else{
            System.out.println("oneAddress is not equal to secondAddress");
        }

        oneAddress.setName("Madhavi");
        oneAddress.setStreet("123 davis dr");
        oneAddress.setCity("cary");
        oneAddress.setState("nc");

        secondAddress.setName("Madhavi");
        secondAddress.setStreet("123 davis dr");
        secondAddress.setCity("cary");
        secondAddress.setState("nc");

        if(oneAddress.equals(secondAddress)){
            System.out.println("oneAddress is equal to secondAddress");
        }else{
            System.out.println("oneAddress is not equal to secondAddress");
        }
    }
}
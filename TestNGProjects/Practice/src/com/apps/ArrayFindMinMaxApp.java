package com.apps;

import com.examples.ArrayFindMinMax;

public class ArrayFindMinMaxApp {
    public static void main(String[] args) {

        ArrayFindMinMax aNumber = new ArrayFindMinMax();
        int minNumber=0;
        int maxNumber=0;

        minNumber =  aNumber.findMax();
        System.out.println("The MaxNumber is ::" + maxNumber);

        maxNumber = aNumber.findMin();
        System.out.println("The Min Number is ::" + minNumber);

    }
}

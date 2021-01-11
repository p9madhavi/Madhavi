package com.examples;

public class ArrayFindMinMax {

    int[] intArray = {104,45,89,12,78,30,1,112,29,52};

    public int findMax(){

        int maxNumber = intArray[0];

        for(int i=0;i<intArray.length;i++){
            if(intArray[i] > maxNumber){
                maxNumber = intArray[i];
            }
        }
        return maxNumber;

    }
    public int findMin(){

        int minNumber = intArray[0];

        for(int i=0;i<intArray.length;i++){
            if(intArray[i] < minNumber){
                minNumber = intArray[i];
            }
        }
        return minNumber;
    }
}


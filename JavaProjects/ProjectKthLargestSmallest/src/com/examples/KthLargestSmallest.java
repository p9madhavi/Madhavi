package com.examples;

import com.exceptions.NotAValidIndex;

public class KthLargestSmallest {

    int[] integerArray = {45, 78, 24, 93, 156, 212, 38,90,3,55};
    //       3 24 38 45 55 78 90 93 156 212

    public int findKthLargest(int k) throws NotAValidIndex {

        if(k<=0 || k>integerArray.length) {
            throw new NotAValidIndex();
        }

        int kthlargestNumber=0;
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = i + 1; j < integerArray.length; j++) {
                if (integerArray[i] < integerArray[j]){
                    int temp = integerArray[i];
                    integerArray[i]=integerArray[j];
                    integerArray[j]=temp;
                }
            }
            if(i==k-1){
                kthlargestNumber = integerArray[i];
//                System.out.println("The " + k +" th largest element is:: " + integerArray[i]);
                break;
            }

        }
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
//        for(int i=0;i<integerArray.length;i++){
//            System.out.print(integerArray[i]+ "  ");
//        }
        return kthlargestNumber;
    }

    public int findKthSmallest(int k) throws NotAValidIndex {

        if(k<=0 || k>integerArray.length) {
            throw new NotAValidIndex();
        }
         
         int kthsmallestNumber = 0;
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = i + 1; j < integerArray.length; j++) {
                if (integerArray[i] > integerArray[j]){
                    int temp = integerArray[i];
                    integerArray[i]=integerArray[j];
                    integerArray[j]=temp;
                }
            }
            if(i==k-1){
                kthsmallestNumber = integerArray[i];
                System.out.println("The " + k +" th smallest element is:: " + integerArray[i]);
                break;
            }

        }
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
//        for(int i=0;i<integerArray.length;i++){
//            System.out.print(integerArray[i]+ "  ");
//        }
        return kthsmallestNumber;

    }
}

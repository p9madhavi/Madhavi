package com.examples;

public class PrimeNumber {

    int remainder=0;

    public boolean isPrime(int number){
        boolean result =false;
        for(int counter=2;counter<=number -1;counter++){
            if(number%counter == 0){
                remainder = remainder + 1;
//                result = true;
            }
        }
        if(remainder <=0) {
            result = true;
        }
        return result;

//        if(remainder >0) {
////            System.out.println("The Number You entered is not a primenumber");
//            return result;
//        }
//        else {
////            System.out.println("The Number You entered is  a primenumber");
//            result = true;
//            return result = true;
//        }
    }

    public String primeRange(int number){
        String result="";
        for(int i=1;i<=number;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j ==0){
                    remainder = remainder +1;
                }
            }if(remainder == 0) {
//                System.out.println(i);
                result = result+i+",";
            }else
                remainder=0;
        }
        return result;
    }
}

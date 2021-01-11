package com.examples;

public class PrimeNumber {

    int remainder=0;

    public void isPrime(int number){
        for(int counter=2;counter<=number -1;counter++){
            if(number%counter == 0){
                remainder = remainder + 1;
            }
        }
        if(remainder >0)
            System.out.println("The Number You entered is not a primenumber");
        else
            System.out.println("The Number You entered is  a primenumber");
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

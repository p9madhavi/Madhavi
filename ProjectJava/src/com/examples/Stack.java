package com.examples;

import com.exceptions.CanNotPop;
import com.exceptions.CanNotPush;

public class Stack {

    String[] stackOfCDs = new String[7];
    int counter =0;

    public void push(String newCD) throws CanNotPush{
        if(counter < stackOfCDs.length){

                stackOfCDs[counter] = newCD;
                counter++;

        } else{
            throw new CanNotPush();
        }
    }
    public String pop() throws CanNotPop{
//        String cdToBeRetrieved= null;
        if(counter-1>=0){

                String cdToBeRetrieved = stackOfCDs[counter-1];
                counter--;
                stackOfCDs[counter]=null;
                return cdToBeRetrieved;

        }else{
            throw new CanNotPop();
        }

    }

    public void showStack(){
        for (int counter = 0; counter < stackOfCDs.length; counter++) {
            if (stackOfCDs[counter] != null && (!stackOfCDs[counter].isEmpty())){
                System.out.println("The  " + (counter+1)+"  th CD Is:::  " + stackOfCDs[counter]);
            }
        }
    }




}

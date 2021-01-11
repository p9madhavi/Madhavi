package com.examples;

import com.exceptions.CanNotJoin;

public class Queue {

    String[] queueOfTickets = new String[7];
    int counter = 0;

    public void join(String newTicket) throws CanNotJoin {

        if(counter<queueOfTickets.length){
            queueOfTickets[counter] = newTicket;
            counter++;
        }else{
            throw new CanNotJoin();
        }

    }

    public void showQueue(){
        for(counter=0;counter<queueOfTickets.length;counter++){

            if(queueOfTickets[counter]!=null && !(queueOfTickets[counter].isEmpty())){

               System.out.println("The "+ (counter+1) +"  the ticket is::: " +queueOfTickets[counter] );
           }
       }
    }


}



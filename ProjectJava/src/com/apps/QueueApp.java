package com.apps;

import com.examples.Queue;
import com.exceptions.CanNotJoin;

public class QueueApp {

    public static void main(String[] args) {

        Queue aQueue = new Queue();
        try{
            aQueue.join("A10");
        }catch (CanNotJoin aExp){
            System.out.println("Queue is full,not able to join any other tickets");
        }
//        aQueue.showQueue();
        try{
            aQueue.join("B10");
        }catch (CanNotJoin aExp){
            System.out.println("Queue is full,not able to join any other tickets");
        }
//        aQueue.showQueue();
        try{
            aQueue.join("C10");
        }catch (CanNotJoin aExp){
            System.out.println("Queue is full,not able to join any other tickets");
        }
        try{
            aQueue.join("D10");
        }catch (CanNotJoin aExp){
            System.out.println("Queue is full,not able to join any other tickets");
        }
        try{
            aQueue.join("E10");
        }catch (CanNotJoin aExp){
            System.out.println("Queue is full,not able to join any other tickets");
        }
        try{
            aQueue.join("F10");
        }catch (CanNotJoin aExp){
            System.out.println("Queue is full,not able to join any other tickets");
        }
        try{
            aQueue.join("G10");
        }catch (CanNotJoin aExp){
            System.out.println("Queue is full,not able to join any other tickets");
        }
        try{
            aQueue.join("H10");
        }catch (CanNotJoin aExp){
            System.out.println("Queue is full,not able to join any other tickets");
        }
        try{
            aQueue.join("I10");
        }catch (CanNotJoin aExp){
            System.out.println("Queue is full,not able to join any other tickets");
        }
        aQueue.showQueue();

    }
}

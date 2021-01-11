package com.apps;

import com.examples.Stack;
import com.exceptions.CanNotPop;
import com.exceptions.CanNotPush;

public class StackApp {
    public static void main(String[] args) {

        Stack aStack = new Stack();
        try {
            aStack.push("Algebra");
        }catch (CanNotPush aExp){
            System.out.println("The stack is full and you cannot place anymorecd's");
        }
//        aStack.showStack();
        try {
            aStack.push("Trignometry");
        }catch (CanNotPush aExp){
            System.out.println("The stack is full and you cannot place anymorecd's");
        }
        try {
            aStack.push("Fractions");
        }catch (CanNotPush aExp){
            System.out.println("The stack is full and you cannot place anymorecd's");
        }
        try {
            aStack.push("Geometry");
        }catch (CanNotPush aExp){
            System.out.println("The stack is full and you cannot place anymorecd's");
        }
        try {
            aStack.push("Measurements");
        }catch (CanNotPush aExp){
            System.out.println("The stack is full and you cannot place anymorecd's");
        }
        try {
            aStack.push("Shapes");
        }catch (CanNotPush aExp){
            System.out.println("The stack is full and you cannot place anymorecd's");
        }
        try {
            aStack.push("Volume");
        }catch (CanNotPush aExp){
            System.out.println("The stack is full and you cannot place anymorecd's");
        }
        try {
            aStack.push("Addition");
        }catch (CanNotPush aExp){
            System.out.println("The stack is full and you cannot place anymorecd's");
        }
        try {
            aStack.push("Multiplication");
        }catch (CanNotPush aExp){
            System.out.println("The stack is full and you cannot place anymorecd's");
        }
        aStack.showStack();

        System.out.println("###################################");
        String retrievedCD = null;

        try{
            retrievedCD = aStack.pop();
            System.out.println("The CD from the stack is::  " + retrievedCD);
        }catch(CanNotPop aExp){
            System.out.println("The Stack is empty,No more CD's in the stack");
        }
//        aStack.showStack();
        try{
            retrievedCD = aStack.pop();
            System.out.println("The CD from the stack is::  " + retrievedCD);
        }catch(CanNotPop aExp){
            System.out.println("The Stack is empty,No more CD's in the stack");
        }
        try{
            retrievedCD = aStack.pop();
            System.out.println("The CD from the stack is::  " + retrievedCD);
        }catch(CanNotPop aExp){
            System.out.println("The Stack is empty,No more CD's in the stack");
        }
        try{
            retrievedCD = aStack.pop();
            System.out.println("The CD from the stack is::  " + retrievedCD);
        }catch(CanNotPop aExp){
            System.out.println("The Stack is empty,No more CD's in the stack");
        }
//        aStack.showStack();
        try{
            retrievedCD = aStack.pop();
            System.out.println("The CD from the stack is::  " + retrievedCD);
        }catch(CanNotPop aExp){
            System.out.println("The Stack is empty,No more CD's in the stack");
        }
        try{
            retrievedCD = aStack.pop();
            System.out.println("The CD from the stack is::  " + retrievedCD);
        }catch(CanNotPop aExp){
            System.out.println("The Stack is empty,No more CD's in the stack");
        }
        try{
            retrievedCD = aStack.pop();
            System.out.println("The CD from the stack is::  " + retrievedCD);
        }catch(CanNotPop aExp){
            System.out.println("The Stack is empty,No more CD's in the stack");
        }
        try{
            retrievedCD = aStack.pop();
            System.out.println("The CD from the stack is::  " + retrievedCD);
        }catch(CanNotPop aExp){
            System.out.println("The Stack is empty,No more CD's in the stack");
        }
        try{
            retrievedCD = aStack.pop();
            System.out.println("The CD from the stack is::  " + retrievedCD);
        }catch(CanNotPop aExp){
            System.out.println("The Stack is empty,No more CD's in the stack");
        }
    }
}

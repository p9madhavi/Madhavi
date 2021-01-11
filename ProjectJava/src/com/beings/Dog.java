package com.beings;

public class Dog extends Animal{

    @Override
    public void says() {
        System.out.println("woof!woof!");
    }

    @Override
    public String toString() {
        String returnString="Legs: ".concat(this.noOfLegs+" hasTail?:"+this.hasTail);

        return returnString;
    }

}

package com.beings;

abstract public class Animal {
    protected int noOfLegs=4;
    protected boolean hasTail=true;

    public void showProperties(){
        System.out.println("Legs: "+noOfLegs+" tail?:"+hasTail);
    }

    abstract public void says();


}

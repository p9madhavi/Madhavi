package com.examples;

public class TestObject {

    String [] names= new String[2];

    public TestObject(){
        names[0]= new String("");
        names[1]=null;
    }

    public void printLengths(){
        for(int i=0;i<names.length;i++) {
            if(names[i]!=null)
                System.out.println("length of " + i + " string is: " + names[i].isEmpty());
        }
    }
}

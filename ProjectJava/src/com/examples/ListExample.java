package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    // decalre the list
    List<String> aStringList = new ArrayList<String>();

    public void demoAdd(){
        System.out.println("The size of the list in ADD before: "+aStringList.size());
        aStringList.add("john");
        aStringList.add("mark");
        aStringList.add("lisa");
        aStringList.add("john");
        System.out.println("The size of the list in ADD after: "+aStringList.size());
    }

    public void demoRemove(){
        System.out.println("The size of the list in REMOVE before: "+aStringList.size());
        aStringList.remove("mark");
        aStringList.remove("robert");
        System.out.println("The size of the list in REMOVE after: "+aStringList.size());
    }

    public void demoIsEmpty(){

        if(aStringList.isEmpty())
            System.out.println("List is empty");
        else
            System.out.println("list is not empty");
        System.out.println("The list size in isempty method  after ::" + aStringList.size());

        aStringList.remove("lisa");
        aStringList.remove("john");
        aStringList.remove("john");

        if(aStringList.isEmpty())
            System.out.println("List is empty");
        else
            System.out.println("list is not empty");
        System.out.println("The list size in isempty method  after ::" + aStringList.size());
    }

    public void demoContains() {

        boolean result = aStringList.contains("robert");
//        result = aStringList.contains("lisa");

        if(result)
            System.out.println("The element is there :" +result);
        else
            System.out.println("The element is not there :" +result);

    }

    public void demoClear(){
        System.out.println("The size of the list  before clear() : "+aStringList.size());
        aStringList.clear();
        System.out.println("The size of the list  after clear() : "+aStringList.size());
    }


        public void demoIterate () {
            System.out.println("*******Using Regular For Loop**************");
            for (int i = 0; i < aStringList.size(); i++)
                System.out.println("The value in " + i + " position is: " + aStringList.get(i));

            System.out.println("********* For Loop Variation ************");
            for (String aString : aStringList)
                System.out.println("The value is: " + aString);

            System.out.println("*********Using Iterator (While Loop) ************");
            Iterator<String> anIterator = aStringList.iterator();
            while (anIterator.hasNext()) {
                System.out.println("The value is from iterator: " + anIterator.next());
            }

        }

    }



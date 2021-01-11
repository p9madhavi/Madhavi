package com.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    Set<String> aStringSet = new HashSet<String>();

    public void demoAdd(){
        System.out.println("The set size in ADD method  before ::" + aStringSet.size());
        aStringSet.add("720McRaeRoad");
        aStringSet.add("820Methevendrive");
        aStringSet.add("670WaldoRoad");
        aStringSet.add("440FirthGlendrive");
        aStringSet.add("720McRaeRoad");
        System.out.println("The set size in ADD method after::" + aStringSet.size());
    }

    public void demoRemove(){

        System.out.println("The set size in Remove method  before ::" + aStringSet.size());
        aStringSet.remove("820Methevendrive");
        aStringSet.remove("780Methevendrive");

        System.out.println("The set size in Remove method  after ::" + aStringSet.size());
    }

    public void demoIsEmpty(){

        if(aStringSet.isEmpty())
            System.out.println("The set is empty");
        else
            System.out.println("the set is not empty");

        System.out.println("The set size in Isempty method before ::" + aStringSet.size());


        aStringSet.remove("720McRaeRoad");
        aStringSet.remove("670WaldoRoad");
        aStringSet.remove("440FirthGlendrive");

        if(aStringSet.isEmpty())
            System.out.println("The set is empty");
        else
            System.out.println("the set is not empty");

        System.out.println("The set size in isempty method  after ::" + aStringSet.size());
    }

    public void demoContains(){

        boolean result = aStringSet.contains("720McRaeRoad");

        if(result)
            System.out.println("The element is there ::" +result);
        else
            System.out.println("The element is not there :" +result);

    }

    public void demoClear(){
        System.out.println("The size of the set  before clear() : "+aStringSet.size());
        aStringSet.clear();
        System.out.println("The size of the set  after clear() : "+aStringSet.size());
    }

    public void demoIterate(){

//        for(int i=0;i<aStringSet.size();i++)
//            System.out.println("The Value in   " +i+" position is ::" + aStringSet.get(i));
        System.out.println("**************** Using for loop varaition ****************");
        for(String aString : aStringSet){
            System.out.println("The value of String is:::" +aString);
        }
        System.out.println("**************** Using Iterator(While Loop) ****************");
        Iterator<String> anIterator = aStringSet.iterator();
        while (anIterator.hasNext())
            System.out.println("The Value of string is :: " + anIterator.next());
    }
}

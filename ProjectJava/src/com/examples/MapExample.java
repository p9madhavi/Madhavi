package com.examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    Map<Integer, String> monthMap = new HashMap<Integer, String>();

    public void demoAdd(){
        System.out.println("Size of map in put before: "+monthMap.size());
        monthMap.put(new Integer(1),new String("January"));
        monthMap.put(new Integer(2),new String("February"));
        monthMap.put(new Integer(3),new String("March"));
        monthMap.put(new Integer(4),new String("April"));
        monthMap.put(new Integer(5),new String("May"));
        monthMap.put(new Integer(6),new String("June"));
        monthMap.put(new Integer(7),new String("July"));
        monthMap.put(new Integer(8),new String("August"));
        monthMap.put(new Integer(9),new String("Sepetember"));
        monthMap.put(new Integer(10),new String("October"));
        monthMap.put(new Integer(11),new String("November"));
        monthMap.put(new Integer(12),new String("December"));
        System.out.println("Size of map in put after: "+monthMap.size());
    }

    public void demoGet(){
        String month = monthMap.get(new Integer(2));
        System.out.println("Month name for 2 is: "+month);
        month = monthMap.get(new Integer(1));
        System.out.println("Month name for 1 is: "+month);
        month = monthMap.get(new Integer(2));
        System.out.println("Month name for 2 is: "+month);
        month = monthMap.get(new Integer(5));
        System.out.println("Month name for 5 is: "+month);
        month = monthMap.get(new Integer(10));
        System.out.println("Month name for 10 is: "+month);
        month = monthMap.get(new Integer(3));
        System.out.println("Month name for 3 is: "+month);
    }

    public void demoIterate(){
        for(Map.Entry<Integer, String> anEntry : monthMap.entrySet()){
            System.out.println("The key: "+anEntry.getKey()+" the value is: "+anEntry.getValue());
        }
    }

}

package com.apps;

import com.examples.MonthFinder;

public class MonthFinderApp{

	public static void main(String[] args) {

		MonthFinder aMonthFinder = new MonthFinder();
        
        // test case 1
        aMonthFinder.findMonth(1);
        // test case 2
        aMonthFinder.findMonth(2);
        // test case 3
        aMonthFinder.findMonth(3);
        // test case 4
        aMonthFinder.findMonth(4);
        // test case 5
        aMonthFinder.findMonth(5);
         // test case 6
        aMonthFinder.findMonth(6);
         // test case 7
        aMonthFinder.findMonth(7);
         // test case 8
        aMonthFinder.findMonth(8);
         // test case 9
        aMonthFinder.findMonth(9);
         // test case 10
        aMonthFinder.findMonth(10);
         // test case 11
        aMonthFinder.findMonth(11);
         // test case 12
        aMonthFinder.findMonth(12);
       // test case 13
        aMonthFinder.findMonth(-1);
         // test case 14
        aMonthFinder.findMonth(-8);
         // test case 15
        aMonthFinder.findMonth(-12);
         // test case 16
        aMonthFinder.findMonth(13);
        // test case 17
        aMonthFinder.findMonth(15);
         // test case 18
        aMonthFinder.findMonth(25);

       System.out.println("Now testing MONTHFINDER BY SWITCH");

        // test case 1
        aMonthFinder.findMonthBySwitch(1);
        // test case 2
        aMonthFinder.findMonthBySwitch(2);
        // test case 3
        aMonthFinder.findMonthBySwitch(3);
        // test case 4
        aMonthFinder.findMonthBySwitch(4);
        // test case 5
        aMonthFinder.findMonthBySwitch(5);
         // test case 6
        aMonthFinder.findMonthBySwitch(6);
        // test case 7
        aMonthFinder.findMonthBySwitch(7);
        // test case 8
        aMonthFinder.findMonthBySwitch(8);
        // test case 9
        aMonthFinder.findMonthBySwitch(9);
        // test case 10
        aMonthFinder.findMonthBySwitch(10);
         // test case 11
        aMonthFinder.findMonthBySwitch(11);
        // test case 12
        aMonthFinder.findMonthBySwitch(12);
        // test case 13
        aMonthFinder.findMonthBySwitch(-1);
        // test case 14
        aMonthFinder.findMonthBySwitch(-8);
        // test case 15
        aMonthFinder.findMonthBySwitch(-12);
        // test case 16
        aMonthFinder.findMonthBySwitch(13);
        // test case 17
        aMonthFinder.findMonthBySwitch(15);
        // test case 18
        aMonthFinder.findMonthBySwitch(25);

	}
}


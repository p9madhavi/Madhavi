package com.tests;

import com.examples.MonthFinderByMap;
import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.expectedexceptions.ExpectedExceptionsTest;

public class TestNegative {
    MonthFinderByMap aMonthFinder;
    String monthName;

    @BeforeTest
    public void setUp(){

        aMonthFinder = new MonthFinderByMap();
    }

    @Test(expectedExceptions = NotAValidMonthNumber.class)
    public void testNegativeMonth() throws NotAValidMonthNumber, NotEvenANumber {
        aMonthFinder.findMonth("-5");
    }

    @Test(expectedExceptions = NotAValidMonthNumber.class)
    public void testHundredMonth() throws NotAValidMonthNumber, NotEvenANumber {
        aMonthFinder.findMonth("100");
    }

    @Test(expectedExceptions = NotAValidMonthNumber.class)

    public void testAnotherNegativeMonth() throws NotAValidMonthNumber, NotEvenANumber {
        aMonthFinder.findMonth("-115");
    }

    @Test(expectedExceptions = NotAValidMonthNumber.class)
    public void testEighteenMonth() throws NotAValidMonthNumber, NotEvenANumber {
        aMonthFinder.findMonth("18");
    }

    @Test(expectedExceptions = NotEvenANumber.class)
    public void testStringMonth() throws NotAValidMonthNumber, NotEvenANumber {
        aMonthFinder.findMonth("testNG");
    }
}

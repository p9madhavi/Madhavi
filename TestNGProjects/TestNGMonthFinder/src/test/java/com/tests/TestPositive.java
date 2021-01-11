package com.tests;

import com.examples.MonthFinderByMap;
import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPositive {

    MonthFinderByMap aMonthFinder;
    String monthName;

    @BeforeTest
    public void setUp(){
        aMonthFinder = new MonthFinderByMap();
    }

    @Test
    public void testJanuary() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("1");
        Assert.assertEquals(monthName, "January");
    }
    @Test
    public void testFebruary() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("2");
        Assert.assertEquals(monthName, "February");
    }
    @Test
    public void testMarch() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("3");
        Assert.assertEquals(monthName, "March");
    }
    @Test
    public void testApril() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("4");
        Assert.assertEquals(monthName, "April");
    }
    @Test
    public void testMay() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("5");
        Assert.assertEquals(monthName, "May");
    }
    @Test
    public void testJune() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("6");
        Assert.assertEquals(monthName, "June");
    }
    @Test
    public void testJuly() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("7");
        Assert.assertEquals(monthName, "July");
    }
    @Test
    public void testAugust() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("8");
        Assert.assertEquals(monthName, "August");
    }
    @Test
    public void testSeptember() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("9");
        Assert.assertEquals(monthName, "September");
    }
    @Test
    public void testOctober() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("10");
        Assert.assertEquals(monthName, "October");
    }
    @Test
    public void testNovember() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("11");
        Assert.assertEquals(monthName, "November");
    }
    @Test
    public void testDecember() throws NotAValidMonthNumber, NotEvenANumber {
        monthName = aMonthFinder.findMonth("12");
        Assert.assertEquals(monthName, "December");
    }

}

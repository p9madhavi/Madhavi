package com.tests;


import com.examples.NumberSearch;
import com.exceptions.NotFound;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPositive {

    NumberSearch aSearchNumber;
    int index;

    @BeforeTest
    public void setUp(){
        aSearchNumber = new NumberSearch();
    }

    @Test
    public void searchNumberInBetween() throws NotFound {
        index = aSearchNumber.findNumber(156);
        Assert.assertEquals(index, 4);
//        Assert.assertEquals(aSearchNumber.findNumber(156), 4);
    }
    @Test
    public void searchNumberMiddle() throws NotFound {

        Assert.assertEquals(aSearchNumber.findNumber(-93), 3);
    }
    @Test
    public void searchNumberStart() throws NotFound {

        Assert.assertEquals(aSearchNumber.findNumber(45), 0);
    }
    @Test
    public void searchNumberEnd() throws NotFound {

        Assert.assertEquals(aSearchNumber.findNumber(38), 6);
    }
    @Test
    public void SearchMaximumNumber() {
        int maxNumber = aSearchNumber.findMax();
        Assert.assertEquals(maxNumber, 21289);
    }
    @Test
    public void searchMinimumNumber() {
        int minNumber = aSearchNumber.findMin();
        Assert.assertEquals(minNumber, -156);
    }






}

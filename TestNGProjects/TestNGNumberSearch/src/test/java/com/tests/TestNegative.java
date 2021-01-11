package com.tests;

import com.examples.NumberSearch;
import com.exceptions.NotFound;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNegative {

    NumberSearch aSearchNumber;
    int index;

    @BeforeTest
    public void setUp(){
        aSearchNumber = new NumberSearch();
    }

    @Test(expectedExceptions = NotFound.class)
    public void testWrongIndex() throws NotFound{
       aSearchNumber.findNumber(211);
    }
    @Test(expectedExceptions = NotFound.class)
    public void testAnotherWrongIndex() throws NotFound{
        aSearchNumber.findNumber(-23);
    }
}

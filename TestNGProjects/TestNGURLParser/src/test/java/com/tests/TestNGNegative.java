package com.tests;

import com.examples.URLFormatObject;
import com.examples.URLParser;
import com.exceptions.NotAValidFormat;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGNegative {

    URLParser aParser;
    URLFormatObject aFormatObject;

    @BeforeTest
    public void setup() {
        aParser = new URLParser();
    }

    @Test(expectedExceptions = NotAValidFormat.class)
    public void testWrongUrlFormateone() throws NotAValidFormat {
        aParser.parseURL("http://autotools");
    }
    @Test(expectedExceptions = NotAValidFormat.class)
    public void testWrongUrlFormattwo() throws NotAValidFormat {
        aParser.parseURL("http://www.kubecloudsinc/autotools");
    }
    @Test(expectedExceptions = NotAValidFormat.class)
    public void testWrongUrlFormatthree() throws NotAValidFormat {
        aParser.parseURL("http://24.106:10080/autotools");
    }

}

package com.tests;

import com.examples.URLFormatObject;
import com.examples.URLParser;
import com.exceptions.NotAValidFormat;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGPositive {

        URLParser aParser;
        URLFormatObject aFormatObject;

        @BeforeTest
        public void setup() {
                aParser = new URLParser();
        }

        @Test
        public void testDomainNameUrl() throws NotAValidFormat {
                aFormatObject = aParser.parseURL("http://www.kubecloudsinc.com/autotools");
                Assert.assertEquals(aFormatObject.toString(), "URLFormatObject{url='http://www.kubecloudsinc.com/autotools', protocol='http', domainName='www.kubecloudsinc.com', path='autotools', ipAddress='null', portNumber='null'}");

        }
        @Test
        public void testIpAddressUrl() throws NotAValidFormat {
                aFormatObject = aParser.parseURL("http://24.106.206.2:10080/autotools");
                Assert.assertEquals(aFormatObject.toString(), "URLFormatObject{url='http://24.106.206.2:10080/autotools', protocol='http', domainName='null', path='autotools', ipAddress='24.106.206.2', portNumber='10080'}");
        }

}


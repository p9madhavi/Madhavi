package com.apps;

import com.examples.URLFormatObject;
import com.examples.URLParser;
import com.exceptions.NotAValidFormat;

public class URLParserApp {
    public static void main(String[] args) {

        URLParser aParser = new URLParser();
        URLFormatObject aParsedObject ;
        int passed=0;
        int failed=0;
        String expectedOutput;
        try{
            aParsedObject = aParser.parseURL("http://www.kubecloudsinc.com/autotools");
//             aParsedObject.showURLFormatObject();
//            System.out.println(aParsedObject.toString());
            expectedOutput=
                    "URLFormatObject{url='http://www.kubecloudsinc.com/autotools', protocol='http', domainName='www.kubecloudsinc.com', path='autotools', ipAddress='null', portNumber='null'}";
            if(aParsedObject.toString().equals(expectedOutput)){
                System.out.println("Test for the correctUrl with domain passed::: Passed ");
                passed++;
            }else{
                System.out.println("Test for the correctUrl with domain failed::: Failed ");
                failed++;
            }
//            System.out.println("toString is ::" +result);
        }catch (NotAValidFormat aExp){
            System.out.println("The URL format that you entered is an Invalid Format");
        }
        expectedOutput ="URLFormatObject{url='http://24.106.206.2:10080/autotools', protocol='http', domainName='null', path='autotools', ipAddress='24.106.206.2', portNumber='10080'}";
        try{
            aParsedObject = aParser.parseURL("http://24.106.206.2:10080/autotools");
//            aParsedObject.showURLFormatObject();
            if(aParsedObject.toString().equals(expectedOutput)){
                System.out.println("Test for the correctUrl with ipAddress passed::: Passed ");
                passed++;
            }else{
                System.out.println("Test for the correctUrl with ipAddress failed::: Failed ");
                failed++;
            }
        }catch (NotAValidFormat aExp){
            System.out.println("The URL format that you entered is an Invalid Format");
        }

        String url = null;
        try{
            aParsedObject = aParser.parseURL("http://autotools");
            aParsedObject.showURLFormatObject();
        }catch (NotAValidFormat aExp){
//            System.out.println("The URL format that you entered is an Invalid Format");
            url="InvalidFormat";
        }
        String expectedUrl = "InvalidFormat";
        if(url.equals(expectedUrl)){
            System.out.println("Test for the wrongUrl passed::: Passed ");
            passed++;
        }else {
            System.out.println("Test for the wrongUrl failed::: Failed ");
            failed++;
        }

        try{
            aParsedObject = aParser.parseURL("http://www.kubecloudsinc/autotools");
            aParsedObject.showURLFormatObject();
        }catch (NotAValidFormat aExp){
//          System.out.println("The URL format that you entered is an Invalid Format");
            url="InvalidFormat";
        }
        expectedUrl = "InvalidFormat";
        if(url.equals(expectedUrl)){
            System.out.println("Test for the wrongUrl passed::: Passed ");
            passed++;
        }else {
            System.out.println("Test for the wrongUrl failed::: Failed ");
            failed++;
        }

        try{
            aParsedObject = aParser.parseURL("http://24.106:10080/autotools");
            aParsedObject.showURLFormatObject();
        }catch (NotAValidFormat aExp){
//            System.out.println("The URL format that you entered is an Invalid Format");
            url="InvalidFormat";
        }
        expectedUrl = "InvalidFormat";
        if(url.equals(expectedUrl)){
            System.out.println("Test for the wrongUrl passed::: Passed ");
            passed++;
        }else {
            System.out.println("Test for the wrongUrl failed::: Failed ");
            failed++;
        }

        System.out.println("::::  T E S T    R E P O R T   F O R   U R L P A R S E R   ::::::");
        System.out.println("Total passed: "+passed);
        System.out.println("Total failed: "+failed);
        System.out.println("Total testcases for URLParser : "+(passed+failed));

    }
}

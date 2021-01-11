package com.apps;

import com.examples.URLFormatObject;
import com.examples.URLParser;
import com.exceptions.NotAValidFormat;

public class URLParserApp {
    public static void main(String[] args) {

        URLParser aParser = new URLParser();
        URLFormatObject aParsedObject ;
        try{
            aParsedObject = aParser.parseURL("http://www.kubecloudsinc.com/autotools");
            aParsedObject.showURLFormatObject();
        }catch (NotAValidFormat aExp){
            System.out.println("The URL format that you entered is an Invalid Format");
        }
//        URLFormatObject expectedParsedObject =
        try{
            aParsedObject = aParser.parseURL("http://24.106.206.2:10080/autotools");
            aParsedObject.showURLFormatObject();
        }catch (NotAValidFormat aExp){
            System.out.println("The URL format that you entered is an Invalid Format");
        }
        try{
            aParsedObject = aParser.parseURL("http://autotools");
            aParsedObject.showURLFormatObject();
        }catch (NotAValidFormat aExp){
            System.out.println("The URL format that you entered is an Invalid Format");
        }
        try{
            aParsedObject = aParser.parseURL("http://www.kubecloudsinc/autotools");
            aParsedObject.showURLFormatObject();
        }catch (NotAValidFormat aExp){
            System.out.println("The URL format that you entered is an Invalid Format");
        }
        try{
            aParsedObject = aParser.parseURL("http://24.106:10080/autotools");
            aParsedObject.showURLFormatObject();
        }catch (NotAValidFormat aExp){
            System.out.println("The URL format that you entered is an Invalid Format");
        }

    }
}

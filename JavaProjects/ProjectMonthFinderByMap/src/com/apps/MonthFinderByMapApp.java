package com.apps;

import com.examples.MonthFinderByMap;
import com.exceptions.NotAValidMonthNumber;
import com.exceptions.NotEvenANumber;
import com.utils.FileHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MonthFinderByMapApp {

    public static void main(String[] args) {

        List<String> linesToBeWritten = new ArrayList<String>();

        MonthFinderByMap aMonthFinder = new MonthFinderByMap();
        String monthName=null;
        int passed =0;
        int failed=0;

        try{
            monthName = aMonthFinder.findMonth("1");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
            linesToBeWritten.add("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        String expectedMonthName = "January";
        if(monthName.equals(expectedMonthName)){
            System.out.println(new Date()+"Test for the monthNumber 1: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 1: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("2");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "February";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 2: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 2: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("3");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "March";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 3: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 3: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("4");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "April";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 4: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 4: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("5");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "May";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 5: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 5: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("6");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "June";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 6: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 6: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("7");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "July";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 7: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 7: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("8");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "August";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 8: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 8: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("9");
//        System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "September";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 9: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 9: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("10");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "October";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 10: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 10: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("11");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "November";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 11: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 11: FAILED");
            failed++;
        }
        try{
            monthName = aMonthFinder.findMonth("12");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "December";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 12: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 12: FAILED");
            failed++;
        }
//        Important and Check thoroughly from here............

        try{
            monthName = aMonthFinder.findMonth("-5");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
            monthName = "NOTEVENANUMBER";
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
            monthName = "NOTAVALIDMONTHNUMBER";
        }
        expectedMonthName = "NOTAVALIDMONTHNUMBER";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber -5: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber -5: FAILED");
            failed++;
        }
        monthName=null;
        try{
            monthName = aMonthFinder.findMonth("115");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
            monthName = "NOTAVALIDMONTHNUMBER";
        }
        expectedMonthName = "NOTAVALIDMONTHNUMBER";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber 115: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber 115: FAILED");
            failed++;
        }
        monthName=null;
        try{
            monthName = aMonthFinder.findMonth("TreeMap");
//            System.out.println("monthName is ::" + monthName);
        }catch (NotEvenANumber aExp){
            System.out.println("The monthNumber you entered is not even a number");
            monthName="NOTEVENANUMBER";
        }catch (NotAValidMonthNumber aExp){
            System.out.println("The monthNumber you entered is not  a validmonthnumber");
        }
        expectedMonthName = "NOTEVENANUMBER";
        if(monthName.equals(expectedMonthName)){
            System.out.println("Test for the monthNumber TreeMap: PASSED");
            passed++;
        }else{
            System.out.println("Test for the monthNumber TreeMap: FAILED");
            failed++;
        }

        System.out.println(new Date()+"::::  T E S T    R E P O R T   F O R    M O N T H F I N D E R B Y M A P ::::::");
        System.out.println("Total passed: "+passed);
        System.out.println("Total failed: "+failed);
        System.out.println("Total testcases for MonthFinderByMap: "+(passed+failed));

    }
}

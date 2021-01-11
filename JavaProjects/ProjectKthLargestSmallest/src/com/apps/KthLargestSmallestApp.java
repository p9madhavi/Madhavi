package com.apps;

import com.examples.KthLargestSmallest;
import com.exceptions.NotAValidIndex;

public class KthLargestSmallestApp {

    public static void main(String[] args) {

        KthLargestSmallest aValue = new KthLargestSmallest();
        int outputValue=0;
        int passed =0;
        int failed = 0;
        try {
           outputValue = aValue.findKthLargest(1);
        }catch (NotAValidIndex aExp){
            System.out.println("You enter an Invalid Index");
        }
        int expectedOutPutValue = 212;
        if(expectedOutPutValue == outputValue){
            System.out.println("Test For FirstLargest Number is Passed::: Passed ");
            passed++;
        }else{
            System.out.println("Test For FirstLargest Number is Failed::: Failed ");
            failed++;
        }
        try {
            outputValue = aValue.findKthLargest(10);
            System.out.println("output:" +outputValue);
        }catch (NotAValidIndex aExp){
            System.out.println("You enter an Invalid Index");
        }
        expectedOutPutValue = 3;
        if(expectedOutPutValue == outputValue){
            System.out.println("Test For tenthLargest Number is Passed::: Passed ");
            passed++;
        }else{
            System.out.println("Test For tenthLargest Number is Failed::: Failed ");
            failed++;
        }

        try {
            outputValue = aValue.findKthLargest(5);
            System.out.println("output:" +outputValue);
        }catch (NotAValidIndex aExp){
            System.out.println("You enter an Invalid Index");
        }
        expectedOutPutValue = 78;
        if(expectedOutPutValue == outputValue){
            System.out.println("Test For fifthLargest Number is Passed::: Passed ");
            passed++;
        }else{
            System.out.println("Test For fifthLargest Number is Failed::: Failed ");
            failed++;
        }
        String output= null;
//        we can use integer,boolean or string datatypes ..
//        int a=0;
//        boolean catchExecuted=false;
        try {
            outputValue = aValue.findKthLargest(15);
            System.out.println("output:" +outputValue);
        }catch (NotAValidIndex aExp){
//            System.out.println("You enter an Invalid Index");
            output = "InvalidIndex";
//            a =5;
//            catchExecuted=true;
            System.out.println("output:" +output);
        }
         String expectedOutPut= "InvalidIndex";
//        int expectedInt=5;

//        if(catchExecuted){
//            // passed
//        }else{
//            // failed
//        }
//        if(expectedInt==5){
//            // passed
//        }else{
//            // failed.
//        }
        if(expectedOutPut.equals(output)){
            System.out.println("Test For 15thlargest Number is Passed::: Passed ");
            passed++;
        }else{
            System.out.println("Test For 15thLargest Number is Failed::: Failed ");
            failed++;
        }
        output= null;
        try {
            outputValue = aValue.findKthLargest(-5);
            System.out.println("output:" +outputValue);
        }catch (NotAValidIndex aExp){
//            System.out.println("You enter an Invalid Index");
            output = "InvalidIndex";
        }
        expectedOutPut = "InvalidIndex";
        if(expectedOutPutValue == outputValue){
            System.out.println("Test For -5 is Passed::: Passed ");
            passed++;
        }else{
            System.out.println("Test For -5 is Failed::: Failed ");
            failed++;
        }

        System.out.println("::::::::::::::::::::: S M A L L E S T ::::::::::::::::::::::::::::::");

        try {
            outputValue = aValue.findKthSmallest(1);
            System.out.println("output:" +outputValue);
        }catch (NotAValidIndex aExp){
            System.out.println("You enter an Invalid Index");
        }
        expectedOutPutValue = 3;
        if(expectedOutPutValue == outputValue){
            System.out.println("Test For firstSmallest Number is Passed::: Passed ");
            passed++;
        }else{
            System.out.println("Test For firstSmallest Number is Failed::: Failed ");
            failed++;
        }
        try {
            outputValue = aValue.findKthSmallest(5);
            System.out.println("output:" +outputValue);
        }catch (NotAValidIndex aExp){
            System.out.println("You enter an Invalid Index");
        }
        expectedOutPutValue = 55;
        if(expectedOutPutValue == outputValue){
            System.out.println("Test For fifthsmallest Number is Passed::: Passed ");
            passed++;
        }else{
            System.out.println("Test For fifthsmallest Number is Failed::: Failed ");
            failed++;
        }
        try {
            outputValue = aValue.findKthSmallest(10);
            System.out.println("output:" +outputValue);
        }catch (NotAValidIndex aExp){
            System.out.println("You enter an Invalid Index");
        }
        expectedOutPutValue = 212;
        if(expectedOutPutValue == outputValue){
            System.out.println("Test For tenthSmallest Number is Passed::: Passed ");
            passed++;
        }else{
            System.out.println("Test For tenthSmallest Number is Failed::: Failed ");
            failed++;
        }
        output=null;
        try {
            outputValue = aValue.findKthSmallest(15);
            System.out.println("output:" +outputValue);
        }catch (NotAValidIndex aExp){
//            System.out.println("You enter an Invalid Index");
            output = "InvalidIndex";
        }
        expectedOutPut = "InvalidIndex";
        if(expectedOutPutValue == outputValue){
            System.out.println("Test For 15th smallest Number is Passed::: Passed ");
            passed++;
        }else{
            System.out.println("Test For 15th smallest Number is Failed::: Failed ");
            failed++;
        }
        output= null;
        try {
            outputValue = aValue.findKthSmallest(-5);
            System.out.println("output:" +outputValue);
        }catch (NotAValidIndex aExp){
//            System.out.println("You enter an Invalid Index");
            output = "InvalidIndex";
        }
        expectedOutPut = "InvalidIndex";
        if(expectedOutPutValue == outputValue){
            System.out.println("Test For -5 is Passed::: Passed ");
            passed++;
        }else{
            System.out.println("Test For -5 is Failed::: Failed ");
            failed++;
        }




        System.out.println("::::  T E S T    R E P O R T   F O R    KTH LARGESTSMALLEST  ::::::");
        System.out.println("Total passed: "+passed);
        System.out.println("Total failed: "+failed);
        System.out.println("Total testcases for KthLARGESTSMALLEST: "+(passed+failed));
    }
}

package com.apps;

import com.examples.TuneFinderByMap;
import com.exceptions.NotAValidTuneNumber;
import com.exceptions.NotEvenANumber;

public class TuneFinderByMapApp {
    public static void main(String[] args) {

        TuneFinderByMap aTuneFinder = new TuneFinderByMap();
        String tuneName=null;

        try{
            tuneName = aTuneFinder.findTune("2");
            System.out.println("tune is ::" + tuneName);
        }catch (NotEvenANumber aExp){
            System.out.println("The tuneNumber you entered is not even a number");
        }catch (NotAValidTuneNumber aExp){
            System.out.println("The tuneNumber you entered is not  a validtunenumber");
        }
        try{
            tuneName = aTuneFinder.findTune("8");
            System.out.println("tune is ::" + tuneName);
        }catch (NotEvenANumber aExp){
            System.out.println("The tuneNumber you entered is not even a number");
        }catch (NotAValidTuneNumber aExp){
            System.out.println("The tuneNumber you entered is not  a validtunenumber");
        }
        try{
            tuneName = aTuneFinder.findTune("TreeMap");
            System.out.println("tune is ::" + tuneName);
        }catch (NotEvenANumber aExp){
            System.out.println("The tuneNumber you entered is not even a number");
        }catch (NotAValidTuneNumber aExp){
            System.out.println("The tuneNumber you entered is not  a validtunenumber");
        }
        try{
            tuneName = aTuneFinder.findTune("-3");
            System.out.println("tune is ::" + tuneName);
        }catch (NotEvenANumber aExp){
            System.out.println("The tuneNumber you entered is not even a number");
        }catch (NotAValidTuneNumber aExp){
            System.out.println("The tuneNumber you entered is not  a validtunenumber");
        }
        try{
            tuneName = aTuneFinder.findTune("12");
            System.out.println("tune is ::" + tuneName);
        }catch (NotEvenANumber aExp){
            System.out.println("The tuneNumber you entered is not even a number");
        }catch (NotAValidTuneNumber aExp){
            System.out.println("The tuneNumber you entered is not  a validtunenumber");
        }


    }
}

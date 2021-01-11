package com.apps;

import java.io.*;
import java.util.Properties;

public class PropertiesDemoApp {

    public static void main(String[] args) {

        System.out.println("insdie main");
        Properties props = new Properties();
        System.out.println("created props");
//        File aFile = new File("src\\main\\resources\\configFile.cfg");

               try {
//            Reader aReader = new FileReader(aFile);
//            props.load(aReader);
            System.out.println("about to create input");
            InputStream inputStream = new PropertiesDemoApp()
                    .getClass().getResourceAsStream("/configFile.cfg");
            props.load(inputStream);
            String noOfLines =  props.getProperty("noOfLines");
            System.out.println("nof Of lines: "+ noOfLines);

            String firstNumber = props.getProperty("firstNumber");
            System.out.println("First number:"+firstNumber);

        }catch (FileNotFoundException exp){
            System.out.println("File is not present");
        }catch (IOException exp){
            System.out.println("IO Exception");
        }
    }
}

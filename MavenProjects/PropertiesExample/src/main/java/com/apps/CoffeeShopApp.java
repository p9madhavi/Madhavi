package com.apps;

import com.modules.FileHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CoffeeShopApp {
    public static void main(String[] args) {

        Properties props = new Properties();
        File sampleFile = new File("C:\\Users\\Jagadeesh\\Madhavi\\Files\\CoffeeMenuFile.txt");
        File myFile = new File("src\\main\\resources\\coffeeMenu.cfg");
        File menuFile = new File("src\\main\\resources\\coffeeMenu.txt");
        List<String> lines = new ArrayList<String>();

        try {
            List<String> sampleLines = FileHelper.readFromFile(sampleFile);
            Reader aReader = new FileReader(myFile);
            props.load(aReader);

//            lines.add("::::::::::::::::::::::::::::");
//            lines.add("::::::: COFFEE MENU ::::::::");
//            lines.add("   Regular Coffee   $"+props.getProperty("americano"));
//            lines.add("   Cappucino\t\t$"+props.getProperty("cappucino"));
            for (String line : sampleLines){

                line = line.replace("{{rc}}",props.getProperty("regularCoffee"));
                line = line.replace("{{c}}",props.getProperty("cappucino"));
                line = line.replace("{{f}}",props.getProperty("frappucino"));
                line = line.replace("{{cl}}",props.getProperty("chaiLatte"));
                line = line.replace("{{a}}",props.getProperty("americano"));
                line = line.replace("{{e}}",props.getProperty("espresso"));
                line = line.replace("{{ht}}",props.getProperty("hottea"));
                line = line.replace("{{d}}",props.getProperty("doppio"));
                line = line.replace("{{lb}}",props.getProperty("longBlack"));

                lines.add(line);
            }

            String americano =  props.getProperty("americano");
            System.out.println("americano: "+ americano);

            String doppio = props.getProperty("doppio");
            System.out.println("doppio:"+doppio);
//            lines.add("\n");
//            lines.add("::::::::::::::::::::::::::");
//            lines.add("::::::::::::::::::::::::::");
            FileHelper.writeToFile(lines, menuFile);
        }catch (FileNotFoundException exp){
            System.out.println("File is not present");
        }catch (IOException exp){
            System.out.println("IO Exception");
        }

    }
}

package com.examples;

import com.domain.Person;
import com.exceptions.NotValidStringAddress;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class PersonCollectionSetFile {

    File personFile = new File("C:\\Users\\Jagadeesh\\Madhavi\\PersonFile.txt");
//    private Set<String> personStringSet = new TreeSet<String>();
    private Map<String, Integer> countCityMap = new HashMap<String, Integer>();
    private Set<Person> personSet = new TreeSet<Person>();


    public void populate() {
//        System.out.println("isnide popuilate");
        String GlobalString=null;
        try {
            //   cannot get Set since readlines gives List back
            //   so need to get List and convert it into Set
//            System.out.println("Filename: "+personFile.getName());
//            System.out.println("Filename: "+personFile.getAbsolutePath());
            List<String> linesList = FileUtils.readLines(personFile, StandardCharsets.US_ASCII);
//            System.out.println("::: printing lines start");
            for(String insideTryString : linesList){
                GlobalString = insideTryString;
//                System.out.println(GlobalString);
                try {
                    Person person = convertData(GlobalString);
                    personSet.add(person);
                } catch (NotValidStringAddress aExp) {
                    System.out.println("This string address is not valid :::" + GlobalString);
                }
            }
//            System.out.println("::: printing lines end");
        } catch (IOException aexp) {
            System.out.println("My file is bad I need to give to different file");
        }
    }

    private Person convertData(String personString) throws NotValidStringAddress {

        String[] personSplits = personString.split(",");
//        System.out.println("split total: " + personSplits.length);
        if (personSplits[0]==null || personSplits[0].isEmpty() ||
                personSplits[1]==null || personSplits[1].isEmpty() ||
                personSplits.length != 5) {
//            System.out.println("ABOUT TO THROW");
            throw new NotValidStringAddress();
        }
        Person aPerson = new Person();
        aPerson.setFirstName(personSplits[0]);
        aPerson.setLastName(personSplits[1]);
        aPerson.setOccupation(personSplits[2]);
        aPerson.setCity(personSplits[3].toUpperCase());
        aPerson.setAge(personSplits[4]);

        return aPerson;
    }


    public void printPersons() {

        List<String> stringsToWrite = new ArrayList<String>();
        for (Person aPerson : personSet) {
            //  for(int i=0;i<personSet.size();i++)
//            System.out.println(aPerson.toString());
            stringsToWrite.add(aPerson.toString());
        }
        System.out.println(":::ABOUT TO Write file");
        File outputFile = new File("C:\\Users\\Jagadeesh\\Madhavi\\PersonOutputFile.txt");
        try {
            FileUtils.writeLines(outputFile, stringsToWrite, true);
            System.out.println("....writing file.....");
        }catch(IOException exp){
            System.out.println("SOmething bad happened");
        }
        System.out.println(":::: finshed writing file");
    }

    public void countCities() {

        for (Person aPerson : personSet) {
            if (countCityMap.get(aPerson.getCity()) == null) {
                countCityMap.put(aPerson.getCity(), new Integer(1));
            } else {
                Integer count = countCityMap.get(aPerson.getCity());
                count = new Integer(count.intValue() + 1);
                countCityMap.put(aPerson.getCity(), count);
            }
        }
        System.out.println(":::::::::::::::::::::::::::::::::::");
        System.out.println("::::::  C I T Y   C O U N T :::::::");
        for (Map.Entry<String, Integer> anEntry : countCityMap.entrySet()) {
            System.out.println("City: " + anEntry.getKey() + " ::: count: " + anEntry.getValue());
        }
    }
}

//
//
//    public void printPersons(){
//
//        for(int i=0;i<persons.length;i++){
////            System.out.println("NULL??? : "+persons[i]);
//            System.out.println(persons[i].toString());
//        }
//    }
//
//

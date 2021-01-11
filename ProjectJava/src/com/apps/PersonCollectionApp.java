package com.apps;

import com.examples.FileExample;
import com.examples.PersonCollection;
import com.examples.PersonCollectionSet;
import com.examples.PersonCollectionSetFile;
import com.exceptions.NotValidStringAddress;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonCollectionApp {
    public static void main(String[] args) {

//        PersonCollection aCollection = new PersonCollection();
//
//        aCollection.populate();
//        aCollection.printPersons();
//        System.out.println("************************");
//        aCollection.countCities();
//
//        Set<String> personStringSet = new HashSet<String>();
//        //  some how if I can get data from file
//        FileExample anExample = new FileExample();
//        String fileName = "C:\\Users\\Jagadeesh\\Madhavi\\PersonFile.txt";
//        List<String> personStringList = anExample.readFile(fileName);

//       Transfering  the data from list to Set (for loop)
//        for (String string : personStringList){
//            personStringSet.add(string);
//        }
//
//        PersonCollectionSet aCollectionSet = new PersonCollectionSet(personStringSet);
//        aCollectionSet.populate();
//        aCollectionSet.printPersons();
//        System.out.println("************************");
//        aCollectionSet.countCities();


        PersonCollectionSetFile aCollectionSetFile = new PersonCollectionSetFile();
        aCollectionSetFile.populate();
        aCollectionSetFile.printPersons();
        System.out.println("************************");
        aCollectionSetFile.countCities();


    }
}

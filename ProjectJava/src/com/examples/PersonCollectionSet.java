package com.examples;

import com.domain.Person;
import com.exceptions.NotValidStringAddress;


import java.util.*;

public class PersonCollectionSet {

    private Set<String> personStringSet = new TreeSet<String>();
    private Map<String, Integer> countCityMap = new HashMap<String, Integer>();
    private Set<Person> personSet = new TreeSet<Person>();

//    private Person[] persons = new Person[5];
    public PersonCollectionSet(Set<String> newPersonStringSet) {

//        personStringSet.add("Sam,reddy,engineer,cary,40");
//        personStringSet.add("john,frost,accountant,morrisville,30");
//        personStringSet.add(",medes,driver,durham,25");
//        personStringSet.add("julie,,teacher,morrisville,32");
//        personStringSet.add("vijay,gali,Artist,Apex,34");
//        personStringSet.add("Mark,roy,dancer,apex,23");
//        personStringSet.add("George,reddy,artist,cary,36");
        personStringSet = newPersonStringSet;
    }

    public void populate() {

        for (String aString : personStringSet) {
            try {
                Person person = convertData(aString);
                personSet.add(person);
            } catch (NotValidStringAddress aExp) {
                System.out.println("This string address is not valid :::" + aString);
            }
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

        for (Person aPerson : personSet) {
            System.out.println(aPerson.toString());
        }
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



//    public void printPersons(){
//
//        for(int i=0;i<persons.length;i++){
////            System.out.println("NULL??? : "+persons[i]);
//            System.out.println(persons[i].toString());
//        }
//    }



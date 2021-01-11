package com.examples;

import com.domain.Person;
import com.exceptions.NotValidStringAddress;

public class PersonCollection {

    String[] personStrings = {"Sam,reddy,engineer,cary,40",
            "john,frost,accountant,morrisville,30",
            ",medes,driver,durham,25",
            "julie,,teacher,morrisville,32",
            "vijay,gali,painter,Apex,34",
            "Mark,roy,dancer,apex,23",
            "George,reddy,artist,cary,36"
    };

    private Person[] persons = new Person[5];

    int cary=0;
    int morrisville=0;
    int durham=0;
    int apex=0;

    public void populate(){

        int personcount =0;
        for(int i=0;i<personStrings.length;i++){
//            System.out.println("loop index value: "+i+" person string length: "+personStrings.length);
            try {

                persons[personcount] = convertData(personStrings[i]);
                personcount++;
            }catch(NotValidStringAddress  aExp){
                System.out.println("This string address is not valid :::" + personStrings[i]);

            }
        }
    }

    private Person convertData(String personString) throws NotValidStringAddress{

        String[] personSplits = personString.split(",");
        System.out.println("split total: "+personSplits.length);
        if( personSplits[0].isEmpty() || personSplits[1].isEmpty() || personSplits.length!=5){
//            System.out.println("ABOUT TO THROW");
            throw new NotValidStringAddress();
        }
        Person aPerson = new Person();
        aPerson.setFirstName(personSplits[0]);
        aPerson.setLastName(personSplits[1]);
        aPerson.setOccupation(personSplits[2]);
        aPerson.setCity(personSplits[3]);
        aPerson.setAge(personSplits[4]);

        return aPerson;
    }

    public void countCities(){

        for(int i=0;i<persons.length;i++){

            String city = persons[i].getCity();
            switch (city){
                case "cary":
                    cary++;
                    break;
                case "morrisville":
                    morrisville++;
                    break;
                case "durham":
                    durham++;
                    break;
                case "apex":
                    apex++;
                    break;

            }

        }

        System.out.println("The count in the cary:::  " +cary);
        System.out.println("The count in the morrisville:::  " +morrisville);
        System.out.println("The count in the apex:::  " +apex);
        System.out.println("The count in the durham:::  " +durham);

    }



    public void printPersons(){

        for(int i=0;i<persons.length;i++){
//            System.out.println("NULL??? : "+persons[i]);
            System.out.println(persons[i].toString());
        }
    }

}

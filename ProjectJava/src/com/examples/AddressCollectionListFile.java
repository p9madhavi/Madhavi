package com.examples;

import com.domain.Address;
import com.exceptions.NotValidStringAddress;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class AddressCollectionListFile {

    File addressFile = new File("C:\\Users\\Jagadeesh\\Madhavi\\AddressFile.txt");

    private Map<String, Integer> countCityMap = new HashMap<String, Integer>();
    private Map<String, Integer> countStateMap = new HashMap<String, Integer>();
//    private List<Address> addressList = new ArrayList<Address>();
//    private Set<Address> addressList = new HashSet<Address>();
    private List<Address> addressList = new ArrayList<Address>();

    public void populateData() {
        //   send a string to convert data and get Address
        // will give exception if it is not valid
//         int addressCount = 0;
        String gloabaString = null;

        try {
            List<String> addressStringList = FileUtils.readLines(addressFile, StandardCharsets.US_ASCII);

            for (String insidetryString : addressStringList) {
                gloabaString = insidetryString;
//             System.out.println("loop index value: "+i+" address string length: "+addressStrings.length);
                try {
                    Address address = convertData(gloabaString);
                    addressList.add(address);
                } catch (NotValidStringAddress aExp) {
                    System.out.println("This string address is not valid :::" + gloabaString);
                }
            }
        }catch (IOException aexp){
            System.out.println("My file is bad I need to give to different file");
        }
    }

    private Address convertData(String addressString) throws NotValidStringAddress {

        String[] addressSplits = addressString.split(",");
//         System.out.println("size of the splits: "+addressSplits.length);
        /// split
        if (addressSplits.length != 4 || addressSplits[2].isEmpty() || addressSplits[3].isEmpty()) {
//            System.out.println("about to throw exception");
            throw new NotValidStringAddress();
        }
        Address anAddress = new Address();
        anAddress.setName(addressSplits[0]);
        anAddress.setStreet(addressSplits[1]);
        anAddress.setCity(addressSplits[2].toUpperCase());
        anAddress.setState(addressSplits[3].toUpperCase());

        return anAddress;
    }

    public void printAddresses(){

       List<String> addressToWrite = new ArrayList<String>();
       for(Address anAddress: addressList){
           addressToWrite.add(anAddress.toString());
       }
        System.out.println("----ABOUT TO Write file-----");
        File outputFile = new File("C:\\Users\\Jagadeesh\\Madhavi\\AddressOutputFile.txt");
        try {
            FileUtils.writeLines(outputFile,addressToWrite,false);
            System.out.println("!!!!!!!About to Write!!!!!!!!!!!!!");
        }catch(IOException exp){
            System.out.println("SOmething bad happened");
        }
            System.out.println("----- finshed writing file------");
    }
///    public void printAddresses() {
//        for (Address anAddress : addressList) {
//            System.out.println(anAddress.toString());
//        }
//    }

    public void countCities() {

        List<String> cityCountToWrite = new ArrayList<String>();
        for (Address anAddress : addressList) {

            if (countCityMap.get(anAddress.getCity()) == null) {
                countCityMap.put(anAddress.getCity(), new Integer(1));

            } else {
                Integer count = countCityMap.get(anAddress.getCity());
                count = new Integer(count.intValue() + 1);
                countCityMap.put(anAddress.getCity(), count);
            }
        }
        System.out.println("----ABOUT TO Write countCities Output in the  file-----");
        File outputFile = new File("C:\\Users\\Jagadeesh\\Madhavi\\AddressOutputFile.txt");
        System.out.println(":::::::::::::::::::::::::::::::::::");
        System.out.println("::::::  C I T Y   C O U N T :::::::");
        for (Map.Entry<String, Integer> anEntry : countCityMap.entrySet()) {
//            System.out.println("City: " + anEntry.getKey() + " ::: count: " + anEntry.getValue());
            // City: <<>> ::: count: <<>>>
            String output = "City: " + anEntry.getKey() + " ::: count: " + anEntry.getValue();
            cityCountToWrite.add(output);
//            Another Way to write String Output ::::::::::::::
//            String newOutput = "".concat("City: ").concat(anEntry.getKey())
//                    .concat(" ::: count: ").concat(anEntry.getValue().toString());
//            cityCountToWrite.add(newOutput);


        }
        try {
            FileUtils.writeLines(outputFile,cityCountToWrite,true);
            System.out.println("!!!!!!!About to Write!!!!!!!!!!!!!");
        }catch(IOException exp){
            System.out.println("SOmething bad happened");
        }
        System.out.println("----- finshed writing file------");
    }

    public void countStates() {
        List<String> stateCountToWrite = new ArrayList<String>();
        for (Address anAddress : addressList) {
            if (countStateMap.get(anAddress.getState()) == null) {
                countStateMap.put(anAddress.getState(), new Integer(1));
            } else {
                Integer count = countStateMap.get(anAddress.getState());
                count = new Integer(count.intValue() + 1);
                countStateMap.put(anAddress.getState(), count);
            }
        }
        System.out.println("----ABOUT TO Write countStates Output in the  file-----");
        File outputFile = new File("C:\\Users\\Jagadeesh\\Madhavi\\AddressOutputFile.txt");
        System.out.println(":::::::::::::::::::::::::::::::::::");
        System.out.println("::::::  S T A T E   C O U N T :::::::");


        for(Map.Entry<String ,Integer> anEntry : countStateMap.entrySet()) {
//            System.out.println("State::: " + anEntry.getKey() + "  : count" + anEntry.getValue());
            String stateOutput ="State::: " + anEntry.getKey() + "  : count" + anEntry.getValue();
            stateCountToWrite.add(stateOutput);
        }
        try {
            FileUtils.writeLines(outputFile,stateCountToWrite,true);
            System.out.println("!!!!!!!About to Write!!!!!!!!!!!!!");
        }catch(IOException exp){
            System.out.println("SOmething bad happened");
        }
        System.out.println("----- finshed writing file------");

    }
}

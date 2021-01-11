package com.examples;

import com.domain.Address;
import com.exceptions.NotValidStringAddress;

import java.util.*;

public class AddressCollectionList {

    private List<String> addressStringList = new LinkedList<String>();
    private Map<String, Integer> countCityMap = new HashMap<String, Integer>();
    private Map<String, Integer> countStateMap = new HashMap<String, Integer>();
//    private List<Address> addressList = new ArrayList<Address>();
//    private Set<Address> addressList = new HashSet<Address>();
    private Set<Address> addressList = new TreeSet<Address>();

     public AddressCollectionList(List<String> newAddressStringList){
         addressStringList = newAddressStringList;
     }



//    public AddressCollectionList() {
//
//        addressStringList.add("sam,125 davis dr,cary,NC");
//        addressStringList.add("Robert,13 high dr,,NC");
//        addressStringList.add("John,225 morris dr,Durham,GA");
//        addressStringList.add("Siva,23 pleasant dr,durham,ga");
//        addressStringList.add("Reddy,578 shilloh dr,Cary,NC");
//        addressStringList.add("Mark,12 chapel dr,Morrisville,va");
//        addressStringList.add("Lisa,87 low dr,Durham,");
//    }

    //     private Address[] addresses = new Address[5];


    public void populateData() {
        //   send a string to convert data and get Address
        // will give exception if it is not valid
//         int addressCount = 0;
        for (String aString : addressStringList) {
//             System.out.println("loop index value: "+i+" address string length: "+addressStrings.length);
            try {
                Address address = convertData(aString);
//                 addressCount++;
                addressList.add(address);
            } catch (NotValidStringAddress aExp) {
                System.out.println("This string address is not valid :::" + aString);
            }
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

    public void printAddresses() {
        for (Address anAddress : addressList) {
            System.out.println(anAddress.toString());
        }
    }

    public void countCities() {

        for (Address anAddress : addressList) {

            if (countCityMap.get(anAddress.getCity()) == null) {
                countCityMap.put(anAddress.getCity(), new Integer(1));

            } else {
                Integer count = countCityMap.get(anAddress.getCity());
                count = new Integer(count.intValue() + 1);
                countCityMap.put(anAddress.getCity(), count);
            }
        }
        /**
         *    Map   ( (cary,2)
         *            (durham,2)
         *            (Morrisville, 1)
         *          )
         */
        System.out.println(":::::::::::::::::::::::::::::::::::");
        System.out.println("::::::  C I T Y   C O U N T :::::::");
        for (Map.Entry<String, Integer> anEntry : countCityMap.entrySet()) {
            System.out.println("City: " + anEntry.getKey() + " ::: count: " + anEntry.getValue());
        }

    }

    public void countStates() {

        for (Address anAddress : addressList) {
            if (countStateMap.get(anAddress.getState()) == null) {
                countStateMap.put(anAddress.getState(), new Integer(1));
            } else {
                Integer count = countStateMap.get(anAddress.getState());
                count = new Integer(count.intValue() + 1);
                countStateMap.put(anAddress.getState(), count);
            }
        }

        System.out.println("!!!! State Count!!!!!!!!!!");
        for(Map.Entry<String ,Integer> anEntry : countStateMap.entrySet()) {
            System.out.println("State::: " + anEntry.getKey() + "  : count" + anEntry.getValue());
        }

    }
}

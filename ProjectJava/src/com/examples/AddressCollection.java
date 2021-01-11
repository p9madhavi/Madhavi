package com.examples;

import com.domain.Address;
import com.exceptions.NotValidStringAddress;

public class AddressCollection {

     private String[] addressStrings = {
              "sam,125 davis dr,cary,NC",
              "Robert,13 high dr,,NC",
              "John,225 morris dr,Durham,GA",
              "Siva,23 pleasant dr,durham,ga",
              "Reddy,578 shilloh dr,Cary,NC",
              "Mark,12 chapel dr,Morrisville,va",
              "Lisa,87 low dr,Durham,"
      };
     private Address[] addresses = new Address[5];

     int cary=0;
     int durham=0;
     int morrisville=0;

     int nc=0;
     int ga=0;
     int va=0;

     public AddressCollection(){

     }

     public void populateData() {
         //   send a string to convert data and get Address
         // will give exception if it is not valid
         int addressCount = 0;
         for (int i = 0; i < addressStrings.length; i++) {
//             System.out.println("loop index value: "+i+" address string length: "+addressStrings.length);
             try {
                 addresses[addressCount] = convertData(addressStrings[i]);
                 addressCount++;
             } catch (NotValidStringAddress aExp) {
                 System.out.println("This string address is not valid :::" + addressStrings[i]);
             }
         }
     }

     private Address convertData(String addressString) throws NotValidStringAddress{

        String[] addressSplits = addressString.split(",");
//         System.out.println("size of the splits: "+addressSplits.length);
        /// split
        if(addressSplits.length!=4 || addressSplits[2].isEmpty() || addressSplits[3].isEmpty()){
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

     public void countCities(){

         for(int i=0;i< addresses.length;i++){

            String city = addresses[i].getCity();
             switch (city){
                 case "CARY":
                         cary++;
                         break;
                 case "DURHAM":
                     durham++;
                     break;
                 case "MORRISVILLE":
                     morrisville++;
                     break;
             }
         }
         System.out.println("The count in cary:::" + cary);
         System.out.println("The count in morrisville:::" +morrisville );
         System.out.println("The count in durham:::" + durham);

     }
     public void countStates(){

         for(int i=0;i<addresses.length;i++){
            String state = addresses[i].getState();
            switch (state){
                case "NC" :
                    nc++;
                    break;
                case "GA" :
                    ga++;
                    break;
                case "VA":
                    va++;
                    break;
            }
         }

         System.out.println("The Count in NC:::: " + nc);
         System.out.println("The count in GA:::: " +ga);
         System.out.println("The count in VA:::: " +va);

     }
    public void printAddresses(){

        for (int i=0; i<addresses.length;i++) {
            System.out.println(addresses[i].toString());
        }
    }
}

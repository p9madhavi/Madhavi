package com.apps;

import com.examples.AddressCollection;
import com.examples.AddressCollectionList;
import com.examples.AddressCollectionListFile;
import com.examples.FileExample;
import org.apache.commons.io.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class AddressCollectionApp {

    public static void main(String[] args) {

//        AddressCollection aCollection = new AddressCollection();
//        Used this appclass for Addresscollection,AddrescollectionList,AddressCollectionListFile


//            List<String> addressStringList = new ArrayList<String>();
//            FileExample aFileExample = new FileExample();
//            String fileName = "C:\\Users\\Jagadeesh\\Madhavi\\AddressFile.txt";
//            addressStringList =  aFileExample.readFile(fileName);
//
//
//        AddressCollectionList aCollectionList = new AddressCollectionList(addressStringList);

          AddressCollectionListFile aCollectionListFile = new AddressCollectionListFile();

            aCollectionListFile.populateData();
            aCollectionListFile.printAddresses();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");

            aCollectionListFile.countCities();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");

            aCollectionListFile.countStates();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        }
}

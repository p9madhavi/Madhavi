package com.apps;

import com.examples.AddressFileExample;

import java.util.List;

public class AddressFileExampleApp {

	public static void main(String[] args) {
		
		AddressFileExample anExample = new AddressFileExample();

		List<String> lines = anExample.readDataFromFile("C:\\Users\\Jagadeesh\\Madhavi\\AddressFile.txt");

		for(String line: lines){
			System.out.println(line);
		}
	}
}
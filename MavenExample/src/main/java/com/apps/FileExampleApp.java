package com.apps;

import com.examples.FileExample;
import java.util.List;

public class FileExampleApp{

	public static void main(String[] args) {
		
		FileExample anExample = new FileExample();

		List<String> lines = anExample.readDataFromFile("C:\\Users\\Jagadeesh\\Madhavi\\PersonFile.txt");

		for(String line: lines){
			System.out.println(line);
		}
	}
}
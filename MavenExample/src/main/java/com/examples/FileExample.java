package com.examples;

import java.util.List;
import org.apache.commons.io.FileUtils;
import java.nio.charset.StandardCharsets;
import java.io.File;
import java.io.IOException;

public class FileExample{

	public List<String> readDataFromFile(String fileName){

		List<String> returnLines = null;

		File aFile = new File(fileName);

		try{
			returnLines = FileUtils.readLines(aFile, StandardCharsets.UTF_8);
		}catch(IOException exp){
			System.out.println("bad file ");
		}

		return returnLines;
	}
}
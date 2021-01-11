package com.examples;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileExample {

    File myFile = new File("C:\\Users\\Jagadeesh\\Madhavi\\anyName.txt");

    public void readFile(){

        //    char set is the encoding used. since we use regular ascii values in txt we use ASCII charset
        List<String> lines = null;
        try {
            lines = FileUtils.readLines(myFile, StandardCharsets.US_ASCII);

            for(String line : lines){
                System.out.println(line);
            }
        } catch (IOException aexp) {
            System.out.println("My file is bad I need to give to different file");
        }
    }

    public void writeFile(){
        //    char set is the encoding used. since we use rgular ascii values in txt we use ASCII charset
        List<String> lines = new ArrayList<String>();

        lines.add("This is after write");
        lines.add("This is after write");

        try {
            FileUtils.writeLines(myFile, lines, false);

        } catch (IOException e) {
            System.out.println("There is something wrong about file");
        }
    }

    public List<String> readFile(String fileName){

        myFile = new File(fileName);
        //    char set is the encoding used. since we use regular ascii values in txt we use ASCII charset
        List<String> lines = null;
        try {
            lines = FileUtils.readLines(myFile, StandardCharsets.US_ASCII);

        } catch (IOException aexp) {
            System.out.println("My file is bad I need to give to different file");
        }
        return lines;
    }
}

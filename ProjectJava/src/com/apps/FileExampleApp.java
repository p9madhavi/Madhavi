package com.apps;

import com.examples.FileExample;

public class FileExampleApp {

    public static void main(String[] args) {

        FileExample anExample = new FileExample();

        anExample.readFile();

        anExample.writeFile();
        System.out.println("::::::: AFTER WRITE");
        anExample.readFile();
    }
}

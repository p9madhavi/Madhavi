package com.apps;

import com.examples.MapExample;

public class MapExampleApp {

    public static void main(String[] args) {
        MapExample anExample = new MapExample();

        anExample.demoAdd();
        System.out.println("*********************");
        anExample.demoGet();
        System.out.println("*********************");
        anExample.demoIterate();
    }
}

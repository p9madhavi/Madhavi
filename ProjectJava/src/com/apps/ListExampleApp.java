package com.apps;

import com.examples.ListExample;

public class ListExampleApp {

    public static void main(String[] args) {
        ListExample anExample = new ListExample();

        anExample.demoAdd();
        System.out.println("*********************");
        anExample.demoRemove();
        System.out.println("*********************");
        anExample.demoIsEmpty();
        System.out.println("*********************");
        anExample.demoAdd();
        System.out.println("*********************");
        anExample.demoIterate();
        System.out.println("*********************");
        anExample.demoContains();
        System.out.println("*********************");
        anExample.demoClear();



    }
}

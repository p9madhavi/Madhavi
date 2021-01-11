package com.apps;

import com.examples.SetExample;

public class SetExampleApp {
    public static void main(String[] args) {

        SetExample anExample = new SetExample();
        anExample.demoAdd();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        anExample.demoRemove();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        anExample.demoIsEmpty();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        anExample.demoAdd();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        anExample.demoContains();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        anExample.demoIterate();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        anExample.demoClear();


    }
}

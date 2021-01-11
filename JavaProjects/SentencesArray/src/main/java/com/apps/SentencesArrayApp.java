package com.apps;

import com.examples.SentencesArray;

import java.util.Scanner;

public class SentencesArrayApp {

    public static void main(String[] args) {

        SentencesArray anArray = new SentencesArray();
        anArray.showMenu();
//        System.out.println("Select Option from the menu:::");
        Scanner scan = new Scanner(System.in);
        String choice = "start";
         choice = scan.nextLine();


        while(!choice.equals("9")) {
            System.out.println("Select Option from the menu:::");

            switch(choice) {
                case "1":
                    anArray.enterSentence();
                    break;
                case "2":
                    anArray.printSentence();
                    break;
                case "3":
                    anArray.countSentences();
                    break;
                case "4":
                    anArray.printReverseSentences();
                    break;
                case "5":
                    int characterCount = anArray.printNumberOfCharacters();
                    System.out.println();
                    break;
                case "6":
                    int vowelCount = anArray.printNumberOfVowels();
                    break;
                case "9":
                    break;
                default:
                    System.out.println("Please enter a valid input");
                    break;
            }
        }
    }
}

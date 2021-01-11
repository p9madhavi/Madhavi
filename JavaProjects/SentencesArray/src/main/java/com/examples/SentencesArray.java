package com.examples;

import java.util.Scanner;

public class SentencesArray<findWord> {

    String[] sentences = new String[10];
    String vowel = "aeiou";

    public void showMenu(){

        System.out.println("This is the Sentence Menu");
        System.out.println("1.Enter a full sentence");
        System.out.println("2.Print out all sentences entered thus far in the given order");
        System.out.println("3.Print out the number of sentences that have been entered thus far");
        System.out.println("4.Print out all sentences entered thus far in the reverse order");
        System.out.println("5.the number of characters in all sentences combined");
        System.out.println("6.the total number of vowels contained in all stored sentences");
        System.out.println("7.search for a given word using case insensitive comparisons");
        System.out.println("8.search for a given word using case sensitive comparisons");
//        System.out.println("9.Enter Your Choice ::::::");
    }

    public void enterSentence(){
//        System.out.println("sentences length :" +sentences.length);
        try {
            Scanner scan = new Scanner(System.in);
//            System.out.println("sentences length :" +sentences.length);
            System.out.println("Enter Sentence : ");
            for(int i=0;i<sentences.length;i++) {
                sentences[i] = scan.nextLine();
            }
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array size is full,can not enter sentences");
        }
    }
    public void printSentence(){
        System.out.println("Sentences in the Array are::");
        for(int i=0;i<sentences.length;i++){
            System.out.println( (i+1) + " "+sentences[i]);
        }
    }
    public void countSentences(){
        System.out.println("The number of sentences that have been entered " + sentences.length);
    }
    public void printReverseSentences() {
        System.out.println("The Reverse order of Sentences are :: ");
//        for (int i = reverseSentences.length - 1; i >= 0; i--) {
//            System.out.println((i + 1) + " " + sentences[i]);
//        }
        for(int i=sentences.length-1;i>=0;i--){
            System.out.println((i + 1) + " " + sentences[i]);

        }
    }
    public int printNumberOfCharacters(){
        System.out.println("Printing NumberOfCharacters of Sentences Array :::");
        int charCount = 0;
        for(int i=0;i<sentences.length;i++) {
            String tempString = new String(sentences[i]);
//            System.out.println("the string is " + tempString);
            tempString = tempString.replaceAll("\\s","");
//            System.out.println("the string after tempstring is " + tempString);
            charCount = charCount +tempString.length();
//            System.out.println("the char count " + charCount);
        }
        System.out.println("The number of characters in all sentences combined " + charCount);
        return charCount;

    }

    public int printNumberOfVowels(){
        System.out.println(" the total number of vowels contained in all stored sentences.");
        int vowelCount = 0;
        for(int i=0;i<sentences.length;i++) {
            String tempString = new String(sentences[i]);
            for (int count = 0; count < tempString.length(); count++) {

                if (vowel.contains(String.valueOf(tempString.toLowerCase().charAt(count)))) {
                    vowelCount = vowelCount + 1;
                }
            }
//            System.out.println("the vowelcount of " + (i+1) + "  is " + vowelCount);
        }
            System.out.println("the vowelcount is " + vowelCount);
              return vowelCount;
    }
    public String searchWordCaseInsensitive(String searchWord){
//        System.out.println("Word Search Case Insensitive");
//        System.out.println("Enter the Word to Search:: ");
        String findWord = null;
        for(int i=0;i<sentences.length;i++){
            String[] tempString = sentences[i].split("\\s");
            System.out.println("temp string is "+ tempString);

                for(int j=0;j<tempString.length;j++){
                    System.out.println("temp string splits is "+ tempString[j]);
                    System.out.println("temp string splits lenght is "+ tempString.length);
                    if(searchWord == tempString[j]){
                        findWord = tempString[j];
                    }
                }

        }
        return findWord;
    }
}



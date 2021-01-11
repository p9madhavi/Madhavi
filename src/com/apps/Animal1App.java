package com.apps;

import com.beings.*;



public class Animal1App{

   public static void main(String[] args) {
   	   

   	   Dog aDog = new Dog();
   	   aDog.says();

   	   Cat aCat = new Cat();
         aCat.says();

   	   Human anHuman = new Human();
   	   anHuman.says();

       

   	   Animal1 anAnimal = new Dog();

   	   anAnimal.says();

   	   anAnimal = new Cat();

   	   anAnimal.says();

   	   anAnimal = new Human();

   	   anAnimal.says();




         Pet aDogPet = new Dog();
         aDogtPet.Petable(); 


         Pet aCatPet = new Cat();
         aCatPet.Petable(); 

          if(aDog.equals(aDog)){
               System.out.println("Accordoing to this code aDog is equal to aCat");

                }
             else{
               System.out.println("Accordoing to this code  aDog is not equal to aCat");
                 } 



         Dog someNewDog = new Dog();
         System.out.println("created a Dog with tail: "+someNewDog.getHasTail());
         boolean wantTail = false;
         Dog aSpecialDog = new Dog(wantTail);
         System.out.println("created a Dog with tail: "+aSpecialDog.getHasTail());




   }

}
package com.apps;

import com.beings.Animal;
import com.beings.Dog;

public class AnimalApp {

    public static void main(String[] args) {

        Animal anAnimal = new Dog();
        Animal newAnimal = new Dog();
        Animal tempAnimal = anAnimal;

        if(anAnimal.equals(newAnimal)){
            System.out.println("anAnimal is equal to newAnimal");
        }else{
            System.out.println("anAnimal is not equal to newAnimal");
        }

        if(anAnimal.equals(tempAnimal)){
            System.out.println("anAnimal is equal to newAnimal");
        }else{
            System.out.println("anAnimal is not equal to newAnimal");
        }
    }
}

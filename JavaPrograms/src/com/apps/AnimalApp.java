package com.apps;

import com.beings.Animal;
import com.beings.Dog;
import com.beings.Cat;
import com.beings.Cow;
import com.beings.Human;
import com.beings.Pet;

public class AnimalApp{

	public static void main(String[] args) {
		
       int animalLegs= 0;
       boolean hasTail= false;
       System.out.println("The Value Of animalLegs:  " + animalLegs);


		// Animal anAnimal =new Animal();

		// anAnimal.showProperty();
		// anAnimal.says();

		// animalLegs = anAnimal.noOfLegs;
		System.out.println("The Value Of animalLegs:  " + animalLegs);

		Dog aDog = new Dog();
		aDog.showProperty();
		aDog.says();


		Animal anAnimal = new Human();
		anAnimal.showProperty();
		anAnimal.says();


		// Pet aPet = new Pet();
		// aPet.petable();
		Pet aDogPet = new Dog();
		// aDogPet.says();
		aDogPet.petable();


		Pet aCatpet = new Cat();
		aCatpet.petable();
		aCatpet.isCute();


		anAnimal = new Cow();
		anAnimal.says();
		anAnimal.showProperty();


		



	}
}
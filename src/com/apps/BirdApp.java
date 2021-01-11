package com.apps;
import com.beings.Bird;
import com.beings.Parrot;
import com.beings.Penguin;
import com.beings.Crow;
import com.beings.SpecialBird;


public class BirdApp{

      public static void main(String[] args){

      	Parrot aParrot = new Parrot();
      	aParrot.sing();

      	Penguin aPenguin = new Penguin();
      	aPenguin.layEgg();

      	Crow aCrow = new Crow();
      	aCrow.fly();



      	Bird abird = new Parrot();
      	abird.fly();

      	abird = new Penguin();
      	abird.fly();

      	abird = new Crow();
      	abird.fly();

      	SpecialBird aSpecialParrot = new Parrot();
      	aSpecialParrot.sing();

      	aSpecialParrot.layEgg();





      }
}
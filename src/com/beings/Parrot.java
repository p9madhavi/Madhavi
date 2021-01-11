package com.beings;


public class Parrot extends Bird implements SpecialBird{

	public void fly(){
		System.out.println("Iam a Parrot and I can fly");
     }
	public void sing(){
		System.out.println("Im a parrot and I can sing a song");
	}
    
	public void layEgg(){
		System.out.println("Im a parrot and lays multiple eggs");
	}
}


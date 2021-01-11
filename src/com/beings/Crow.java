package com.beings;

public class Crow extends Bird implements SpecialBird{

	public void fly(){
		System.out.println("Im a Crow and I can fly too");
	}
	public void layEgg(){
		System.out.println("Im a crow and lays multiple eggs");
	}
	public void sing(){
		System.out.println("Im a Crow and I cannot sing a song");
	}	
	
}
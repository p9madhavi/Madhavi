package com.beings;


public class Penguin extends Bird implements SpecialBird{

	public void fly(){
		System.out.println("Im a Penguin and I can not fly ");
     }  
	public void layEgg(){
		System.out.println("Im a Penguin and lay a single Egg only at a time");
		
	}	
	public void sing(){
		System.out.println("Im a Penguin and I cannot sing a song");
	}
}
                                    
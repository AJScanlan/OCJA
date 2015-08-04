package com.ajscanlan.ocja.samples.inheritance;

public class Dog extends Animal{

	private static final String SOUND = "Woof";
	
	public Dog(){
		super();
	}
	
	public Dog(String name){
		super(name, Dog.SOUND);
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog sleeps...");
	}
}

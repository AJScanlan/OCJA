package com.ajscanlan.ocja.samples.inheritance;

public class Cat extends Animal{

	private static final String SOUND = "Meowth";
	
	public Cat(){
		super();
	}
	
	public Cat(String name){
		super(name, Cat.SOUND);
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleeps...");
	}

	@Override
	public void spawn() {
		// TODO Auto-generated method stub
		System.out.println("Cat respawned");
	}
	
	
}

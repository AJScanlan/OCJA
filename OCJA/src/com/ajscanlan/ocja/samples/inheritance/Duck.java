package com.ajscanlan.ocja.samples.inheritance;

public class Duck extends Animal{
	private static final String SOUND = "Quack";

	public Duck(){
		super();
	}

	public Duck(String name){
		super(name, Duck.SOUND);
	}

	@Override
	public void sleep() {
		System.out.println("Duck sleeps...");
	}
	
	@Override
	public void spawn() {
		// TODO Auto-generated method stub
		System.out.println("Duck respawned");
	}
	
}

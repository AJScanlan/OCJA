package com.ajscanlan.ocja.samples.inheritance;

public class Cat extends Animal{

//	private String name;
	private static final String SOUND = "Meowth";
	
	public Cat(){
		super();
	}
	
	public Cat(String name){
		super(name, Cat.SOUND);
	}
	
//	public void makeNoise(){
//		System.out.println(this.name + ": \"Meowth\"");
//	}
//	
//	@Override
//	public String toString(){
//		return "Name: " + this.name;
//	}
//	
}
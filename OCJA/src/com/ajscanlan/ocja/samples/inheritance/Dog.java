package com.ajscanlan.ocja.samples.inheritance;

public class Dog extends Animal{

//	private String name;
	private static final String SOUND = "Woof";
	
	public Dog(){
		super();
	}
	
	public Dog(String name){
		super(name, Dog.SOUND);
	}
	
//	public void makeNoise(){
//		System.out.println(this.name + ": \"Woof\"");
//	}
//	
//	@Override
//	public String toString(){
//		return "Name: " + this.name;
//	}
}

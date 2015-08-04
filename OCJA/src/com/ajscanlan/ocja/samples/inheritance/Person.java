package com.ajscanlan.ocja.samples.inheritance;

public class Person extends Animal{
	
	//private String name;
	private static final String SOUND = "AAAAAAAAGGGGGGGHHHHHHHHHH!!";
	
	public Person(){
		super();
	}
	
	public Person(String name){
		super(name, Person.SOUND);
	}
	
//	public void makeNoise(){
//		System.out.println(this.name + ": \"AAAAAAAAGGGGGGGHHHHHHHHHH!!\"");
//	}
//	
//	@Override
//	public String toString(){
//		return "Name: " + this.name;
//	}
	
}

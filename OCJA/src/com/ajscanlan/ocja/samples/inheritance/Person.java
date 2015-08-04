package com.ajscanlan.ocja.samples.inheritance;

public class Person {
	
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void makeNoise(){
		System.out.println("AAAAAAAAGGGGGGGHHHHHHHHHH!!");
	}
	
	@Override
	public String toString(){
		return "Name: " + this.name;
	}
	
}

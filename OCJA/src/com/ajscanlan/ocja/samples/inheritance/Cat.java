package com.ajscanlan.ocja.samples.inheritance;

public class Cat {

	private String name;
	
	public Cat(String name){
		this.name = name;
	}
	
	public void makeNoise(){
		System.out.println(this.name + ": \"Meowth\"");
	}
	
	@Override
	public String toString(){
		return "Name: " + this.name;
	}
	
}

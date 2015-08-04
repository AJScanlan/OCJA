package com.ajscanlan.ocja.samples.inheritance;

public abstract class Animal {
	private String name;
	private String sound;
	
	public Animal(){
		this("DefaultName", "DefaultSound");
	}
	
	public Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
	abstract public void sleep();
	
	public void makeNoise(){
		System.out.println(this.name + ": \"" + sound + "\"");
	}
	
	public void move(){
		System.out.println(this.name + " is moving...");
	}
	
	
	@Override
	public String toString(){
		return "Name: " + this.name;
	}
}

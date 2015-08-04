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
	
	public void makeNoise(){
		System.out.println(this.name + ": \"" + sound + "\"");
	}
	
	@Override
	public String toString(){
		return "Name: " + this.name;
	}
}

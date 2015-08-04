package com.ajscanlan.ocja.samples.inheritance;

public class InheritApp {

	public static void main(String[] args) {
		new InheritApp().runProgram();
	}

	private void runProgram() {
		
		Person alex = new Person("Alex");
		
		makeSomeNoisePeople(alex);
		
		Cat meowth = new Cat("Meowth");
		
		this.makeSomeNoiseCats(meowth);
		
	}

	private void makeSomeNoisePeople(Person p) {
		p.makeNoise();
	}

	private void makeSomeNoiseCats(Cat c){
		c.makeNoise();
	}
	
}

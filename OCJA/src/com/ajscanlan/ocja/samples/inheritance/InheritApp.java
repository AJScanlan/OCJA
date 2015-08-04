package com.ajscanlan.ocja.samples.inheritance;

public class InheritApp {

	public static void main(String[] args) {
		new InheritApp().runProgram();
	}

	private void runProgram() {
		
		Person alex = new Person("Alex");
		
		this.makeSomeNoise(alex);
		
		Cat meowth = new Cat("Meowth");
		
		this.makeSomeNoise(meowth);
		
		Dog dog = new Dog("Taz");
		
		this.makeSomeNoise(dog);
		
		Person def = new Person();
		
		this.makeSomeNoise(def);
		
	}

	private void makeSomeNoise(Animal a) {
		a.makeNoise();
	}

//	private void makeSomeNoiseCats(Cat c){
//		c.makeNoise();
//	}
//	
//	private void makeSomeNoiseDogs(Dog d){
//		d.makeNoise();
//	}
}

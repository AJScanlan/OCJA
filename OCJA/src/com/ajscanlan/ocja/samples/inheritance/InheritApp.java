package com.ajscanlan.ocja.samples.inheritance;

public class InheritApp {

	public static void main(String[] args) {
		new InheritApp().runProgram();
	}

	private void runProgram() {
		
		//testing person
		Person alex = new Person("Alex");
		this.makeSomeNoise(alex);
		
		//testing cat
		Cat meowth = new Cat("Meowth");
		this.makeSomeNoise(meowth);
		
		//testing dog
		Dog dog = new Dog("Taz");
		this.makeSomeNoise(dog);

		//testing no args
		Person def = new Person();
		this.makeSomeNoise(def);
		
		//testing dog
		Duck duck = new Duck("Don");
		this.makeSomeNoise(duck);
	}

	private void makeSomeNoise(Animal a) {
		a.makeNoise();
	}

	
	//deprecated methods
//	private void makeSomeNoiseCats(Cat c){
//		c.makeNoise();
//	}
//	
//	private void makeSomeNoiseDogs(Dog d){
//		d.makeNoise();
//	}
}

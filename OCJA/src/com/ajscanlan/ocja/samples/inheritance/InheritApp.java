package com.ajscanlan.ocja.samples.inheritance;

public class InheritApp {

	public static void main(String[] args) {
		new InheritApp().runProgram();
	}

	private void runProgram() {
		
		//testing person
		Person alex = new Person("Alex");
		this.makeSomeNoise(alex);
		this.moveIt(alex);
		this.sleep(alex);
		this.respawn(alex);
		
		//testing cat
		Cat meowth = new Cat("Meowth");
		this.makeSomeNoise(meowth);
		this.moveIt(meowth);
		this.sleep(meowth);
		this.respawn(meowth);
		
		//testing dog
		Dog dog = new Dog("Taz");
		this.makeSomeNoise(dog);
		this.moveIt(dog);
		this.sleep(dog);
		this.respawn(dog);

		//testing no args
		Person def = new Person();
		this.makeSomeNoise(def);
		this.moveIt(def);
		this.sleep(def);
		this.respawn(def);
		
		//testing duck
		Duck duck = new Duck("Don");
		this.makeSomeNoise(duck);
		this.moveIt(duck);
		this.sleep(duck);
		this.respawn(duck);
		
	}

	private void makeSomeNoise(Animal a) {
		a.makeNoise();
	}

	private void moveIt(Animal a){
		a.move();
	}
	
	private void sleep(Animal a){
		a.sleep();
	}
	
	private void respawn(Spawnable sp){
		sp.spawn();
	}
	
}

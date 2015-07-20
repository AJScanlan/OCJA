package com.ajscanlan.ocja.samples;

public class MethodMan {

	String name = "Clifford Smith";
	int age = 44;
	
	public static void main(String[] args) {
		MethodMan methodMan = new MethodMan();
		methodMan.printDetails();
		methodMan.setDetails("Method Man", 21);
		methodMan.printDetails();
	}

	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	private void printDetails(){
		System.out.println("Name: " + name + "\nAge: " + age);
	}
	
	private void setDetails(String name, int age){
		this.age = age;
		this.name = name;
	}
}

package com.ajscanlan.ocja.samples;

public class ChildClass extends ParentClass {
	public ChildClass(){
		System.out.println("ChildClass Constructor");
	}
	
	public ChildClass(String s){
		System.out.println("ChildClass Constructor " + s);
	}
	
	public static void main(String[] args){
		ChildClass childClass1 = new ChildClass();
		ChildClass childClass2 = new ChildClass("Hello");
	}
}

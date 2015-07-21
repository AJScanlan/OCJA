package com.ajscanlan.ocja.samples;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person me = new Person(null, 0);
		Person you = new Person(null, 0);
		
		me.setAge(23);
		you.setAge(40);
		
		me.setName("Alex");
		you.setName("Whatever");
		
		System.out.println(me.getName() + ", " + me.getAge());
		System.out.println(you.getName() + ", " + you.getAge());
	}

}

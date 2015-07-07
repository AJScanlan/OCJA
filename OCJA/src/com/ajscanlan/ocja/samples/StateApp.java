package com.ajscanlan.ocja.samples;

public class StateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateApp sa = new StateApp();
		sa.doStuff();
	}

	private void doStuff() {
		// TODO Auto-generated method stub
		int age = 24;
//		System.out.println(++age);
//		System.out.println(--age);
		
		if(age > 18 && age < 200) System.out.println(age);
	
	}

}

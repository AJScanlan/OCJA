package com.ajscanlan.ocja.samples;

public class LawnMowerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LawnMower lawnMower = new LawnMower();
		System.out.println("Engine is on: " + lawnMower.isEngineOn());
		lawnMower.setEngine(true);
		System.out.println("Engine is on: " + lawnMower.isEngineOn());
	}

}

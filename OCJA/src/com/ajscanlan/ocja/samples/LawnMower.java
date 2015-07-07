package com.ajscanlan.ocja.samples;

public class LawnMower {
	//State
	private boolean engineOn = false;
	enum engineType{PETROL, ELECTRIC, HYBRID, NONE}
	
	@SuppressWarnings("unused")
	private String color = "not set";
	
	//Behaviour
	public boolean isEngineOn() {
		return engineOn;
	}
	
	public void setEngine(boolean engineOn) {
		this.engineOn = engineOn;
	}
}

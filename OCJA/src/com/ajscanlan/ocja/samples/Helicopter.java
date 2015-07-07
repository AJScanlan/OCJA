package com.ajscanlan.ocja.samples;

public class Helicopter {
	//State
	private double currentAltitude;
	private static final double FEET_TO_METER_RATIO = 0.3048;
	
	//Behaviour
	public void setAltitude(double newAltitude){
		this.currentAltitude = newAltitude;
	}
	
	/**
	 * @deprecated Use getAltitudeInFeet instead
	 * @return
	 */
	public double getAltitude(){
		return this.currentAltitude;
	}
	
	public double getAltitudeInFeet(){
		return this.currentAltitude;
	}
	
	public double getAltitudeInMeters(){
		return (this.getAltitudeInFeet() * FEET_TO_METER_RATIO);
	}
	
	public void getToDaChoppah(){
		System.out.println("GET TO THE CHOPPER");
	}
}

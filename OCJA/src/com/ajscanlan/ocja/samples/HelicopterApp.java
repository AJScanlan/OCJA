package com.ajscanlan.ocja.samples;

public class HelicopterApp {

	@SuppressWarnings("deprecation")
	
	public static void main(String[] args) {
		Helicopter chopper = new Helicopter();
		chopper.setAltitude(6);
		System.out.println(chopper.getAltitude() + " in feet");
		System.out.println(chopper.getAltitudeInMeters() + " in meters");
		chopper.getToDaChoppah();
	}

}

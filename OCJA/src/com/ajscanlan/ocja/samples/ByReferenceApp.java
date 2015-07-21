package com.ajscanlan.ocja.samples;

public class ByReferenceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByReferenceApp ra = new ByReferenceApp();
		Car myCar = new Car();
		System.out.println(myCar.getModel());
		ra.changeCar(myCar);
		System.out.println(myCar.getModel());
	}

	private void changeCar(Car car) {
		// TODO Auto-generated method stub
		car.setModel("Veyron");
	}

}

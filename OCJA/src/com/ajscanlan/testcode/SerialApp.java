package com.ajscanlan.testcode;

import java.io.Serializable;
import java.util.Scanner;

public class SerialApp {

	private String name;


	public static void main(String[] args) {
	
		new SerialApp().runApp();
		
	}


	private void runApp() {
		
		Scanner scan = new Scanner(System.in);

		name = scan.nextLine();
		
		System.out.println(name);
		
	}

}

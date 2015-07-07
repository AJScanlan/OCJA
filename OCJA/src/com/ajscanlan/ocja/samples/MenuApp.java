package com.ajscanlan.ocja.samples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScannerDarkly = new Scanner(System.in);
		int choice = 0;
		boolean quit = false;

		while(!quit){

			//choice = 0;
			
			System.out.println("1) Enter your name");
			System.out.println("2) Enter your age");
			System.out.println("3) Quit");

			try {
				choice = aScannerDarkly.nextInt();
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Please enter valid choice");
			}

			if(choice == 1){
				System.out.println("Please enter your name: ");
				String name = aScannerDarkly.next();
				System.out.println("Your name is: " + name);
			} else if(choice == 2){
				System.out.println("Please enter your age");
				int age = 0;
				try {
					age = aScannerDarkly.nextInt();
					System.out.println("Your age is: " + age);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("Please enter a valid age");
				}
			} else if(choice == 3){
				//aScannerDarkly.close();
				quit = true;
			}
			
		}
	}

}

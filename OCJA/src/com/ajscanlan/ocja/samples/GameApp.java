package com.ajscanlan.ocja.samples;

import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		boolean playing = true;
		
		do{
			int lives = GameApp.inputInt("Please input lives (Or enter 0 to quit)");
			
			if(lives == 0) playing = false;

			while(lives > 0){
				System.out.println("Lives remaining: " + lives);
				--lives;
			}

			System.out.println("GAME OVER");
		} while(playing);
	}

	public static int inputInt(String prompt){
		Scanner scan = new Scanner(System.in);
		System.out.println(prompt);
		int temp = Integer.parseInt(scan.nextLine());
		//scan.close();
		return temp;
	}

	public static int inputInt(String prompt, int lowEnd, int highEnd){
		Scanner scan = new Scanner(System.in);
		System.out.println(prompt);
		int temp = Integer.parseInt(scan.nextLine());

		if(temp < lowEnd || temp > highEnd){
			//System.out.println("Please input a number between " + lowEnd + " and " + highEnd + " (inclusive)");
			scan.close();
			throw new NumberFormatException();
			//turn -1;
		} else {
			scan.close();
			return temp;	
		}
	}







}

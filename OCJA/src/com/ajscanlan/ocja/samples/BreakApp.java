package com.ajscanlan.ocja.samples;

public class BreakApp {

	public static void main(String[] args) {
		
		int numToFind = GameApp.inputInt("Please enter the number you want to find: ");

		for(int i =1; i < 101; ++i){
			if(i == numToFind){ 
				System.out.println("Number found: " + i);
				break;
			} else{
				for(int j = 0; j < 10; ++j){
					System.out.println(i + "." + j);
				}
			}
		}
	}
}



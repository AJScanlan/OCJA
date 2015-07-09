package com.ajscanlan.ocja.samples;

public class ContinueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = GameApp.inputInt("Enter 1 for even numbers \nEnter 2 for odd numbers");
		
		if(choice == 1){
			for(int i = 1; i < 101; ++i){
				if((i%2) == 1){
					continue;
				} else {
					System.out.println(i);
				}
			}
		} else {
			for(int i = 1; i < 101; ++i){
				if((i%2) == 0){
					continue;
				} else {
					System.out.println(i);
				}
			}
		}
	}

}

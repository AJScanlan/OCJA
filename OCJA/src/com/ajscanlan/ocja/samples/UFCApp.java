package com.ajscanlan.ocja.samples;

import java.util.Scanner;

public class UFCApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String weightChoice;
		String weightStr = "";
		double weight = 0.0D;
		int choice = 0;
		String choiceStr = "";
		boolean valid = false;

		System.out.println("1) use kg");
		System.out.println("2) use lb");

		do{
			try {
				System.out.print("Please choose: ");
				choiceStr =  scan.next();
				choice = Integer.parseInt(choiceStr);
				if(choice == 1 || choice == 2){
					valid = true;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Please choose a valid number");
			}
		}while(!valid);

		valid = false;
				
		if(choice == 1) {
			weightChoice = "kg";
		} else {
			weightChoice = "lb";
		}

		
		do {
			try {
				System.out.print("Please enter weight (in " + weightChoice+ "s): ");
				weightStr = scan.next();
				weight = Double.parseDouble(weightStr);
				valid = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Please choose a valid number");
			}
		}while(!valid);

		if(choice == 1){
			weight = weight * 2.2;
			System.out.println(weight);
		}

		if(weight < 145){
			System.out.println("Your dont qualify for any division");

		}else if(weight <= 155){
			System.out.println("Your category is Lightweight");

		}else if( weight <= 170){
			System.out.println("Your category is Welterweight");

		}else if(weight <= 185){
			System.out.println("Your category is Middleweight");

		}else if(weight <= 205){
			System.out.println("Your category is Light heavyweight");
		}
		else if (weight <= 265){
			System.out.println("Your category is Heavyweight");

		}else{
			System.out.println("Your dont qualify for any division");
		}
	
		scan.close();
	}

}

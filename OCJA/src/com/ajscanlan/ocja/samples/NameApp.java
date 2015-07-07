package com.ajscanlan.ocja.samples;

import java.util.Scanner;

public class NameApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runApp();
	}

	private static void runApp() {
		// TODO Auto-generated method stub
		
//		System.out.println("Alex Scanlan");
//		System.out.println("Alex Scanlan");
//		System.out.println("Alex Scanlan");
//		System.out.println("Alex Scanlan");
//		System.out.println("Alex Scanlan");
//		System.out.println("Alex Scanlan");
//		System.out.println("Alex Scanlan");
//		System.out.println("Alex Scanlan");
//		System.out.println("Alex Scanlan");
//		System.out.println("Alex Scanlan");
		
		
		Scanner scan = new Scanner(System.in);	
		String[] names = {"John", "Jacob", "Jingleheimer", "Schmidt"};
		
//		String name;
//		System.out.print("Please input your name: ");
//		name = scan.nextLine();
//		
//		StringBuilder sb = new StringBuilder(name);
//		name = sb.reverse().toString();
//		
//		
//		for(int i = 0; i < 100; ++i){
//			System.out.println(name + " " + i);
//		}
		
		for(String s : names){
			System.out.println(s);
		}
		
		scan.close();
	}

}

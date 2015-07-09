package com.ajscanlan.ocja.samples;

public class LabelApp {

	public static void main(String[] args) {
		outer:
			for(int i = 0; i < 8; ++i){
				inner:
				for(int j = 0; j < 2;){
					for(int k = 0; k < 9;){
						System.out.println("inner");
						break inner;
					}
					System.out.println("Hello");
					continue outer;
				}
				System.out.println("outer");
			}
		System.out.println("Goodbye");
	}
	

}

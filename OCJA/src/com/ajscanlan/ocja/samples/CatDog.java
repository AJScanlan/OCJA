package com.ajscanlan.ocja.samples;

public class CatDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(catDog("defefcatdwadogadwadadogdwadsdogcfedewacat"));
	}


	public static boolean catDog(String str) {
		int catCount = 0;
		int dogCount = 0;
		boolean catDog = false;
		String temp = str;
		
		while(temp.indexOf("cat") != -1){
			catCount++;
			temp = temp.substring(temp.indexOf("cat") + 3, temp.length());
			System.out.println(temp);
		}

		temp = str;
		
		while(temp.indexOf("dog") != -1){
			dogCount++;
			temp = temp.substring(temp.indexOf("dog") + 3, temp.length());
		}

		
		if(catCount == dogCount) catDog = true;
		return catDog;

	}
}

package com.ajscanlan.ocja.samples;

public class ReplaceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace("Hello"));
	}

	private static String replace(String str) {

		if(!str.equals("")){
			char firstChar = str.charAt(0);
			char lastChar = str.charAt(str.length() -1);

			return lastChar + str.substring(1, str.length() -1) + firstChar;
			
		} else {
			return str;
		}
	}

}

package com.ajscanlan.ocja.samples;

public class CodingBat {

	public static void main(String[] args) {
		CodingBat cb = new CodingBat();
		cb.go("Hello there", "llo");;
	}

	private String go(String base, String remove) {
		
		String temp = "";
		temp = base;
		//temp = temp.toLowerCase();
		temp = temp.replace(remove, "");
		System.out.println(temp);
		return temp;
	}

}

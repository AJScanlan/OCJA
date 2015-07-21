package com.ajscanlan.ocja.samples;

public class PassByPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		PassByPrimitive pbv = new PassByPrimitive();
		System.out.println(num);
		pbv.method(num);
		System.out.println(num);
	}

	private void method(int num) {
		System.out.println(num);
		num++;
		System.out.println(num);
	}

}

package com.ajscanlan.ocja.samples;

public class ArrayException {

	int[] arr = new int[5000000];
	long startTime = System.currentTimeMillis();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayException ae = new ArrayException();
		ae.doStuff();
		ae.printStuff();
	}

	private void printStuff() {
		// TODO Auto-generated method stub
//		for(int i = 0; i < arr.length; ++i){
//		//	try{
//				System.out.println(arr[i]);
////			} catch (ArrayIndexOutOfBoundsException e){
////				break;
////			}
//		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	private void doStuff() {
		// TODO Auto-generated method stub

		for(int i = 0;; ++i){
			try{
				arr[i] = i;
			//	System.out.println(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e){
				break;
			}
		}
	}

}

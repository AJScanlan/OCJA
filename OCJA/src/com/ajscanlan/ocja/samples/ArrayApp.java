package com.ajscanlan.ocja.samples;

import java.util.Random;

public class ArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int[] modeArr = new int[10];
		Random randy = new Random();
		int sum = 0, mean, mode, median;

		for(int i = 0; i < arr.length; ++i){
			arr[i] = randy.nextInt(99) + 1;
			System.out.println(arr[i]);
			sum += arr[i];
		}

		int max = arr[0], min = arr[0];
		mode = 0;
		for(int i = 0; i < arr.length; ++i){
			mode = arr[i];
			for(int j = i+1; j < arr.length; ++j){
				if(mode == arr[j]){
					modeArr[i]++;
				}
			}
		}

		mode = 0;

		for(int i = 0; i < arr.length; ++i){
			if(min > arr[i]) min = arr[i];
			if(max < arr[i]) max = arr[i];
			if(mode < modeArr[i]) mode = arr[i];
		}

		mean = sum / arr.length;
		median = (arr.length + 1) / 2;
		System.out.println("Mean: " + mean);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Median: " + median);
		if(mode == 0){
			System.out.println("No valid mode");
		} else {
			System.out.println("Mode: " + mode);
		}
	}

}

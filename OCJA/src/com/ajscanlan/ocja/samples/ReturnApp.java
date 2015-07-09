package com.ajscanlan.ocja.samples;

public class ReturnApp {

	public static void main(String[] args) {
		System.out.println(isEven(6));
	}

	private static boolean isEven(int i) {
		return (i%2 == 0);
	}

//	static boolean isPrime(int n) {
//		
//	    if (n%2==0) return false;
//	    
//	    for(int i=3;i*i<=n;i+=2) {
//	    	
//	        if(n%i==0)
//	        	
//	            return false;
//	        
//	    }
//	    
//	    return true;
//	    
//	}

}

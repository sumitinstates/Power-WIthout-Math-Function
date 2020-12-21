package com.sumit;

public class PowerWithoutMath {
	
	static int base = 3;
	static int expo = 4;
	static int count = 0;
	static int result = 1;
	
	public static void main(String[] args) {
		
		while(count < expo) {
			result = result * base;
			count++;
		}
		
		System.out.println(base + " to the power " + expo + " is " + result);
	}	

}

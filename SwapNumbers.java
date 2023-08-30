package com.practice.operators;

public class SwapNumbers {
	public static void main(String[] args) {
		int a = 50;
		int b = 100;
		
	    // swap using temp varible 
		 //int temp =a;
		 //a = b;
		 //b = temp;
		
		//swap without using temp variable
		a =a+b;
		b =a-b;
		a =a-b;
		
		 System.out.println("a :"+a);
		 System.out.println("b :"+b);
		 
	}
	

}
